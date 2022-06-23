package com.bosonit.virtualtraveler.servicio;

import java.io.IOException;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
@PreMatching
public class Intercepter implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext request) throws IOException {

        String url = request.getUriInfo().getAbsolutePath().toString();

        if (url.contains("/api/auth")) {
            return;
        }

        String token = request.getHeaderString("Autorizacion");


        if (token==null) {
            JsonObject json = Json.createObjectBuilder()
                    .add("mensaje", "Credenciales son necesarias")
                    .build();
            request.abortWith(Response.status(Response.Status.UNAUTHORIZED)
                    .entity(json).type(MediaType.APPLICATION_JSON).build());
            return;
        }

        if (!token.equals("Una linea muy grande")) {
            JsonObject json = Json.createObjectBuilder()
                    .add("mensaje", "Credenciales incorrectas")
                    .build();
            request.abortWith(Response.status(Response.Status.UNAUTHORIZED)
                    .entity(json).type(MediaType.APPLICATION_JSON).build());
            return;
        }
    }

}
