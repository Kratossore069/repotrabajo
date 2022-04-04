package com.bosonit.CRUDSpring.servicio;

import com.bosonit.CRUDSpring.interfaces.InterfazPersona;
import com.bosonit.CRUDSpring.interfacesService.InterfazPersonaServicio;
import com.bosonit.CRUDSpring.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServicio implements InterfazPersonaServicio {

    @Autowired
    InterfazPersona interfazPersona;

    @Override
    public List<Persona> listarPersonas() {
        return (List<Persona>)interfazPersona.findAll();
    }

    @Override
    public Optional<Persona> listarPorId(int id) {
        return Optional.empty();
    }

    @Override
    public int guardarPersona(Persona persona) {
        return 0;
    }

    @Override
    public void borrarPersona(int id) {

    }
}
