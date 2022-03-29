package com.bosonit.AvanzandoControladores.controlador;

import com.bosonit.AvanzandoControladores.modelo.Usuario;
import com.bosonit.AvanzandoControladores.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class UsuarioControlador {

    @Autowired
    UsuarioServicio servicio;

    @GetMapping("/user/{id}")
    public Usuario getUsuario(int id){
        return servicio.getUsuario(id);
    }

    @PostMapping
    public Usuario postUsuario(Usuario usuario){
        return servicio.postUsuario(usuario);
    }

    @PutMapping
    public void putUsuario(int id, String nombre, String apellido){
        servicio.putUsuario(id,nombre,apellido);
    }
}
