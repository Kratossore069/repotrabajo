package com.bosonit.VirtualTravel.modelo;

import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class ReservaDisponibleOutputDto {

    private String ciudadDestino;
    private Date fechaSalida;
    private float horaSalida;
    private int numeroPlazas;

    public ReservaDisponibleOutputDto(String ciudadDestino, Date fechaSalida, float horaSalida, int numeroPlazas) {
        this.ciudadDestino = ciudadDestino;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.numeroPlazas = numeroPlazas;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public float getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(float horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

}
