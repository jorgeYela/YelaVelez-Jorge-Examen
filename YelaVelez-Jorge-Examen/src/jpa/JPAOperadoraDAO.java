package jpa;

import javax.persistence.Query;  
import Entidades.Operadora;
import Entidades.Usuario;
import dao.OperadoraDAO;

public class JPAOperadoraDAO extends JPAGenericDAO<Operadora, Integer> implements OperadoraDAO{

	public JPAOperadoraDAO() {
		super(Operadora.class);
	}
	
	@Override
	public Operadora buscarOperadora(String operadora) {
		
		Query query = em.createQuery("SELECT o FROM Operadora o WHERE o.nombre = :operadora");
		query.setParameter("operadora", operadora);
		Operadora o = (Operadora) query.getSingleResult();
		return o;
		
	}



}
