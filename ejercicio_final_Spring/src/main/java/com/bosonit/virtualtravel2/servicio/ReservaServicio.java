package com.bosonit.virtualtravel2.servicio;

import com.bosonit.virtualtravel2.modelo.Reserva;

public interface ReservaServicio {
    
    String saludo();

    Reserva hacerReserva(int diaReserva, String fechaReserva);
}
