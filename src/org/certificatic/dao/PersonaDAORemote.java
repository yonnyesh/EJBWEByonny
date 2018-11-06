package org.certificatic.dao;

import java.util.List;

import javax.ejb.Remote;

import org.certificatic.entity.Persona;

@Remote
public interface PersonaDAORemote {

	public List<Persona> listarPersona();
	
	public void guardarPersona(Persona persona);
}
