package org.certificatic.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.certificatic.dao.PersonaDAOLocal;
import org.certificatic.entity.Persona;

@Stateless
public class PersonaServiceImpl implements PersonaServiceLocal, PersonaServiceRemote{
	
	@EJB
	private PersonaDAOLocal personaDAOLocal;
	
	
	@Override
	public List<Persona> listarPersona() {
		return personaDAOLocal.listarPersona();
	}

	

	@Override
	public void guardarPersona(Persona persona) {
		personaDAOLocal.guardarPersona(persona);
		
	}



}
