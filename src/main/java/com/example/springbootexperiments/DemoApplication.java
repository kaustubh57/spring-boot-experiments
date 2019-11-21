package com.example.springbootexperiments;

import com.example.springbootexperiments.algorithm.BinarySearchImpl;
import com.example.springbootexperiments.algorithm.QuickSortAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
        int result = binarySearch.binarySearch(new int[]{124, 6}, 3);

        System.out.println("###result >>> " + result);


        // ###### RUN ######
        SpringApplication.run(DemoApplication.class, args);
    }
}
