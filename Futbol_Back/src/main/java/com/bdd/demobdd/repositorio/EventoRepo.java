package com.bdd.demobdd.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bdd.demobdd.modelo.Evento;

public interface EventoRepo extends JpaRepository<Evento,Integer>{
    
}
