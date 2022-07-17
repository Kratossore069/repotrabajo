package com.cursojava.CursoJava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.CursoJava.dao.UsuarioDao;
import com.cursojava.CursoJava.modelo.Usuario;

@RestController
public class AuthController {

    @Autowired
    private UsuarioDao usuarioDao;

    @PostMapping("api/login")
    public String login(@RequestBody Usuario usuario) {
        if(usuarioDao.verificarCredenciales(usuario)){
            return "Ok";
        }else{
            return "Fallo";
        }
    }
}
