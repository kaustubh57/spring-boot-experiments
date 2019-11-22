package com.example.springbootexperiments;

import com.example.springbootexperiments.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(DemoCDIApplication.class);

    public static void main(String[] args) {
        // ###### RUN ######
        ApplicationContext applicationContext = SpringApplication.run(DemoCDIApplication.class, args);

        // Experiments
        SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);

        LOGGER.info("### CDI Logging experiments...");

        LOGGER.info("Business: {}", someCDIBusiness);
        LOGGER.info("DAO: {}", someCDIBusiness.getSomeCDIDAO());
    }
}
