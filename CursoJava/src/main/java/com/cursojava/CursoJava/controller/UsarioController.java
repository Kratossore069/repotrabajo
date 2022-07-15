package com.cursojava.CursoJava.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.CursoJava.modelo.Usuario;

@RestController
public class UsarioController {

    @GetMapping("usuario/{id}")
    public Usuario getUser(@PathVariable int id) {
        Usuario newUser = new Usuario();
        newUser.setId(id);
        newUser.setNombre("Marcos");
        newUser.setApellido("Rivera");
        newUser.setEmail("marcos@mail.com");
        return newUser;
    }

    @GetMapping("usuario")
    public List<Usuario> getUsers() {
        List<Usuario> listaUsuarios = new ArrayList<>();

        Usuario newUser = new Usuario();
        newUser.setId(10);
        newUser.setNombre("Marcos");

        Usuario newUser2 = new Usuario();
        newUser2.setId(20);
        newUser2.setNombre("Pedro");

        Usuario newUser3 = new Usuario();
        newUser3.setId(30);
        newUser3.setNombre("Maria");

        listaUsuarios.add(newUser);
        listaUsuarios.add(newUser2);
        listaUsuarios.add(newUser3);

        return listaUsuarios;
    }
}
