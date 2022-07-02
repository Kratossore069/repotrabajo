package com.bosonit.virtualtraveler.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.bosonit.virtualtraveler.servicio.ReservaServicio;

@Controller
public class ReservaController {
    
    @Autowired
    ReservaServicio reservaServicio;

    @GetMapping("/saludo")
    public String saludo(){
        return reservaServicio.saludo();
    }
}
