package com.example.springbootexperiments.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springbootexperiments.file.FileContentTypeUtil;
import com.example.springbootexperiments.model.Welcome;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    // inject via application.properties
    @Value("${welcome.message.test:Hello Word}")
    private String message = "Hello World";

    @GetMapping
    public String welcomeGet(Model model) {
        model.addAttribute("welcome", new Welcome());
        return "welcome";
    }

    @PostMapping
    public String welcomePost(@ModelAttribute Welcome welcome) throws IOException {
        System.out.println("################ printContentTypeWithFileContentType ##################");
        FileContentTypeUtil.printContentTypeWithFileContentType(welcome.getFile1());
        FileContentTypeUtil.printContentTypeWithFileContentType(welcome.getFile2());
        FileContentTypeUtil.printContentTypeWithFileContentType(welcome.getFile3());
        FileContentTypeUtil.printContentTypeWithFileContentType(welcome.getFile4());
        FileContentTypeUtil.printContentTypeWithFileContentType(welcome.getFile5());
        System.out.println("##################################");
        System.out.println("");

        System.out.println("################ printContentTypeWithApacheTika ##################");
        FileContentTypeUtil.printContentTypeWithApacheTika(welcome.getFile1());
        FileContentTypeUtil.printContentTypeWithApacheTika(welcome.getFile2());
        FileContentTypeUtil.printContentTypeWithApacheTika(welcome.getFile3());
        FileContentTypeUtil.printContentTypeWithApacheTika(welcome.getFile4());
        FileContentTypeUtil.printContentTypeWithApacheTika(welcome.getFile5());
        System.out.println("##################################");
        System.out.println("");


        return "welcome";
    }
}
