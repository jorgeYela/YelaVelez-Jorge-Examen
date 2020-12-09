package dao;

import java.util.List;  

import Entidades.Telefono;

public interface TelefonoDAO extends GenericDAO<Telefono, Integer> {
	
	public List<Telefono> listarCompras(String correo);
	
	public List<Telefono> listarComprasPorUsuario(int idUsuario);
	
}
