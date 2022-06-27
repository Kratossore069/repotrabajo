package com.bosonit.reservas;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservasRepository extends JpaRepository<Reservas, Long> {
    //User findByUsername(String username);
}
