package com.bosonit.demowebflux.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosonit.demowebflux.modelo.Jugador;

public interface JugadorRepo extends JpaRepository<Jugador, Integer>{
    
}
