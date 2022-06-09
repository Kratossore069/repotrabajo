package com.bosonit.virtualtravel2.controlador;

import com.bosonit.virtualtravel2.exceptions.MiExcepcion;
import com.bosonit.virtualtravel2.modelo.Reserva;
import com.bosonit.virtualtravel2.repositorio.ReservaRepo;
import com.bosonit.virtualtravel2.servicio.ReservaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8090")
@RestController
@RequestMapping("/virtualtravel")
public class ReservaController {

    @Autowired
    ReservaRepo reservaRepo;

    @GetMapping("/listar")
    public ResponseEntity<List<Reserva>> verReservas() {
        try {
            List<Reserva> reservas = reservaRepo.listarReservas();
            if (reservas.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(reservas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*
     * @Autowired
     * private ReservaServicio servicioReserva;
     * 
     * @PostMapping("reservar")
     * public void hacerReserva(int diaReserva, String fechaReserva) throws
     * MiExcepcion {
     * try{
     * servicioReserva.hacerReserva(diaReserva, fechaReserva);
     * }catch(Exception ex){
     * throw new MiExcepcion(ex.getMessage());
     * }
     * }
     * 
     * @GetMapping("lista")
     * public List<Reserva> listaReservas() {
     * return servicioReserva.listaReservas();
     * }
     * 
     * @GetMapping("buscar")
     * public Reserva obtenerReserva(@RequestParam("diaReserva") int diaReserva) {
     * return servicioReserva.obtenerReserva(diaReserva);
     * }
     */
}
