package org.certificatic.controller;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.certificatic.dao.PersonaDAOImpl;
import org.certificatic.entity.Persona;
import org.certificatic.service.PersonaServiceLocal;


@WebServlet("/personas")
public class PersonaController extends HttpServlet{
	
	@Inject
	PersonaServiceLocal personaServiceLocal;
	
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Persona> personas = personaServiceLocal.listarPersona();
		
		
		Persona nuevaPersona = new Persona();
		nuevaPersona .setIdPersona(personas.size() +1);
		nuevaPersona.setNombre(req.getParameter("nombre"));
		nuevaPersona.setApellidos(req.getParameter("apellidos"));
		nuevaPersona.setEmail(req.getParameter("email"));
		
		System.out.println("Guardando persona::::: " + nuevaPersona);
		personaServiceLocal.guardarPersona(nuevaPersona);
		System.out.println("guardado de forma exitosa");

		 List<Persona> personaslist = personaServiceLocal.listarPersona();

				 req.setAttribute("personas", personaslist);
		  
		  req.getRequestDispatcher("/index.jsp").forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Persona> personas = personaServiceLocal.listarPersona();
		System.out.println("::: Personas ::: " + personas );
		req.setAttribute("personas", personas);
		
		req.getRequestDispatcher("/listadoPersonas.jsp").forward(req, resp);
		
	}

}
