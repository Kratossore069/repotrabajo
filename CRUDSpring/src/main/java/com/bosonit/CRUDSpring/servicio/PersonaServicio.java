package com.bosonit.CRUDSpring.servicio;

import com.bosonit.CRUDSpring.interfaces.RepositorioPersona;
import com.bosonit.CRUDSpring.interfacesService.InterfazPersonaServicio;
import com.bosonit.CRUDSpring.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonaServicio implements InterfazPersonaServicio {

    @Autowired
    RepositorioPersona repositorioPersona;

    ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

    @Override
    public List<Persona> listarPersonas() {
        return (List<Persona>)repositorioPersona.findAll();
    }

    @Override
    public List<Persona> listarPorId(int id){ //Error aquí
        try{
            List<Persona> personaEncontrada = (List<Persona>)listaPersonas.get(id);
            return personaEncontrada;
        }catch (ChangeSetPersister.NotFoundException exception){

        }
    }

    @Override
    public int guardarPersona(Persona persona) {
        listaPersonas.add(persona);
        return 0;
    }

    @Override
    public void borrarPersona(int id) {
        if(listaPersonas.contains(id)){
            listaPersonas.remove(id);
        }
    }
}
