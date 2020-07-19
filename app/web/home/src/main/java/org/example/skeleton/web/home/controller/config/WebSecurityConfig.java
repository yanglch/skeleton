//package org.example.skeleton.web.home.controller.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.web.AuthenticationEntryPoint;
//
//import java.io.IOException;
//
//@Configuration
//@EnableWebFluxSecurity
//public class WebSecurityConfig {
//
//
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .anyRequest().authenticated()
//                .and().formLogin()
//                .and().logout()
//                .and().httpBasic()
//                .and().exceptionHandling().authenticationEntryPoint(null);
//    }
//
//
//
//
//
//
//}
