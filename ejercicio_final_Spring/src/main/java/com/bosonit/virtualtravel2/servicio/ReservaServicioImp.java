package com.bosonit.virtualtravel2.servicio;

import com.bosonit.virtualtravel2.modelo.Reserva;
import com.bosonit.virtualtravel2.repositorio.ReservaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReservaServicioImp implements ReservaServicio {

    @Autowired
    private ReservaRepo reservaRepo;

    /**
     * METODO QUE HACE UNA RESERVA A LA BDD
     * @param diaReserva
     * @param fechaReserva
     */
    @Override
    public void hacerReserva(int diaReserva, Date fechaReserva) {
        Reserva reserva = new Reserva(diaReserva, fechaReserva);
        reservaRepo.save(reserva);
    }

    /**
     * FUNCION QUE MUESTRA LAS RESERVAS QUE SE HAN HECHO
     * @return reservas hechas
     */
    @Override
    public List<Reserva> listaReservas() {
        return reservaRepo.findAll();
    }

    /**
     * FUNCION QUE OBTIENE LA RESERVA MEDIANTE EL ID
     * @param diaReserva
     * @return la reserva o no
     */
    @Override
    public Reserva obtenerReserva(int diaReserva) {
        return reservaRepo.findById(diaReserva).orElse(null);
    }
}
