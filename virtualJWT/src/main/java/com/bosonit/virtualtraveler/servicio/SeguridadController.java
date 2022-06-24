package com.bosonit.virtualtraveler.servicio;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.bosonit.virtualtraveler.modelo.SeguridadPersona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class SeguridadController {

    @Autowired
    SeguridadServicio seguridadServicio;

    @PostMapping("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response validar(SeguridadPersona persona) {
        boolean estado = seguridadServicio.validar(persona.getUsername(), persona.getPassword());
        if (estado) { //Si las credenciales son correctas, se envía el token
            final String HASH = "AHGC-12BD";
            JsonObject json = Json.createObjectBuilder().add("token", HASH).build();
            return Response.status(Response.Status.CREATED).entity(json).build();
        }// Si son incorrectas, se muestra un 401
        JsonObject json = Json.createObjectBuilder().add("mensaje", "Datos incorrectos").build();
        return Response.status(Response.Status.UNAUTHORIZED).entity(json).build();
    }
}
