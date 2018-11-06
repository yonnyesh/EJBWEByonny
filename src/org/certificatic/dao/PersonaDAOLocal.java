package org.certificatic.dao;

import java.util.List;

import javax.ejb.Local;

import org.certificatic.entity.Persona;

@Local
public interface PersonaDAOLocal {

	public List<Persona> listarPersona();
	
	public void guardarPersona(Persona persona);
	
}
