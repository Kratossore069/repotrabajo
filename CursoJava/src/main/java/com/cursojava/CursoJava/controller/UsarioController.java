package com.cursojava.CursoJava.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.CursoJava.dao.UsuarioDao;
import com.cursojava.CursoJava.dao.UsuarioDaoImp;
import com.cursojava.CursoJava.modelo.Usuario;

@RestController
public class UsarioController {

    @Autowired
    //private UsuarioDaoImp usuarioDao;
    private UsuarioDao usuarioDao;

    @GetMapping("api/usuario/{id}")
    public Usuario getUser(@PathVariable int id) {
        Usuario newUser = new Usuario();
        newUser.setId(id);
        newUser.setNombre("Marcos");
        newUser.setApellido("Rivera");
        newUser.setEmail("marcos@mail.com");
        return newUser;
        //return null;
    }

    @GetMapping("api/usuario")
    public List<Usuario> getUsers() {
        return usuarioDao.getUsers();
    }

    @PostMapping("api/usuario")
    public void registrarUsuario(@RequestBody Usuario usuario) {
        usuarioDao.registrarUsuario(usuario);
    }

    @DeleteMapping("api/usuario/{id}")
    public void eliminarUsuario(@PathVariable int id){
        usuarioDao.eliminar(id);
    }
}
