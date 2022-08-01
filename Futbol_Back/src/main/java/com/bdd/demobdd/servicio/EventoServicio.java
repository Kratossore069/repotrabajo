package com.bdd.demobdd.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdd.demobdd.modelo.Evento;
import com.bdd.demobdd.repositorio.EventoRepo;

@Service
public class EventoServicio {

    @Autowired
    public EventoRepo eventoRepo;
    
    /**
     * LISTAR TODOS LOS EVENTOS ACONTECIDOS
     * @return
     */
    public List<Evento> listarEventos(){
        return eventoRepo.findAll();
    }
}
