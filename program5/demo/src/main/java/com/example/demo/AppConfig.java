package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// @Scope("prototype")
public class AppConfig {
    @Bean
    public MyService myService() {
        return new MyService();
    }
}
