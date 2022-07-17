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

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

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
    }

    @GetMapping("api/usuario")
    public List<Usuario> getUsers() {
        return usuarioDao.getUsers();
    }

    @PostMapping("api/usuario")
    public void registrarUsuario(@RequestBody Usuario usuario) {

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hash = argon2.hash(1,1024,1,usuario.getPassword());
        usuario.setPassword(hash);

        usuarioDao.registrarUsuario(usuario);
    }

    @DeleteMapping("api/usuario/{id}")
    public void eliminarUsuario(@PathVariable int id){
        usuarioDao.eliminar(id);
    }
}
