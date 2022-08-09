package com.example.socialkata.security.jwt;

import com.example.socialkata.model.entity.user.Role;
import com.example.socialkata.model.entity.user.User;
import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;

/**
 * todo make comment about this class
 */

@Component
public class JwtTokenProvider {

    //@Value("${jwt.token.secret}")
    @Value("kata")
    private String secretWord;

    //@Value("${jwt.token.expired}")
    @Value("3600000")
    private long lengthTokenLife;

    @Qualifier("jwtUserDetailsService")
    @Autowired
    private UserDetailsService userDetailsService;

//    @Autowired
//    private PasswordEncoder passwordEncoder;  //todo in video another realisation

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @PostConstruct
    protected void init() {
        secretWord = Base64.getEncoder().encodeToString(secretWord.getBytes());
    }

    public String createToken(String username) {
        User user = (User) userDetailsService.loadUserByUsername(username);

        Claims claims = Jwts.claims().setSubject(username);
        //claims.put("roles", getRoleNames(roles)); //убрал метод, тк у нас 1 роль на юзера
        claims.put("roles", user.getRole().getName());

        Date now = new Date();
        Date validity = new Date(now.getTime() + lengthTokenLife);

        return Jwts.builder().setClaims(claims).setIssuedAt(now).setExpiration(validity)
                .signWith(SignatureAlgorithm.HS256, secretWord).compact();
    }

    public Authentication getAuthentication(String token) {
        String username = getUsername(token);
        UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
        return new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());
    }

    public String getUsername(String token) {
        return Jwts.parser().setSigningKey(secretWord).parseClaimsJws(token).getBody().getSubject();
    }

    public String resolveToken(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        if (bearerToken != null && bearerToken.startsWith("Bearer_")) {
            return bearerToken.substring(7, bearerToken.length());
        }
        return null;
    }

    public boolean validateToken(String token) {
        try {
            Jws<Claims> claims = Jwts.parser().setSigningKey(secretWord).parseClaimsJws(token);

            if (claims.getBody().getExpiration().before(new Date())) {
                return false;
            }

            return true;
        } catch (JwtException | IllegalArgumentException e) {
            throw new JwtAuthenticationException("JWT token is expired or invalid");
        }
    }
//    метод не нужен, тк у нас одна роль на юзера
//    private List<String> getRoleNames(List<Role> userRoles) {
//        List<String> result = new ArrayList<>();
//
//        userRoles.forEach(role -> {result.add(role.getName());});
//
//        return result;
//    }
}
