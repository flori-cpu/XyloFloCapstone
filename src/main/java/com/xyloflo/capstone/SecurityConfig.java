package com.xyloflo.capstone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration // Marks the class as a configuration class
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        // Define and return a BCryptPasswordEncoder bean
        return new BCryptPasswordEncoder();
    }
}