package com.bosonit.virtualtraveler.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosonit.virtualtraveler.modelo.Reserva;
import com.bosonit.virtualtraveler.repositorio.ReservaRepo;

@Service
public class ReservaServicio {
    
    @Autowired
    ReservaRepo reservaRepo;

    /**
     * FUNCION PARA VER SI TODO FUNCIONA
     * @return saludo
     */
    public String saludo(){
        return "Todo funciona";
    }

    /**
     * FUNCION QUE HACE UNA RESERVA
     * @param reserva en formato json
     * @return la reserva creada
     */
    public Reserva hacerReserva(Reserva reserva){
        Reserva nuevaReserva = new Reserva(reserva.getId(),reserva.getDia(),reserva.getMes());
        return reservaRepo.save(nuevaReserva);
    }

    


}
