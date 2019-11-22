package com.example.springbootexperiments.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
// CDI: context and dependency injection (javax.inject)
public class SomeCDIBusiness {

    @Inject
    SomeCDIDAO someCDIDAO;

    public SomeCDIDAO getSomeCDIDAO() {
        return someCDIDAO;
    }

    public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
        this.someCDIDAO = someCDIDAO;
    }
}
