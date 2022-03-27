package com.bosonit.SpringDemo.servicio;

import com.bosonit.SpringDemo.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonaImplementar implements InterfazPersona{

    @Autowired
    Persona persona;

    @Override
    public Persona getPersona() {
        return persona.getPersona();
    }
}
