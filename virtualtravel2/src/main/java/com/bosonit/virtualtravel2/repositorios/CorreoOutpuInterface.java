package com.bosonit.virtualtravel2.repositorios;

import com.bosonit.virtualtravel2.modelo.CorreoOutputDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorreoOutpuInterface extends JpaRepository<CorreoOutputDto,Integer> {
    
}
