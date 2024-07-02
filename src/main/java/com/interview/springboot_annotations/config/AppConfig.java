package com.interview.springboot_annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.interview.springboot_annotations")
public class AppConfig {

    @Bean
    public String exampleBean() {
        return "This is an example bean";
    }
}