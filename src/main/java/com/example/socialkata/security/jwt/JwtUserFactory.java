package com.example.socialkata.security.jwt;

import com.example.socialkata.model.entity.user.Role;
import com.example.socialkata.model.entity.user.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {

    public JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(
                user.getUserId(),
                user.getUsername(),
                user.getFirstName(),
                user.getLastName(),
                user.getPassword(),
                user.getEmail(),
                user.isEnabled(),              //todo not such as in video
                user.getAuthorities());
    }

    //todo метод уже реализован в user
//    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Role> userRoles) {
//        return userRoles.stream().map(role -> new SimpleGrantedAuthority(role.getName()))
//                .collect(Collectors.toList());
//    }
}
