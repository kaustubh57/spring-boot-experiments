package com.example.springbootexperiments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        // ###### RUN ######
        ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

        //  Check various spring beans loaded in application context
//        for (String name : applicationContext.getBeanDefinitionNames()) {
//            LOGGER.info("#### Bean: {}", name);
//        }
    }
}
