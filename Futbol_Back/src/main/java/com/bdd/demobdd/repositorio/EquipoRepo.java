package com.bdd.demobdd.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bdd.demobdd.modelo.Equipo;

public interface EquipoRepo extends JpaRepository<Equipo,Integer>{
    
}
