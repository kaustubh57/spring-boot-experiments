package com.example.applicationcontext;

import com.example.applicationcontext.properties.SomeExternalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.applicationcontext")
@PropertySource("classpath:app.properties")
public class DemoPropertiesApplicationContext {

    private static Logger LOGGER = LoggerFactory.getLogger(DemoPropertiesApplicationContext.class);

    public static void main(String[] args) {
        // ###### ApplicationContext ######
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoPropertiesApplicationContext.class);

        // Experiments
        SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);

        LOGGER.info("### SomeExternalService Instance");
        LOGGER.info("{}", someExternalService);
        LOGGER.info("External URL: {}", someExternalService.returnServiceUrl());
    }
}
