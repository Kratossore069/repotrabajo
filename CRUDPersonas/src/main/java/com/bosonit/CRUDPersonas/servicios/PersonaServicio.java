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

    /**
     * METODO PARA CAMBIAR EL NOMBRE DE UN USUARIO
     * A PARTIR DE UN ID
     * @param id
     */
    @Override
    public void putPersona(int id) {
        for(Persona personas: listaPersonas) {
            if(personas.getId() == (id)) {
                personas.setNombre("Cambiado");
            }
        }
    }

    /**
     * METODO QUE ELIMINA DE LA LISTA UNA PERSONA
     * A PARTIR DE SU NUMERO DE ID
     * @param id
     */
    @Override
    public void deletePersona(int id) {
        for(Persona personas: listaPersonas) {
            if(personas.getId() == (id)) {
                listaPersonas.remove(this);
            }
        }
    }

    /**
     * FUNCION QUE RETORNA UNA PERSONA SI EXISTE
     * EL NOMBRE QUE PERTENECE
     * @param persona
     * @return persona retornada
     */
    @Override
    public Persona getPersonaNombre(Persona persona) {
        Persona encontrada = null;
        for(Persona personas: listaPersonas) {
            if(personas.getNombre() == (persona.getNombre())) {
                encontrada = new Persona(persona.getId(),persona.getNombre(),persona.getEdad(),
                        persona.getPoblacion());
            }
        }
        return encontrada;
    }

    /**
     * FUNCION QUE RETORNA UNA PERSONA
     * SI SE LA ENCUENTRA POR SU ID
     * @param persona
     * @return persona encontrada
     */
    @Override
    public Persona getPersonaID(Persona persona) {
        Persona encontrada = null;
        for(Persona personas: listaPersonas) {
            if(personas.getId() == (persona.getId())) {
                encontrada = new Persona(persona.getId(),persona.getNombre(),persona.getEdad(),
                        persona.getPoblacion());
            }
        }
        return encontrada;
    }
}
