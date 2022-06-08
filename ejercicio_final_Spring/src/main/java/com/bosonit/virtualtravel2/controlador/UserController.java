package com.bosonit.virtualtravel2.controlador;

import java.util.Date;

import javax.websocket.server.PathParam;


import com.bosonit.virtualtravel2.servicio.UserServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/seguridad")
public class UserController {

    @Autowired
    UserServicio seguridadServicio;

    /**
     * FUNCIÓN QUE RETORNA SI TODO ESTÁ BIEN
     * @return saludo
     */
    @GetMapping
    public String saludo(){
        return "Todo funciona";
    }
/*
    @PostMapping("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response validar(@PathParam("username") String username, @PathParam("password") String password) {
        boolean estado = seguridadServicio.validar(username, password);
        if (estado) {
            String key = "mi_clave";
            long tiempo = System.currentTimeMillis();
            String jwt = Jwts.builder()
                    .signWith(SignatureAlgorithm.HS256, key)
                    .setSubject("Spring Security")
                    .setIssuedAt(new Date(tiempo))
                    .setExpiration(new Date(tiempo + 900000))
                    .claim("email", "vurzomikka@vusra.com")
                    .compact();
            JsonObject json = Json.createObjectBuilder().add("Token", jwt).build();

            return Response.status(Response.Status.CREATED).entity(json).build();
        }
        return Response.status(Response.Status.UNAUTHORIZED).build();
    }*/
}
