package com.bosonit.SpringMongo.servicio;

import com.bosonit.SpringMongo.modelo.Persona;
import com.bosonit.SpringMongo.repositorio.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServicio {

    @Autowired
    PersonaRepositorio personaRepositorio;

    public Persona guardarPersona(Persona persona) {
        return personaRepositorio.guardarPersona(persona);
    }

    public List<Persona> getAll() {
        return personaRepositorio.find();
    }

    public Persona update(Persona persona) {
        /* Gracias a Mongo se puede rescribir el dato */
        return personaRepositorio.guardarPersona(persona);
    }

    public long delete(Persona persona) {
        return personaRepositorio.delete(persona);
    }
}
