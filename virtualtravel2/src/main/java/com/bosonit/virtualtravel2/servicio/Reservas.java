package com.bosonit.virtualtravel2.servicio;

import java.util.Date;

public interface Reservas{
    public String pedirReserva(String destino, Date fechaSalida, float horaSalida);
}
