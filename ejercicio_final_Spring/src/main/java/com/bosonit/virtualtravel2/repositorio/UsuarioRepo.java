package com.bosonit.virtualtravel2.repositorio;

import com.bosonit.virtualtravel2.modelo.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepo extends MongoRepository<Usuario,Integer> {
}
