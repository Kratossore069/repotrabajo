package com.bosonit.CRUDPersonas.controlador;

import com.bosonit.CRUDPersonas.modelo.Persona;
import com.bosonit.CRUDPersonas.servicios.PersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("persona")
public class PersonaController {

    @Autowired
    PersonaServicio servicio;

    @PostMapping()
    Persona postPersona(Persona persona){
        return servicio.postPersona(persona);
    }

    @PutMapping("/{id}")
    void putPersona(int id){
        servicio.putPersona(id);
    }

    @DeleteMapping("/{id}")
    void deletePersona(int id){
        servicio.deletePersona(id);
    }

    @GetMapping("/nombre/{nombre}")
    Persona getPersonaNombre(Persona persona){
        return servicio.getPersonaNombre(persona);
    }

    @GetMapping("/{id}")
    Persona getPersonaID(Persona persona){
        return servicio.getPersonaID(persona);
    }
}
