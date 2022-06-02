package com.bosonit.virtualtravel2.modelo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CorreoInputDto {
    //Faltan inner join, claves primarias y foráneas
    @Id
    @Column(name="idCorreoInput")
    private int idCorreoInput;
    @Column(name="ciudadDestino")
    private String ciudadDestino;
    @Column(name="email")
    private String email;
    @Column(name="fechaReserva")
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date fechaReserva;
    @Column(name="horaReserva")
    private float horaReserva;

    public CorreoInputDto(String ciudadDestino, String email, Date fechaReserva, float horaReserva) {
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
