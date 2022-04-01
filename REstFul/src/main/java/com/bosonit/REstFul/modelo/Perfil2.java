package com.bosonit.REstFul.modelo;

import com.bosonit.REstFul.interfaces.InterfazPerfiles;
import org.springframework.stereotype.Component;

@Component
public class Perfil2 implements InterfazPerfiles {
    @Override
    public void miFuncion() {
        System.out.println("Perfil2");
    }
}
