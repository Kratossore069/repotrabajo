package com.bosonit.virtualtravel2.servicio;

import com.bosonit.virtualtravel2.repositorio.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicio {

    @Autowired
    UserRepo repoSeguridad;

    /**
     * FUNCION QUE VALIDA UN USUARIO Y CONTRASENIA
     * @param username
     * @param password
     * @return true or false
     */
    public boolean validar(String username,String password){
        return repoSeguridad.validar(username, password);
    }
}
