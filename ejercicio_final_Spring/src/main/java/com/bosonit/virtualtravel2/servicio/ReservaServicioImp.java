package com.bosonit.virtualtravel2.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosonit.virtualtravel2.modelo.Reserva;
import com.bosonit.virtualtravel2.repositorio.ReservaRepo;

@Service
public class ReservaServicioImp implements ReservaServicio{

    @Autowired
    ReservaRepo reservaRepo;

    /**
     * FUNCION QUE MUESTRA QUE LA API REST
     * FUNCIONA PERFECTAMENTE
     */
    @Override
    public String saludo() {
        return "Todo OK sin problemas";
    }

    /**
     * FUNCION QUE HACE UNA NUEVA RESERVA 
     * EN LA BASE DE DATOS
     */
    @Override
    public Reserva hacerReserva(int diaReserva, String fechaReserva) {
        Reserva nuevaReserva = new Reserva();
        nuevaReserva.setDiaReserva(diaReserva);
        nuevaReserva.setFechaReserva(fechaReserva);
        return reservaRepo.save(nuevaReserva);
    }
    
}
