package com.bosonit.REstFul.modelo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Perfil {

    @Value("${url}")
    public String url;

    @Value("${password}")
    public String password;
}
