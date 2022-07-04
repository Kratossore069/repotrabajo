package com.bosonit.virtualtraveler.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosonit.virtualtraveler.modelo.Reserva;
import com.bosonit.virtualtraveler.repositorio.ReservaRepo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class ReservaServicio {
    
    @Autowired
    private ReservaRepo reservaRepo;

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
        List<Reserva> list = reservaRepo.findById(reserva.getId()).stream().toList();
        Reserva nuevaReserva = null;
        if (list.size() > 0) {
            nuevaReserva = reservaRepo.save(reserva);
        }
        return nuevaReserva;
    }

    /**
     * METODO QUE ELIMINA UNA RESERVA DE LA BDD
     * @param reserva para eliminar
     */
    public void eliminarReserva(Reserva reserva){
        reservaRepo.delete(reserva);
    }

    /**
     * FUNCION QUE ACTUALIZA UNA RESERVA
     * @param reserva para actualizar
     * @return reserva actualizada
     */
    public Reserva updateReserva(Reserva reserva){
        return reservaRepo.save(reserva);
    }

    /**
     * FUNCION QUE MUESTRA TODAS LAS RESERVAS
     * @return todas las reservas
     */
    public List<Reserva> getAllReservas(){
        List<Reserva> list = new ArrayList<>();
        reservaRepo.findAll().forEach(reserva -> list.add(reserva));
        return list;
    }
}
