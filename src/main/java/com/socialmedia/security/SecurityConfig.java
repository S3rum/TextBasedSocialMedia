package com.socialmedia.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
<<<<<<< HEAD
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.config.Customizer;
=======
>>>>>>> origin/main
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.oauth2.jwt.Jwt;
<<<<<<< HEAD
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;



=======


import static org.springframework.security.config.Customizer.withDefaults;
>>>>>>> origin/main


@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests((authz) -> authz
                        .antMatchers("/error").permitAll()
                        .antMatchers("/api/login/**", "/api/token/refresh/**").permitAll()
                        .anyRequest().authenticated()
                )
<<<<<<< HEAD
                .formLogin( Customizer.withDefaults())
=======
                .formLogin( withDefaults())
>>>>>>> origin/main
                .oauth2ResourceServer((oauth2) -> oauth2
                        .jwt((jwt) -> jwt
                                .jwtAuthenticationConverter(jwtAuthenticationConverter())
                        )
                );
        return http.build();
    }

<<<<<<< HEAD


=======
>>>>>>> origin/main
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web
                .ignoring().antMatchers("/css/**", "/js/**", "/images/**")
                .and()
                .debug(true);
    }

    // other beans and methods
}
