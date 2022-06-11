package com.bosonit.virtualtravel2.repositorio;

import com.bosonit.virtualtravel2.modelo.Reserva;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepo extends MongoRepository<Reserva, Integer> {
}