package com.bdd.demobdd.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bdd.demobdd.modelo.Jugador;

public interface JugadoresRepo extends JpaRepository<Jugador,Integer>{
    
}
