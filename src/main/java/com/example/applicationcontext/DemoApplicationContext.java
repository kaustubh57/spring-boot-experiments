package com.example.applicationcontext;

import com.example.applicationcontext.algorithm.BinarySearchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.applicationcontext")
public class DemoApplicationContext {

    private static Logger LOGGER = LoggerFactory.getLogger(DemoApplicationContext.class);

    public static void main(String[] args) {
        // ###### ApplicationContext ######
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoApplicationContext.class);

        // Experiments
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        System.out.println("### Binary Search Instance");
        System.out.println(binarySearch);

        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
        System.out.println("###result >>> " + result);
    }
}
