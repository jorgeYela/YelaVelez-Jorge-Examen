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

@WebServlet("/TelefonosPublicos")
public class TelefonosPublicos extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;
	private UsuarioDAO usuarioDao;
	private Telefono telefono;
	private TelefonoDAO telefonoDao;
	private List<Telefono> listaTelefonos;
       
    public TelefonosPublicos() {
        
    	telefono = new Telefono();
    	usuarioDao = DAOFactory.getFactory().getUsuarioDAO();
    	telefonoDao = DAOFactory.getFactory().getTelefonoDAO();
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String argumento = request.getParameter("informacion");
		
		String url = null;
		
		try {
			
			listaTelefonos = telefonoDao.listarTelefonos(argumento);
			
			request.setAttribute("telefonosPublicos", listaTelefonos);
			
			System.out.println("Telefonos Publicos recuperados satisfactoriamente !!");
			
			url = "/JSP/Telefonos.jsp";
			
		}catch(Exception e) {
			
			System.out.println("Error: " + e.getMessage());
			
			url = "index.html";
			
		}
		
		System.out.println("Redireccionando.....");
		getServletContext().getRequestDispatcher(url).forward(request, response);
		
	}

}
