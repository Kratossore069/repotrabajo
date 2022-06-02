package com.bosonit.virtualtravel2.repositorios;

import com.bosonit.virtualtravel2.modelo.ReservaDisponibleOutputDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaDisponibleInterface extends JpaRepository<ReservaDisponibleOutputDto,Integer> {
    
}
