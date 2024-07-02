package com.interview.springboot_annotations.service.impl;

import com.interview.springboot_annotations.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class SpanishGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "¡Hola!";
    }
}