package com.bosonit.ApplicationProperties.controlador;

import com.bosonit.ApplicationProperties.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class PersonaController {
    @Autowired
    Persona persona;

    @GetMapping("valores")
    void verVariables(){
        System.out.println(persona.nombre);
        System.out.println(persona.apellido);
    }
}
