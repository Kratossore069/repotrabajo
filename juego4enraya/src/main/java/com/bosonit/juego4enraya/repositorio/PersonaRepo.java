package com.bosonit.juego4enraya.repositorio;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.bosonit.juego4enraya.modelo.Persona;

import reactor.core.publisher.Flux;

public interface PersonaRepo extends ReactiveCrudRepository<Persona, Integer>{
    
    @Query("SELECT * FROM persona WHERE nombre = :nombre")
    Flux<Persona> buscarNombre(String nombre);
}
