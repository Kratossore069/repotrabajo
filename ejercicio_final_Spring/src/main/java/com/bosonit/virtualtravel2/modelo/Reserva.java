package com.bosonit.virtualtravel2.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Document(collection="reserva")
public class Reserva {
    @Id
    private int diaReserva;
    private Date fechaReserva;

    public Reserva(int diaReserva, Date fechaReserva) {
        this.diaReserva = diaReserva;
        this.fechaReserva = fechaReserva;
    }

    public int getDiaReserva() {
        return diaReserva;
    }

    public void setDiaReserva(int diaReserva) {
        this.diaReserva = diaReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
}
