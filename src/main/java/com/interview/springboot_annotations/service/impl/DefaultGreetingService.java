package com.interview.springboot_annotations.service.impl;

import com.interview.springboot_annotations.service.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class DefaultGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Default Greeting!";
    }
}