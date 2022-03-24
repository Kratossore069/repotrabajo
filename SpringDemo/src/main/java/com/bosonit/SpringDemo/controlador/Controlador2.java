package com.bosonit.SpringDemo.controlador;

import com.bosonit.SpringDemo.modelo.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador2 {

   /* @GetMapping("/controlador2")
    public Persona controlador2() {
        Persona nuevaPersona = listaPersona.get(0);
        return nuevaPersona.getNombre()+nuevaPersona.getPoblacion()+
                (Persona)(Integer.parseInt(nuevaPersona.getNombre())*2);
    }*/
}
