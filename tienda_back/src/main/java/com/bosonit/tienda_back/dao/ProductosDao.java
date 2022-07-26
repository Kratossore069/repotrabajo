package com.bosonit.tienda_back.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosonit.tienda_back.modelo.Producto;

public interface ProductosDao extends JpaRepository<Producto, Integer>{
    
}
