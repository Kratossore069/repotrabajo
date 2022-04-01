package com.bosonit.REstFul.controlador;

import com.bosonit.REstFul.modelo.Perfil;
import com.bosonit.REstFul.modelo.Perfil1;
import com.bosonit.REstFul.modelo.Perfil2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class PerfilesController {

    @Autowired
    Perfil perfil;

    @Autowired
    Perfil1 perfil1;

    @Autowired
    Perfil2 perfil2;

    /**
     * FUNCION QUE RETORNA LAS VARIABLES
     * INSERTADAS
     * @return variables insertadas
     */
    @GetMapping("/parametros")
    String verVariables(){
        return perfil.url+" con password "+perfil.password;
    }

    /**
     * METODO QUE RETORNA EL VALOR DEL PERFIL
     * DE CADA UNA DE LAS CLASES PROPIAS
     */
    @GetMapping("/perfil")
    void verPerfil(){
        perfil1.miFuncion();
        perfil2.miFuncion();
    }
}
