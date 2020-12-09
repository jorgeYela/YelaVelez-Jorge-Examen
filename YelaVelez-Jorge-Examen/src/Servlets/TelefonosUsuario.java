package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entidades.*;
import dao.*;

@WebServlet("/TelefonosUsuario")
public class TelefonosUsuario extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;
	private UsuarioDAO usuarioDao;
	private Telefono telefono;
	private TelefonoDAO telefonoDao;
	private List<Telefono> listaTelefonos;
       
    public TelefonosUsuario() {
        
    	telefono = new Telefono();
    	usuarioDao = DAOFactory.getFactory().getUsuarioDAO();
    	telefonoDao = DAOFactory.getFactory().getTelefonoDAO();
    	
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String correo = request.getParameter("correo");
		
		String url = null;
		
		try {
			
			usuario = usuarioDao.buscarUsuario(correo);
			
			int codigo_usuario = usuario.getCodigo();
			
			listaTelefonos = telefonoDao.listarComprasPorUsuario(codigo_usuario);
			
			request.setAttribute("telefonos", listaTelefonos);
			
			System.out.println("Telefonos retornados a la ventana con exito...");
			
			url = "/JSP/MisTelefonos.jsp";
			
		}catch(Exception e) {
			
			System.out.println("Error: " + e.getMessage());
			
			url = "/JSP/VentanaUsuario.jsp";
			
		}
		
		System.out.println("Redireccionando.......");
		getServletContext().getRequestDispatcher(url).forward(request, response);
		
	}

}
