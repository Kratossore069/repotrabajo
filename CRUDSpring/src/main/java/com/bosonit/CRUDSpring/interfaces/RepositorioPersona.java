package com.bosonit.CRUDSpring.interfaces;

import com.bosonit.CRUDSpring.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPersona extends CrudRepository<Persona,Integer> {
}
