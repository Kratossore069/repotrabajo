package com.bosonit.CRUDPersonas.interfaces;

import com.bosonit.CRUDPersonas.modelo.Persona;

public interface Interfaz {
    Persona postPersona(Persona persona);
    void putPersona(int id);
    void deletePersona(int id);
    Persona getPersonaNombre(Persona persona);
    Persona getPersonaID(Persona persona);
}
