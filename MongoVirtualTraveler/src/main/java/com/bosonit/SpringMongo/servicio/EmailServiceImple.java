package com.bosonit.SpringMongo.servicio;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;


public class EmailServiceImple{

    @Autowired
    private JavaMailSender javaMailSender;

    /**
     * METODO QUE ENVIA UN CORREO CON LOS DATOS DE LA RESERVA
     * @param destinatario
     * @param contexto
     * @param cuerpo
     */
    public void sendEmail(String destinatario, String contexto,String cuerpo){
        SimpleMailMessage message=new SimpleMailMessage();

        message.setFrom("App Spring Boot");
        message.setTo(destinatario);
        message.setText(cuerpo);
        message.setSubject(contexto);

        javaMailSender.send(message);

        System.out.println("Correo de reserva enviado");
    }
}
