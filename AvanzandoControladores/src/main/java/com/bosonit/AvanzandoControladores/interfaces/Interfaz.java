package com.bosonit.AvanzandoControladores.interfaces;

import com.bosonit.AvanzandoControladores.modelo.Usuario;

public interface Interfaz {
    Usuario getUsuario(int id);
    Usuario postUsuario(Usuario usuario);
    void putUsuario(int id, String nombre, String apellido);
}
