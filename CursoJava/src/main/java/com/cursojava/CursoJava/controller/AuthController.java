package com.cursojava.CursoJava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.CursoJava.dao.UsuarioDao;
import com.cursojava.CursoJava.modelo.Usuario;
import com.cursojava.CursoJava.utils.JWTUtil;

@RestController
public class AuthController {

    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private JWTUtil jwtUtil;

    /**
     * FUNCION QUE CREA EL TOKEN QUE
     * SE DEVUELVE AL LOGUEARSE CON
     * EXITO EN LA PLATAFORMA
     * @param usuario usuario logueado
     * @return el token o un fallo
     */
    @PostMapping("api/login")
    public String login(@RequestBody Usuario usuario) {
        Usuario usuarioLogueado = usuarioDao.obtenerUsuarioPorCredenciales(usuario);
        if (usuarioLogueado != null) {
            String token = jwtUtil.create(String.valueOf(usuarioLogueado.getId()), usuarioLogueado.getEmail());
            return token;
        } else {
            return "Fallo";
        }
    }
}
