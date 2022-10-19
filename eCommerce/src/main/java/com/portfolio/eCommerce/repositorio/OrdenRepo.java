package com.portfolio.eCommerce.repositorio;

import com.portfolio.eCommerce.modelo.Orden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenRepo extends JpaRepository<Orden,Integer> {
}
