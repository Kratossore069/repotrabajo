package com.example.demo.repositorio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("repo2")
public class PersonaRepo2 implements InterfazPersonaRepo {

    @Override
    public void registrar(String nombre) {
        System.out.println("Soy "+nombre+" y vengo del repo2.");
    }
}
