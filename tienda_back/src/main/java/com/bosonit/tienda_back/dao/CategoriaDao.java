package com.bosonit.tienda_back.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosonit.tienda_back.modelo.Categoria;

public interface CategoriaDao extends JpaRepository<Categoria, Integer>{
    
}
