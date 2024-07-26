package com.ust.Security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((authorize) -> authorize
                        .anyRequest().authenticated())
                        .httpBasic(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("Aman")
                .password("123")
                .roles("admin")
                .build();

        System.out.println(admin.getPassword());
        System.out.println(admin.getUsername());

        UserDetails user1 = User.withDefaultPasswordEncoder()
                .username("Sai")
                .password("123")
                .roles("user")
                .build();

        UserDetails user2 = User.withDefaultPasswordEncoder()
                .username("Tushar")
                .password("123")
                .roles("user")
                .build();

        return new InMemoryUserDetailsManager(user1, user2,admin);
    }
}
