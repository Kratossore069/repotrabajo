package com.bosonit.ejercicios_bosonit.repositorio;

import com.bosonit.ejercicios_bosonit.modelo.Persona;

public interface IPersona {
    Persona buscarPorNombre(String nombre);
    Persona buscarApellido(String apellido);
    Persona buscarFecha(int fecha);
}
