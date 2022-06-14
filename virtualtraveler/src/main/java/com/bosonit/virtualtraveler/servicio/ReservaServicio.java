package com.bosonit.virtualtraveler.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosonit.virtualtraveler.modelo.Reserva;
import com.bosonit.virtualtraveler.repositorio.ReservaRepo;

@Service
public class ReservaServicio {

    @Autowired
    ReservaRepo reservaRepo;

    /**
     * FUNCION QUE RETORNA QUE TODO FUNCIONA
     * @return todo ok
     */
    public String saludo() {
        return "Todo OK";
    }

    /**
     * FUNCION QUE HACE UNA RESERVA
     * 
     * @param dia
     * @param fecha
     * @return la reserva hecha
     */
    public Reserva hacerReserva(int dia, String fecha) {
        Reserva nuevaReserva = new Reserva(dia, fecha);
        return reservaRepo.save(nuevaReserva);
    }

    /**
     * FUNCION QUE RETORNA TODAS LAS RESERVAS
     * @return las reservas acumuladas
     */
    public List<Reserva> verReservas(){
        return reservaRepo.findAll();
    }

    /**
     * FUNCION QUE DEVUELVE LAS RESERVAS BUSCADAS
     * POR EL DIA
     * @param dia
     * @return si hay o no reservas
     */
    public List<Reserva> buscarReserva(int dia){
        return reservaRepo.findById(dia).stream().toList();
    }

    /**
     * ELIMINAR UNA RESERVA POR EL DIA
     * @param dia
     */
    public void eliminarReserva(int dia){
        reservaRepo.deleteById(dia);
    }
}
