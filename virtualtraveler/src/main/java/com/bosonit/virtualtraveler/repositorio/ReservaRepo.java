package com.bosonit.virtualtraveler.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosonit.virtualtraveler.modelo.Reserva;

@Repository
public interface ReservaRepo extends JpaRepository<Reserva,Integer> {
    
}
