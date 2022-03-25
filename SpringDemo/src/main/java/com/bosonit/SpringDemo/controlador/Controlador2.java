package com.bosonit.SpringDemo.controlador;


import com.bosonit.SpringDemo.modelo.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador2 implements InterfazPersonas {

    private Persona persona;

    public Controlador2(Persona persona){
        this.persona = persona;
    }

    @GetMapping("/controlador1")
    @Override
    public Persona getPersona() {
        return persona.getPersona();
    }
}
