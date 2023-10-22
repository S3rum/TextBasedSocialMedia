package com.socialmedia.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;





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
                .formLogin( Customizer.withDefaults())
                .oauth2ResourceServer((oauth2) -> oauth2
                        .jwt((jwt) -> jwt
                                .jwtAuthenticationConverter(jwtAuthenticationConverter())
                        )
                );
        return http.build();
    }



    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web
                .ignoring().antMatchers("/css/**", "/js/**", "/images/**")
                .and()
                .debug(true);
    }

    // other beans and methods
}
