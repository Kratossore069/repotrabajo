package com.bosonit.demowebflux.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosonit.demowebflux.modelo.Jugador;
import com.bosonit.demowebflux.repositorio.JugadorRepo;

@Service
public class JugadorServicio {

    @Autowired
    private JugadorRepo jugadorRepo;

    public Jugador crearJugador(Jugador jugador){
        return jugadorRepo.save(jugador);
    }
}
