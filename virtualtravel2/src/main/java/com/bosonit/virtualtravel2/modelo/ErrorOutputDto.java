package com.bosonit.virtualtravel2.modelo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ErrorOutputDto {
    @Id
    @Column(name="idCorreoError")
    private int idCorreoError;
    @Column(name="httpCode")
    private int httpCode;
    @Column(name="msgError")
    private String msgError;
    @Column(name="tipo")
    private String tipo;
    @Column(name="fecha")
    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    private Date fecha;

    public ErrorOutputDto(int httpCode, String msgError, String tipo, Date fecha) {
        this.httpCode = httpCode;
        this.msgError = msgError;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }

    public String getMsgError() {
        return msgError;
    }

    public void setMsgError(String msgError) {
        this.msgError = msgError;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}