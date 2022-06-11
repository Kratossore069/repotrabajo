package com.bosonit.virtualtravel2.controlador;

import com.bosonit.virtualtravel2.exceptions.MiExcepcion;
import com.bosonit.virtualtravel2.modelo.Reserva;
import com.bosonit.virtualtravel2.repositorio.ReservaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReservaController {

    @Autowired
    ReservaRepo reservaRepo;

    @GetMapping("/lista")
    public ResponseEntity<List<Reserva>> listarReservas() {
        try {
            List<Reserva> reservas = reservaRepo.findAll();
            if (reservas.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(reservas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/reservar")
    public ResponseEntity<Reserva> crearReserva(@RequestBody Reserva reserva) {
        try {
            Reserva nuevaReserva = reservaRepo
                    .save(new Reserva(reserva.getDiaReserva(), reserva.getFechaReserva()));
            return new ResponseEntity<>(nuevaReserva, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<HttpStatus> borrarReserva(@PathVariable("id") int id) {
        try {
            reservaRepo.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    
    /*
     * @PutMapping("/tutorials/{id}")
     * public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") String
     * id, @RequestBody Tutorial tutorial) {
     * 
     * }
     */

    /*
     * }
     * 
     * @DeleteMapping("/tutorials")
     * public ResponseEntity<HttpStatus> deleteAllTutorials() {
     * 
     * }
     */

}
