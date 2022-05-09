package com.bosonit.ejercicios_bosonit.servicios;

import com.bosonit.ejercicios_bosonit.modelo.Persona;
import com.bosonit.ejercicios_bosonit.repositorio.RepoPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RepoPersonaServicio implements PersonaServicio{

    @Autowired
    @Qualifier("persona1")
    private RepoPersona repoPersona;

    @Override
    public Persona buscarPorNombre(String nombre) {
        return repoPersona.buscarPorNombre(nombre);
    }
}
