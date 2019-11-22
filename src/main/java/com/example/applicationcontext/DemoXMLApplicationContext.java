package com.example.applicationcontext;

import com.example.applicationcontext.dao.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.example.applicationcontext")
public class DemoXMLApplicationContext {

    private static Logger LOGGER = LoggerFactory.getLogger(DemoXMLApplicationContext.class);

    public static void main(String[] args) {
        // ###### XML ApplicationContext ######
        try (ClassPathXmlApplicationContext applicationContext
                     = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            // Experiments
            XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class);
            LOGGER.info("DAO: {}", xmlPersonDAO);
            LOGGER.info("JDBC: {}", xmlPersonDAO.getXmlJdbcConnection());
        }
    }
}
