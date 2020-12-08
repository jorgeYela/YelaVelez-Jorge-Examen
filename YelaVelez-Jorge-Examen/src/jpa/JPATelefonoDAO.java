package jpa;

import java.util.List; 

import javax.persistence.Query;

import Entidades.Telefono;
import dao.TelefonoDAO;

public class JPATelefonoDAO extends JPAGenericDAO<Telefono, Integer> implements TelefonoDAO {
	
	public JPATelefonoDAO() {
		super(Telefono.class);
	}
	
	public List<Telefono> listarCompras(int idEmpresa){
		Query query = em.createQuery("Select c From Compra c WHERE c.em_com_id.codigo = :nombre");
		query.setParameter("nombre", idEmpresa);
		List<Telefono> listc = query.getResultList();
		return listc;
	}

	@Override
	public List<Telefono> listarComprasPorUsuario(int idUsuario) {
		Query query = em.createQuery("Select c From Compra c WHERE c.us_com_id.codigo = :idUsuario");
		query.setParameter("idUsuario", idUsuario);
		List<Telefono> listc = query.getResultList();
		return listc;
	}
	
}
