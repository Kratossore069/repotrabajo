package com.bosonit.MiPrimerRESTSpring.controlador;

import com.bosonit.MiPrimerRESTSpring.modelo.Usuario;
import com.bosonit.MiPrimerRESTSpring.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioServicio servicio;

    @GetMapping()
    public ArrayList<Usuario> getAllUsuarios(){
        return servicio.obtenerUsuarios();
    }

    @PostMapping()
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        return this.servicio.guardaUsuario(usuario);
    }
}
