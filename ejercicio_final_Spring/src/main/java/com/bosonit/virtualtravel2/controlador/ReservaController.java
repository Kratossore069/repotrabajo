package com.bosonit.virtualtravel2.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bosonit.virtualtravel2.modelo.Reserva;
import com.bosonit.virtualtravel2.servicio.ReservaServicioImp;

@Controller
public class ReservaController {
    
    @Autowired
    ReservaServicioImp reservaServicioImp;

    @GetMapping("/saludo")
    public String saludo(){
        return reservaServicioImp.saludo();
    }

    @PostMapping("/reservar")
    public Reserva hacerReserva(@RequestParam int diaReserva, @RequestParam String fechaReserva){
        return reservaServicioImp.hacerReserva(diaReserva, fechaReserva);
    }
}