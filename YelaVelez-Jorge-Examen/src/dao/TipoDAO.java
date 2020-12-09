package dao;

import Entidades.Tipo;

public interface TipoDAO extends GenericDAO<Tipo, Integer>{

	public Tipo buscarTipo(String tipo);
	
}
