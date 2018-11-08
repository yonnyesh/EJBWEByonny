package org.certificatic.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import org.certificatic.entity.Persona;

@Stateless
public class PersonaDAOImpl implements PersonaDAOLocal, PersonaDAORemote {

	private static List<Persona> personas = new ArrayList();

	static {
		Persona persona1 = new Persona(1, "Juanito", "Perez Aguilar", "correo@juanes");
		Persona persona2 = new Persona(2, "Ana", "Aguilar Solis", "correo2@juanes");

		personas.add(persona1);
		personas.add(persona2);
	}

	@Override
	public List<Persona> listarPersona() {
		return personas;
	}

	@Override
	public void guardarPersona(Persona persona) {
		personas.add(persona);

	}

}
