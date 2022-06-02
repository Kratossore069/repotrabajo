package com.bosonit.virtualtravel2.modelo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReservaDisponibleOutputDto {
    @Id
    @Column(name="idReservaDisponible")
    private int idReservaDisponible;
    @Column(name="ciudadDestino")
    private String ciudadDestino;
    @Column(name="fechaSalida")
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date fechaSalida;
    @Column(name="horaSalida")
    private float horaSalida;
    @Column(name="numeroPlazas")
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
