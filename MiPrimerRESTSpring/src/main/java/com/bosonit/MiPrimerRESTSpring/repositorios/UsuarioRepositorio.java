package com.bosonit.MiPrimerRESTSpring.repositorios;

import com.bosonit.MiPrimerRESTSpring.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Integer> {
}
