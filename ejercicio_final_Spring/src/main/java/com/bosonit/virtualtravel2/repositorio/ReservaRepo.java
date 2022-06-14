package com.bosonit.virtualtravel2.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bosonit.virtualtravel2.modelo.Reserva;

@Repository
public interface ReservaRepo extends MongoRepository<Reserva, Integer>{
    
}