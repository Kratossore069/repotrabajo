package com.bosonit.virtualtraveler.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bosonit.virtualtraveler.modelo.Reserva;

@Repository
public interface ReservaRepo extends MongoRepository<Reserva, Integer>{
}