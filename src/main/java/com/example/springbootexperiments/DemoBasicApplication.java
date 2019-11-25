package com.example.springbootexperiments;

import com.example.springbootexperiments.algorithm.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoBasicApplication {

    public static void main(String[] args) {
        // ###### RUN ######
        ApplicationContext applicationContext = SpringApplication.run(DemoBasicApplication.class, args);

        // Experiments
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        System.out.println("### Binary Search Instance");
        System.out.println(binarySearch);

        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
        System.out.println("###result >>> " + result);
    }
}
