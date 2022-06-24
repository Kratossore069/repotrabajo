package com.bosonit.virtualtraveler.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SeguridadPersona {

    private String username;
    private String password;

    public SeguridadPersona(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public SeguridadPersona() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
