package com.bosonit.virtualtraveler.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Reserva {
    
    @Id
    private int dia;

    private String fecha;

    public Reserva(){}

    public Reserva(int dia, String fecha) {
        this.dia = dia;
        this.fecha = fecha;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}
