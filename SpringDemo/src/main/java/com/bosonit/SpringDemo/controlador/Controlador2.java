package com.bosonit.SpringDemo.controlador;

import com.bosonit.SpringDemo.modelo.Persona;
import com.bosonit.SpringDemo.servicio.InterfazPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador2 {

    @Autowired
    InterfazPersona repo;

    @GetMapping("/controlador2")
    Persona getPersona(){
        return repo.getPersona();
    }
}
