package com.example.applicationcontext.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SomeExternalService {

    // from property file
    @Value("${external.service.url:DEFAULT}")
    private String url;

    public String returnServiceUrl() {
        return url;
    }
}
