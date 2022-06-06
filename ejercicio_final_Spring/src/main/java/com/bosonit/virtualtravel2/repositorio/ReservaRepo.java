package com.bosonit.virtualtravel2.repositorio;

import com.bosonit.virtualtravel2.modelo.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepo extends JpaRepository<Reserva, Integer> {}