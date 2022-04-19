package com.bosonit.CRUDSpring.interfaces;

import com.bosonit.CRUDSpring.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
<<<<<<< HEAD:CRUDSpring/src/main/java/com/bosonit/CRUDSpring/interfaces/InterfazPersona.java
public interface InterfazPersona extends CrudRepository<Persona,Integer> {
}// Esto es un repositorio
=======
public interface RepositorioPersona extends CrudRepository<Persona,Integer> {
}
>>>>>>> a989a333b758637ca8f229e7ee6f06ade5b137f4:CRUDSpring/src/main/java/com/bosonit/CRUDSpring/interfaces/RepositorioPersona.java
