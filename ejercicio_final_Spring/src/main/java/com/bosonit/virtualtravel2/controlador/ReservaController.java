package com.bosonit.virtualtravel2.controlador;

import com.bosonit.virtualtravel2.modelo.Reserva;
import com.bosonit.virtualtravel2.servicio.ReservaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ReservaController {

    @Autowired
    private ReservaServicio servicioReserva;

    @PostMapping("reservar")
    public void hacerReserva(int diaReserva, String fechaReserva) {
        servicioReserva.hacerReserva(diaReserva, fechaReserva);
    }

    @GetMapping("lista")
    public List<Reserva> listaReservas() {
        return servicioReserva.listaReservas();
    }

    @GetMapping("buscar")
    public Reserva obtenerReserva(@RequestParam("diaReserva") int diaReserva) {
        return servicioReserva.obtenerReserva(diaReserva);
    }
}
