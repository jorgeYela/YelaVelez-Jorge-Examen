package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entidades.*;
import dao.*;

@WebServlet("/CrearTelefono")
public class CrearTelefono extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	Tipo tipoO = new Tipo();
	Operadora operadoraO = new Operadora();
	TelefonoDAO dao = DAOFactory.getFactory().getTelefonoDAO();
	TipoDAO tipoDao = DAOFactory.getFactory().getTipoDAO();
	OperadoraDAO operadoraDao = DAOFactory.getFactory().getOperadoraDAO();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String correo_usuario = request.getParameter("correo");
		String numero = request.getParameter("numero");
		String tipo = request.getParameter("tipo");
		String operadora = request.getParameter("operadora");
		
		System.out.println("correo enviado: " + correo_usuario);
		System.out.println("tipo enviado: " + tipo);
		System.out.println("operadora enviada: " + operadora);
		System.out.println("numero enviado: " + numero);
		
		
		UsuarioDAO usuarioDao = DAOFactory.getFactory().getUsuarioDAO();
		Usuario usuario = usuarioDao.buscarUsuario(correo_usuario);
		String nombre = usuario.getNombre();
		String apellido = usuario.getApellido();
		String cedula = usuario.getCedula();
		tipoO = tipoDao.buscarTipo(tipo);
		operadoraO = operadoraDao.buscarOperadora(operadora);
		
		try {
			
			Telefono telefono = new Telefono();
			telefono.setCodigo(0);
			telefono.setNumero(numero);
			telefono.setOpe_tel_id(operadoraO);
			telefono.setTip_tel_id(tipoO);
			telefono.setUsu_tel_id(usuario);
			dao.create(telefono);
			
			System.out.println("Telefono creado correctamente !!");
			
			response.sendRedirect("http://localhost:8080/YelaVelez-Jorge-Examen/JSP/VentanaUsuario.jsp?correo="+correo_usuario+"&nombre="+nombre+"&apellido="+apellido+"&cedula="+cedula);
			
		}catch(Exception e) {
			
			System.out.println("Error: " + e.getMessage());
			
		}
		
	}

}
