package com.bosonit.SpringMongo.modelo;

import org.springframework.data.annotation.Id;

public class Personas {

    @Id
    private int id;
    
    private String nombre;
    private String apellido;
    private String domicilio;
}
