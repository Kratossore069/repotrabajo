package com.bosonit.virtualtravel2.repositorios;

import com.bosonit.virtualtravel2.modelo.ErrorOutputDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ErrorOutpuInterface extends JpaRepository<ErrorOutputDto,Integer> {
    
}
