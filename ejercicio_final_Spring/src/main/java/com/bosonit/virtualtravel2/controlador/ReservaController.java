package com.bosonit.virtualtravel2.controlador;

import com.bosonit.virtualtravel2.modelo.Reserva;
import com.bosonit.virtualtravel2.servicio.ReservaServicioImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("reserva")
public class ReservaController {

    @Autowired
    private ReservaServicioImp servicioReserva;

    @PostMapping("/")
    public void hacerReserva(int diaReserva, Date fechaReserva) {
        servicioReserva.hacerReserva(diaReserva, fechaReserva);
    }

    @GetMapping("lista")
    public List<Reserva> listaReservas() {
        return servicioReserva.listaReservas();
    }

    @GetMapping("/")
    public Reserva obtenerReserva(@RequestParam("diaReserva") int diaReserva) {
        return servicioReserva.obtenerReserva(diaReserva);
    }
}
