package com.example.springbootexperiments;

import com.example.componentscan.dao.ComponentScanPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.componentscan")
public class DemoComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(DemoComponentScanApplication.class);

    public static void main(String[] args) {
        // ###### RUN ######
        ApplicationContext applicationContext = SpringApplication.run(DemoComponentScanApplication.class, args);

        // Experiments
        ComponentScanPersonDAO componentScanPersonDAO = applicationContext.getBean(ComponentScanPersonDAO.class);

        LOGGER.info("### Component Scan Logging experiments...");

        LOGGER.info("{}", componentScanPersonDAO);
    }
}
