package com.bosonit.ApplicationProperties.modelo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Persona {

    @Value("${nombre}")
    public String nombre;

    @Value("${apellido}")
    public String apellido;
}
