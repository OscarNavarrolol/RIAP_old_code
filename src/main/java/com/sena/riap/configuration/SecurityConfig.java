package com.sena.riap.configuration;
/*
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
*/
// @Configuration explocion toto no tocal
// @EnableWebSecurity
public class SecurityConfig {
/*
    @Bean
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //autenticación en memoria
        auth.inMemoryAuthentication()
                .withUser("admin").password("{noop}admin").roles("ADMIN"); // Usar contraseña en texto plano (quite esa monda (malo))
    }

    @Bean
    public SecurityFilterChain filterChain (HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/profileAdmin/**").hasRole("ADMIN") // Solo los usuarios con rol ADMIN pueden acceder a /profileAdmin/**
                .anyRequest().authenticated() // Todas los solicitudes requieren autenticacion
                .and()
                .formLogin() // Habilitar el formulario de inicio de Spring Security
                .loginPage("/login") // Personalizar la pagina de inicio donde entran
                .permitAll(); // accedan todos aqui

                return http.build();
    }
*/
}
