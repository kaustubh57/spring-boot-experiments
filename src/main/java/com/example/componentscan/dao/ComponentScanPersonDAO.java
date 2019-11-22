package com.example.componentscan.dao;

import com.example.componentscan.database.ComponentScanJdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentScanPersonDAO {

    @Autowired
    ComponentScanJdbcConnection componentScanJdbcConnection;

    public ComponentScanJdbcConnection getComponentScanJdbcConnection() {
        return componentScanJdbcConnection;
    }

    public void setComponentScanJdbcConnection(ComponentScanJdbcConnection componentScanJdbcConnection) {
        this.componentScanJdbcConnection = componentScanJdbcConnection;
    }
}
