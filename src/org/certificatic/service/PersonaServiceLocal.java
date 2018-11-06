package org.certificatic.service;

import java.util.List;

import javax.ejb.Local;

import org.certificatic.entity.Persona;

@Local
public interface PersonaServiceLocal {
	
	public List<Persona> listarPersona();
	
	public Persona registrarPersona(Persona persona);
	
	public void guardarPersona(Persona persona);

}
