package com.example.springbootexperiments.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    // inject via application.properties
    @Value("${welcome.message.test}")
    private String message = "Hello World";

    @RequestMapping("/welcome")
    @GetMapping
    public String welcome() {
        return "welcome";
    }

}