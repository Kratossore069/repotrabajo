package com.bosonit.virtualtraveler.controlador;

import com.bosonit.virtualtraveler.modelo.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.bosonit.virtualtraveler.servicio.ReservaServicio;

import java.util.List;

@Controller
public class ReservaController {
    
    @Autowired
    ReservaServicio reservaServicio;

    @GetMapping("/saludo")
    public String saludo(){
        return reservaServicio.saludo();
    }

    @PostMapping("/reservar")
    public Reserva hacerReserva(@RequestBody Reserva reserva){
        return reservaServicio.hacerReserva(reserva);
    }

    @DeleteMapping("/borrar")
    public void eliminarReserva(@RequestBody Reserva reserva){
        reservaServicio.eliminarReserva(reserva);
    }

    @PutMapping("/update")
    public Reserva updateReserva(@RequestBody Reserva reserva){
        return reservaServicio.updateReserva(reserva);
    }

    @GetMapping("/listar")
    public List<Reserva> getAllReservas(){
        return reservaServicio.getAllReservas();
    }
}
