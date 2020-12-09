package jpa;

import javax.persistence.Query;  
import Entidades.Operadora;
import Entidades.Tipo;
import dao.OperadoraDAO;
import dao.TipoDAO;

public class JPATipoDAO extends JPAGenericDAO<Tipo, Integer> implements TipoDAO{

	public JPATipoDAO() {
		super(Tipo.class);
	}

	@Override
	public Tipo buscarTipo(String tipo) {
		
		Query query = em.createQuery("SELECT t FROM Tipo t WHERE t.nombre = :tipo");
		query.setParameter("tipo", tipo);
		Tipo t = (Tipo) query.getSingleResult();
		return t;
		
	}
	
	
	
}
