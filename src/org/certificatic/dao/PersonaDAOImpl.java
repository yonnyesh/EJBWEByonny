package org.certificatic.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import org.certificatic.entity.Persona;

@Stateless
public class PersonaDAOImpl implements PersonaDAOLocal, PersonaDAORemote {

	private static List<Persona> personas = new ArrayList();
	@Override
	public List<Persona> listarPersona() {
		return personas;
	}
		

	@Override
	public void guardarPersona(Persona persona) {
		personas.add(persona);
		
	}

}
