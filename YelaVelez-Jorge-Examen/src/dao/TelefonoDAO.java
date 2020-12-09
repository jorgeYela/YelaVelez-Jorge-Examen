package dao;

import java.util.List;  

import Entidades.Telefono;

public interface TelefonoDAO extends GenericDAO<Telefono, Integer> {
	
	public List<Telefono> listarTelefonos(String informacion);
	
	public List<Telefono> listarTelefonosPorUsuario(int idUsuario);
	
}
