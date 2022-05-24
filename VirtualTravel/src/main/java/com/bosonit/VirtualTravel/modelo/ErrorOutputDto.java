package com.bosonit.VirtualTravel.modelo;

import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class ErrorOutputDto {

    private int httpCode;
    private String msgError;
    private String tipo;
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
