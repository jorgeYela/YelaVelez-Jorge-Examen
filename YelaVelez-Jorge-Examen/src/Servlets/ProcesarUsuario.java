package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entidades.Usuario;
import dao.*;

@WebServlet("/ProcesarUsuario")
public class ProcesarUsuario extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public ProcesarUsuario() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String correo = request.getParameter("correo");
		String contra = request.getParameter("contrasena");
		
		UsuarioDAO usuarioDao = DAOFactory.getFactory().getUsuarioDAO();
		Usuario usuario = usuarioDao.buscarUsuario(correo);
		
		if(usuario != null) {
			
			System.out.println("Usuario: " + usuario.getCorreo() + ", recuperado con exito !!");
			
			String nombre_ususario = usuario.getNombre();
			String apellido_usuario = usuario.getApellido();
			String cedula_usuario = usuario.getCedula();
			
			response.sendRedirect("http://localhost:8080/YelaVelez-Jorge-Examen/JPSs/VentanaUsuario.jsp?correo="+correo+"&contra="+contra+"&nombre="+nombre_ususario+"&apellido="+apellido_usuario+"&cedula="+cedula_usuario);
			
		} else {
			
			System.out.println("Usuario no recuperado !!");
			response.sendRedirect("http://localhost:8080/YelaVelez-Jorge-Examen/index.html");
			
		}
		
	}

}
