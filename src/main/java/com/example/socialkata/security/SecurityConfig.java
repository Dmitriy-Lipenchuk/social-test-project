/**
 * Сделал минимальную настройку по безопасности
 * Предварительно работа настроена через In-Memory с двумя пользователями
 * Для полноценной настройки security нужны UserService и Controller
 */

package com.example.socialkata.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//    private final UserService userService;
//
//    @Autowired
//    public SecurityConfig(UserService userService) {
//        this.userService = userService;
//    }

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
                .permitAll()
                .and()
                .logout().logoutSuccessUrl("/")
                .permitAll();
    }

    /**
     * In-Memory
     * Сделал две учетки в In-Memory для работы на первоначальном этапе,
     * как настроим БД переключимся на DAO-аутентификацию
     * Две учетные записи (логин и пароль совпадают): admin, user
     * использовал bcrypt = 10
     * @return
     */
    @Bean
    public UserDetailsService users () {
        UserDetails user = User.builder()
                .username("user")
                .password("{bcrypt}$2a$10$fOl4/TWueVB0xPhEBaBMAOx7MHf6oUX5fomJkGB4gRuOmluc2pAXS")
                .roles("USER")
                .build();

        UserDetails admin = User.builder()
                .username("admin")
                .password("{bcrypt}$2a$10$wlFRjV9g.F8yUhOBGUwqie6DQj39W6PsWJoPJTQT/CbSSSh.5E50S")
                .roles("ADMIN", "USER")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }

    /**
     * DaoAuthentication
     * Получение информации о логине и пароле пользователя на основе нашего класса User
     * Для использования данного метода нужно создать UserService, пока не работает
     * @return
     */
//    public DaoAuthenticationProvider daoAuthenticationProvider () {
//        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//        authenticationProvider.setPasswordEncoder(bCryptPasswordEncoder());
//        authenticationProvider.setUserDetailsService(userService);
//
//        return authenticationProvider;
//    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
