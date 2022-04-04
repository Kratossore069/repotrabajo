package com.bosonit.CRUDSpring.controlador;

import com.bosonit.CRUDSpring.interfacesService.InterfazPersonaServicio;
import com.bosonit.CRUDSpring.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class PersonaController {

    @Autowired
    InterfazPersonaServicio servicio;

    @GetMapping("/listar")
    List<Persona> listarPersonas(){
        return servicio.listarPersonas();
    }
}
