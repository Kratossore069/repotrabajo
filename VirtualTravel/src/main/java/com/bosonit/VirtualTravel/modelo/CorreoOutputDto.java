package com.bosonit.VirtualTravel.modelo;

import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class CorreoOutputDto {

    private String ciudadDestino;
    private String email;
    private Date fechaReserva;
    private float horaReserva;

    public CorreoOutputDto(String ciudadDestino, String email, Date fechaReserva, float horaReserva) {
        this.ciudadDestino = ciudadDestino;
        this.email = email;
        this.fechaReserva = fechaReserva;
        this.horaReserva = horaReserva;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public float getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(float horaReserva) {
        this.horaReserva = horaReserva;
    }

}
