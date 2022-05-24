package com.bosonit.VirtualTravel.modelo;

import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class ReservaOutputDto{

    private String ciudadDestino;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private Date fechaReserva;
    private float horaReserva;
    
    public ReservaOutputDto(String ciudadDestino, String nombre, String apellido, String telefono, String email,
            Date fechaReserva, float horaReserva) {
        this.ciudadDestino = ciudadDestino;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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