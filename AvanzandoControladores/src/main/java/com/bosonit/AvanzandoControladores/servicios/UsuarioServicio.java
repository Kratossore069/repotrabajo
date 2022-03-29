package com.bosonit.AvanzandoControladores.servicios;

import com.bosonit.AvanzandoControladores.interfaces.Interfaz;
import com.bosonit.AvanzandoControladores.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class UsuarioServicio implements Interfaz {

    ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    @Autowired
    Usuario usuario;

    @Override
    public Usuario getUsuario(int id) {
        if(listaUsuarios.contains(id)){
            return listaUsuarios.get(id);
        }else{
            return null;
        }
    }

    @Override
    public Usuario postUsuario(Usuario usuario) {
        Usuario nuevoUsuario = new Usuario(usuario.getId(),usuario.getNombre(), usuario.getApellido());
        listaUsuarios.add(nuevoUsuario);
        return nuevoUsuario;
    }

    @Override
    public void putUsuario(int id, String nombre, String apellido) {
        listaUsuarios.add(new Usuario(id,nombre,apellido));
    }
}
