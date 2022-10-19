package com.portfolio.eCommerce.controlador;

import com.portfolio.eCommerce.modelo.Usuario;
import com.portfolio.eCommerce.servicio.UsuarioServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServicio usuarioServicio;

    private final Logger log = LoggerFactory.getLogger(UsuarioController.class);

    @GetMapping("/registro")
    public String create() {
        return "usuario/registro";
    }

    @PostMapping("/save")
    public String save(Usuario usuario) {
        log.info("Usuario registrado " + usuario);
        usuario.setTipo("USER");
        usuarioServicio.save(usuario);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(){
        return "usuario/login";
    }
}
