package com.bosonit.virtualtravel2.servicio;

import com.bosonit.virtualtravel2.repositorios.ReservaOutputInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReservasImp implements Reservas{

    @Autowired
    ReservaOutputInterface reservaOutput;

    @Override
    public String pedirReserva(String destino, Date fechaSalida, float horaSalida) {
        return null;
    }
}
