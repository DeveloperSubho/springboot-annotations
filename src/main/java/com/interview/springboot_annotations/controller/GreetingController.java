package com.interview.springboot_annotations.controller;

import com.interview.springboot_annotations.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;
    private final GreetingService englishGreetingService;

    public GreetingController(GreetingService greetingService,
                              @Qualifier("englishGreetingService") GreetingService englishGreetingService) {
        this.greetingService = greetingService;
        this.englishGreetingService = englishGreetingService;
    }

    @GetMapping
    public String greet() {
        return greetingService.greet();
    }

    @GetMapping("/english")
    public String greetInEnglish() {
        return englishGreetingService.greet();
    }
}