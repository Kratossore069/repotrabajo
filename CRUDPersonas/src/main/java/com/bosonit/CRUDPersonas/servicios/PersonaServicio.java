package com.bosonit.CRUDPersonas.servicios;

import com.bosonit.CRUDPersonas.interfaces.Interfaz;
import com.bosonit.CRUDPersonas.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class PersonaServicio implements Interfaz {

    ArrayList<Persona> listaPersonas = new ArrayList<>();

    @Autowired
    Persona persona;

    /**
     * FUNCION QUE HACE UN POST DE UNA PERSONA
     * Y LO ALMACENA
     * @param persona
     * @return persona aniadida
     */
    @Override
    public Persona postPersona(Persona persona) {
        listaPersonas.add(persona);
        return new Persona(persona.getId(), persona.getNombre(), persona.getEdad(),persona.getPoblacion());
    }

    @Override
    public void putPersona(int id) {
        for(Persona personas: listaPersonas) {
            if(personas.getId() == (id)) {
                personas.setNombre("Cambiado");
            }
        }
    }

    @Override
    public void deletePersona(int id) {

    }

    @Override
    public Persona getPersonaNombre(Persona persona) {
        return null;
    }

    @Override
    public Persona getPersonaID(Persona persona) {
        return null;
    }
}
