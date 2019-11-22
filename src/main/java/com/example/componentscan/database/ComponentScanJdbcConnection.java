package com.example.componentscan.database;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(
        value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
        proxyMode = ScopedProxyMode.TARGET_CLASS
)
public class ComponentScanJdbcConnection {

    public ComponentScanJdbcConnection() {
        System.out.println("### ComponentScan JDBC Connection");
    }
}
