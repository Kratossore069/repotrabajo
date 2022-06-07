package com.bosonit.virtualtravel2.servicio;

import com.bosonit.virtualtravel2.modelo.Reserva;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ReservaServicio {
    public void hacerReserva(int diaReserva, String fechaReserva);
    public List<Reserva> listaReservas();
    public Reserva obtenerReserva(int diaReserva);
}
