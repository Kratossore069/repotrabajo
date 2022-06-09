package com.bosonit.virtualtravel2.repositorio;

import com.bosonit.virtualtravel2.modelo.Reserva;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//@Repository
//public interface ReservaRepo extends MongoRepository<Reserva, Integer> {}

@Repository
public interface ReservaRepo extends MongoRepository<Reserva, Integer> {
    List<Reserva> listarReservas();
}