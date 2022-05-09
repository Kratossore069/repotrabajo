package com.bosonit.ejercicios_bosonit.repositorio;

import com.bosonit.ejercicios_bosonit.modelo.Persona;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("persona1")
public class RepoPersona implements IPersona{

    @Override
    public Persona buscarPorNombre(String nombre) {
        return null;
    }

    @Override
    public Persona buscarApellido(String apellido) {
        return null;
    }

    @Override
    public Persona buscarFecha(int fecha) {
        return null;
    }
}
