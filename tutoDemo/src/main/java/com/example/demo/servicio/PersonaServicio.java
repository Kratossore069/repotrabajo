package com.example.demo.servicio;

import com.example.demo.repositorio.InterfazPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PersonaServicio implements InterfazPersonaServicio{

    @Autowired
    @Qualifier("repo2")
    private InterfazPersonaRepo repo;

    @Override
    public void registrar(String nombre) {
        repo.registrar(nombre);
    }
}
