package com.CodeByte.Travel.JWT.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Desactivar CSRF
            .authorizeHttpRequests(authz -> authz
                .requestMatchers("/auth/**").permitAll() // Permitir acceso sin autenticación a /auth/**
                .requestMatchers(
                    "/api/v1/auth/login",
                    "/api/users/register",
                    "/api/v1/base/**",
                    "/api/v1/base/security/persona",
                    "/swagger-ui.html",
                    "/swagger-ui/**",
                    "/v3/api-docs",
                    "/v3/api-docs/**"
                ).permitAll() // Permitir acceso sin autenticación a los endpoints listados
                .anyRequest().authenticated() // Requerir autenticación para otras solicitudes
            );

        return http.build();
    }
}
