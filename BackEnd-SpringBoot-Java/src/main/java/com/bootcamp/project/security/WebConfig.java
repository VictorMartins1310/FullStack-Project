package com.bootcamp.project.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Erlaube Anfragen an alle Endpunkte
                .allowedOrigins("http://localhost:5173") // Erlaube Anfragen von diesem Ursprung
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Erlaube diese Methoden
                .allowedHeaders("*") // Erlaube alle Header
                .allowCredentials(true); // Erlaube Cookies und Authentifizierung
    }
}