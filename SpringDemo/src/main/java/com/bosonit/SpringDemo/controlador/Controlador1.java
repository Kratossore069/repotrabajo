package com.bosonit.SpringDemo.controlador;

import com.bosonit.SpringDemo.modelo.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controlador1 {

    @GetMapping("/controlador1")
    public Persona controlador1(@RequestHeader("accept-language") String nombre,
                                @RequestHeader("accept-language") String poblacion,
                                @RequestHeader("accept-language") int edad) {
        return new Persona(nombre,poblacion,edad);
    }
}
