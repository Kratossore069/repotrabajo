package com.bdd.demobdd.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bdd.demobdd.modelo.Partido;

public interface PartidoRepo extends JpaRepository<Partido,Integer>{
    
}
