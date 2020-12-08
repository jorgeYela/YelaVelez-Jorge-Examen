package dao;

import java.util.List;  

import Entidades.Telefono;

public interface TelefonoDAO extends GenericDAO<Telefono, Integer> {
	
	public List<Telefono> listarCompras(int idEmpresa);
	
	public List<Telefono> listarComprasPorUsuario(int idUsuario);
	
}
