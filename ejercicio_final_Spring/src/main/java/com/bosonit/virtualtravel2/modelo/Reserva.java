package com.bosonit.virtualtravel2.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection="reserva")
public class Reserva {
    @Id
    private int diaReserva;
    private String fechaReserva;

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
