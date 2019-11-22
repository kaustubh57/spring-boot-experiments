package com.example.applicationcontext.dao;

import com.example.applicationcontext.database.XMLJdbcConnection;

public class XMLPersonDAO {
    XMLJdbcConnection xmlJdbcConnection;

    public XMLJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setXmlJdbcConnection(XMLJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }
}
