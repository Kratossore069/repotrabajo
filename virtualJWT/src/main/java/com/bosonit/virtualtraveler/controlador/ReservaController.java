package com.bosonit.virtualtraveler.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bosonit.virtualtraveler.modelo.Reserva;
import com.bosonit.virtualtraveler.servicio.ReservaServicio;

@RestController
public class ReservaController {

    @Autowired
    ReservaServicio reservaServicio;


    @GetMapping("/saludo")
    public String saludo() {
        return reservaServicio.saludo();
    }

    @PostMapping("/reservar")
    public Reserva hacerReserva(@RequestParam int dia, @RequestParam String fecha) {
        Reserva reservaHecha = null;
        if (fecha != null) {
            reservaHecha = reservaServicio.hacerReserva(dia, fecha);
        }
        return reservaHecha;
    }

    @GetMapping("/lista")
    public List<Reserva> verReservas() {
        return reservaServicio.verReservas();
    }

    @GetMapping("/buscar")
    public List<Reserva> buscarReserva(@RequestParam int dia){
        return reservaServicio.buscarReserva(dia);
    }

    @DeleteMapping("/borrar")
    public void eliminarReserva(@RequestParam int dia){
        reservaServicio.eliminarReserva(dia);
        System.out.println("Se eliminó la reserva del día "+dia);
    }

    
}
