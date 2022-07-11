package com.bosonit.SpringMongo.controlador;

import com.bosonit.SpringMongo.servicio.EmailServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.PathParam;

@RestController
@RequestMapping("/correo")
public class EmailController {

    @Autowired
    EmailServiceImple emailServicio;

    @PostMapping("/")
    public void sendEmail(@PathParam("destino") String destinatario,
                          @PathParam("contexto") String contexto, @PathParam("cuerpo") String cuerpo) {
        emailServicio.sendEmail(destinatario, contexto, cuerpo);
    }
}
