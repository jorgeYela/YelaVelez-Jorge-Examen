package dao;

import Entidades.Operadora;

public interface OperadoraDAO extends GenericDAO<Operadora, Integer>{

	public Operadora buscarOperadora(String operadora);
	
}
