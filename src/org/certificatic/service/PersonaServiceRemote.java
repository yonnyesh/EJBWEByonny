package org.certificatic.service;

import java.util.List;

import javax.ejb.Remote;

import org.certificatic.entity.Persona;

@Remote
public interface PersonaServiceRemote {
	
	public List<Persona> listarPersona();
	
	
	public void guardarPersona(Persona persona);

}
