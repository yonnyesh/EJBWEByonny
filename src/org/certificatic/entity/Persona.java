package org.certificatic.entity;


public class Persona {
	
	private int idPersona;
	private String nombre;
	private String apellidos;
	private String email;
	
	
	public Persona() {
		
	}
	
	public Persona(int idPersona, String nombre, String apellidos, String email) {
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email="
				+ email + "]";
	}
	
	

}
