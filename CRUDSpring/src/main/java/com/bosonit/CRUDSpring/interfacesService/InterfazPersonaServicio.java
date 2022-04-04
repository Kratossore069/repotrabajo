package com.bosonit.CRUDSpring.interfacesService;

import com.bosonit.CRUDSpring.modelo.Persona;

import java.util.List;
import java.util.Optional;

public interface InterfazPersonaServicio {
    List<Persona> listarPersonas();
    Optional<Persona> listarPorId(int id);
    int guardarPersona(Persona persona);
    void borrarPersona(int id);
}
