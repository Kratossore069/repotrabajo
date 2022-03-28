package com.bosonit.MiPrimerRESTSpring.servicios;

import com.bosonit.MiPrimerRESTSpring.modelo.Usuario;
import com.bosonit.MiPrimerRESTSpring.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioServicio {
    @Autowired
    UsuarioRepositorio repositorio;

    public ArrayList<Usuario> obtenerUsuarios(){
        return (ArrayList<Usuario>)repositorio.findAll();
    }

    public Usuario guardaUsuario(Usuario usuario){
        return repositorio.save(usuario);
    }
}
