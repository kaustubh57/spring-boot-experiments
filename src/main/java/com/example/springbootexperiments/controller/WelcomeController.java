package com.example.springbootexperiments.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springbootexperiments.model.Welcome;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    // inject via application.properties
    @Value("${welcome.message.test}")
    private String message = "Hello World";

    @GetMapping
    public String welcomeGet(Model model) {
        model.addAttribute("welcome", new Welcome());
        return "welcome";
    }

    @PostMapping
    public String welcomePost(@ModelAttribute Welcome welcome) {
        System.out.println("##################################");
        System.out.println("# - 1. File content type for : " +  welcome.getFile1().getOriginalFilename() + " >>> " + welcome.getFile1().getContentType());
        System.out.println("# - 2. File content type for : " +  welcome.getFile2().getOriginalFilename() + " >>> " + welcome.getFile2().getContentType());
        System.out.println("# - 3. File content type for : " +  welcome.getFile3().getOriginalFilename() + " >>> " + welcome.getFile3().getContentType());
        System.out.println("# - 4. File content type for : " +  welcome.getFile4().getOriginalFilename() + " >>> " + welcome.getFile4().getContentType());
        System.out.println("# - 5. File content type for : " +  welcome.getFile5().getOriginalFilename() + " >>> " + welcome.getFile5().getContentType());
        System.out.println("##################################");
        return "success";
    }
}