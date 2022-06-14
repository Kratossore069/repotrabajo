package com.bosonit.virtualtravel2.modelo;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Reserva {
    
    @Id
    private int diaReserva;
    private String fechaReserva;

    public Reserva(){}
    
    public Reserva(int diaReserva, String fechaReserva) {
        this.diaReserva = diaReserva;
        this.fechaReserva = fechaReserva;
    }

    public int getDiaReserva() {
        return diaReserva;
    }
    public void setDiaReserva(int diaReserva) {
        this.diaReserva = diaReserva;
    }
    public String getFechaReserva() {
        return fechaReserva;
    }
    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }    
}