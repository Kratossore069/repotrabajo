package com.example.demo.repositorio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("repo1")
public class PersonaRepo implements InterfazPersonaRepo {
    @Override
    public void registrar(String nombre) {
        System.out.println("Soy "+nombre+" y vengo del repo 1");
    }
}
