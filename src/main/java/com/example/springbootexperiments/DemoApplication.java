package com.example.springbootexperiments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // ###### RUN ######
        ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
    }
}
