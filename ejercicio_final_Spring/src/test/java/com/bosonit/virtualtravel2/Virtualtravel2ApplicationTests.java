package com.bosonit.virtualtravel2;

import com.bosonit.virtualtravel2.modelo.Usuario;
import com.bosonit.virtualtravel2.repositorio.UsuarioRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;

@SpringBootTest
class Virtualtravel2ApplicationTests {

    @Autowired
    private UsuarioRepo usuarioRepo;

    /**
     * TEST QUE SE ASEGURA DE QUE EXISTE
     * UN USUARIO NUEVO Y SE CREA
     */
    @Test
    void crearUsuarioTest() {
        Usuario user = new Usuario();
		user.setId(1);
		user.setNombre("admin");
		user.setPassword("admin");
		Usuario usuarioCreado = usuarioRepo.save(user);
        Assertions.assertTrue(usuarioCreado.getPassword().equalsIgnoreCase(user.getPassword()));
    }

}
