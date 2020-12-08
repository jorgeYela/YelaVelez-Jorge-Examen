package Servlets;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.*;
import Entidades.*;

@WebServlet("/CrearUsuario")
public class CrearUsuario extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	UsuarioDAO dao = DAOFactory.getFactory().getUsuarioDAO();
	Usuario usuario = new Usuario();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//RECUPERANDO VARIABLES NVIADAS DESDE EL FORMULARIO.
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String cedula = request.getParameter("cedula");
		String numero = request.getParameter("numero");
		String tipo = request.getParameter("tipo");
		String operadora = request.getParameter("operadora");
		String correo = request.getParameter("correo");
		String contrasena = request.getParameter("contrasena");
		
		System.out.println("Ingresando al metodo GET (Servlet : CrearUsuario.java)");
		
		try {
			
			usuario.setCodigo(0);
			usuario.setNombre(nombre);
			usuario.setApellido(apellido);
			usuario.setCedula(cedula);
			usuario.setCorreo(correo);
			usuario.setContrasena(contrasena);
			dao.create(usuario);
			
			System.out.println("Usuario insertado de forma correcta");
			
			response.getWriter().print("<html><head><title>Registro Usuario</title></head>"
					 + "<body style=\"background-color: #575757;\">"
					 + "<h2>Bienvenid@ " + usuario.getNombre() + " " + usuario.getApellido() + ", es un gusto contar contigo.</h2>"
					 + "<p>En nuestro sistema podras guardar tus numeros telefonicos y buscar el de tus amigos.</p>"
					 + "<a href=\"http://localhost:8080/YelaVelez-Jorge-Examen/public/IniciarSesion.html\">"
					 + "Para agregar numeros telefonicos a tu perfil, inicia sesion aqui !!</a>"
					 + "</body>");
			
		}catch(Exception e) {
			
			System.out.println("Error: " + e.getMessage());
			response.sendRedirect("http://localhost:8080/YelaVelez-Jorge-Examen/index.html");
		
		}
		
	}

}
