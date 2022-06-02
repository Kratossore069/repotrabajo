package com.bosonit.virtualtravel2.repositorios;

import com.bosonit.virtualtravel2.modelo.ReservaOutputDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaOutputInterface extends JpaRepository<ReservaOutputDto,Integer> {

}
