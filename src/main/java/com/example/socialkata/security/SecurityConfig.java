/**
 * Сделал минимальную настройку по безопасности
 * Предварительно работа настроена через In-Memory с двумя пользователями
 * Для полноценной настройки security нужны UserService и Controller
 */

package com.example.socialkata.security;

import com.example.socialkata.security.jwt.JwtConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private static final String ADMIN_ENDPOINT = "/admin/**";
    private static final String USER_ENDPOINT = "/api/user";
    private static final String LOGIN_ENDPOINT = "/api/auth/login";

    private final UserDetailsService userDetailsService;
    private final JwtConfigurer jwtConfigurer;

    public SecurityConfig(@Qualifier("custom") UserDetailsService userDetailsService, JwtConfigurer jwtConfigurer) {
        this.userDetailsService = userDetailsService;
        this.jwtConfigurer = jwtConfigurer;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                //.httpBasic().disable() //добавлено в конфигурацию
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)  //не создаем сессию
                .and()
                .authorizeRequests()
                .antMatchers(LOGIN_ENDPOINT).permitAll()
                .antMatchers("/my_page/**").authenticated()
                .antMatchers(ADMIN_ENDPOINT).hasRole("ADMIN")
                .antMatchers(USER_ENDPOINT).hasAnyRole("USER", "ADMIN")
//              .anyRequest().authenticated()
                .and()
                .apply(jwtConfigurer) //добавлено в конфигурацию
                .and()
                .formLogin();
    }
    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder(12);
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public DaoAuthenticationProvider authProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(encoder());
        return authProvider;
    }
}
