package com.cursojava.CursoJava.dao;

import java.util.List;

import com.cursojava.CursoJava.modelo.Usuario;

public interface UsuarioDao {
    List<Usuario> getUsers();

    void eliminar(int id);

    void registrarUsuario(Usuario usuario);

    boolean verificarCredenciales(Usuario usuario);
}
