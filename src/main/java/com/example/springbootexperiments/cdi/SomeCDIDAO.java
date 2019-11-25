package com.example.springbootexperiments.cdi;

import javax.inject.Named;

@Named
// CDI: context and dependency injection (javax.inject)
public class SomeCDIDAO {

    public int[] getData() {
        return new int[]{5, 89, 100};
    }
}
