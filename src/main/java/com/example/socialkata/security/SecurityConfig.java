/**
 * Сделал минимальную настройку по безопасности
 * Предварительно работа настроена через In-Memory с двумя пользователями
 * Для полноценной настройки security нужны UserService и Controller
 */

package com.example.socialkata.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final UserDetailsService userDetailsService;

    public SecurityConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/my_page/**").authenticated()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/api/user").hasAnyRole("USER", "ADMIN")
//              .anyRequest().authenticated()
                .and()
                .formLogin()
//                .successHandler(successUserHandler)  //если решим перекидывать пользователя куда-то, например, для заполнения профиля
//                .permitAll()
                .and()
                .logout().logoutSuccessUrl("/")
                .permitAll();
    }
    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(encoder());
        return authProvider;
    }
}
