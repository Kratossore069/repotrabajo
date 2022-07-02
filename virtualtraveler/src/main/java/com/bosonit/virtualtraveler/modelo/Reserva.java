package com.bosonit.virtualtraveler.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Reserva {
    
    @Id
    private int id;
    private int dia;
    private String mes;

    public Reserva(int id, int dia, String mes) {
        this.id = id;
        this.dia = dia;
        this.mes = mes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    
}
