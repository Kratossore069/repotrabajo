package com.bosonit.virtualtravel2.modelo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CorreoOutputDto {

    @Id
    @Column(name="idCorreoOutput")
    private int idCorreoOutput;
    @Column(name="ciudadDestino")
    private String ciudadDestino;
    @Column(name="email")
    private String email;
    @Column(name="fechaReserva")
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date fechaReserva;
    @Column(name="horaReserva")
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
