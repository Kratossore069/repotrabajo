package com.bosonit.SpringMongo;

import com.bosonit.SpringMongo.repositorio.PersonaRepositorio;
import com.bosonit.SpringMongo.servicio.PersonaServicio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class SpringMongoApplicationTests {

	@Autowired
	private PersonaServicio personaServicio;

	@MockBean
	private PersonaRepositorio personaRepositorio;



}
