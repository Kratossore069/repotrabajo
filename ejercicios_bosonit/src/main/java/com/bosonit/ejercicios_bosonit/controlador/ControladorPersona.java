package com.bosonit.ejercicios_bosonit.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorPersona {

    @GetMapping("/saludo")
    String saludo(@RequestParam(name="name") String name){
        return "Hola "+name;
    }
}
