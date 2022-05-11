package com.bosonit.SpringMongo.repositorio;

import com.bosonit.SpringMongo.modelo.Persona;
import com.mongodb.BasicDBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonaRepositorio {

    @Autowired
    MongoTemplate mongoTemplate;

    public Persona guardarPersona(Persona persona) {
        /*BasicDBObject dbo = new BasicDBObject();
        dbo.append("nombre",persona.getNombre());
        dbo.append("apellido",persona.getApellido());
        dbo.append("domicilio",persona.getDomicilio());*/

        return mongoTemplate.save(persona);
    }

    public List<Persona> find() {
        return mongoTemplate.findAll(Persona.class);
    }

    /**
     * FUNCION QUE ELIMINA UN REGISTRO
     * @param persona
     * @return si devuelve 1, es que se eliminó bien
     */
    public long delete(Persona persona) {
        return mongoTemplate.remove(persona).getDeletedCount();
    }

    public List<Persona> getByName(String nombre) {
        Query consulta = new Query(Criteria.where("nombre").gte(nombre));
        return mongoTemplate.find(consulta,Persona.class);
    }
}