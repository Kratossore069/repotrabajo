package com.bosonit.VirtualTravel;

import com.bosonit.VirtualTravel.servicio.PersonaServicio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
import org.json.*;
import java.util.List;

@SpringBootTest
class VirtualTravelApplicationTests {

	@Autowired
	private PersonaServicio personaServicio;

	@Test
	public void getPersonas(){
		/*List<Persona> personas = personaServicio.getAll();
		Assertions.assertEquals(1,personas.size(),"Debe haber sólo una persona");*/
	}
	@Test
	public void deletePersona() throws JSONException {
		/*List<Persona> personas = personaServicio.getAll();
		Persona nuevaPersona = new Persona(2,"Ignacio","Pérez","Sevilla");
		personaServicio.guardarPersona(nuevaPersona);
		personaServicio.delete(nuevaPersona);
		Assertions.assertEquals(1,personas.size(),"Debe haberse eliminado la persona");*/
	}


}
