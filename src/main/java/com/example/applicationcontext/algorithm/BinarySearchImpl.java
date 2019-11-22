package com.example.applicationcontext.algorithm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    private static Logger LOGGER = LoggerFactory.getLogger(BinarySearchImpl.class);

    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println("### sortAlgorithm");
        System.out.println(sortAlgorithm);
        //Search the array
        return 3;
    }

    @PostConstruct
    public void postConstruct() {
        LOGGER.info("### postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        LOGGER.info("### preDestroy");
    }

}
