package jpa;

import java.util.List; 

import javax.persistence.Query;

import Entidades.Telefono;
import dao.TelefonoDAO;

public class JPATelefonoDAO extends JPAGenericDAO<Telefono, Integer> implements TelefonoDAO {
	
	public JPATelefonoDAO() {
		super(Telefono.class);
	}

	@Override
	public List<Telefono> listarComprasPorUsuario(int idUsuario) {
		Query query = em.createQuery("Select t From Telefono t WHERE t.usu_tel_id.codigo = :idUsuario");
		query.setParameter("idUsuario", idUsuario);
		List<Telefono> listc = query.getResultList();
		return listc;
	}

	@Override
	public List<Telefono> listarCompras(String informacion) {
		Query query = em.createQuery("Select t From Telefono t WHERE t.numero = :informacion OR t.usu_tel_id.cedula = :informacion");
		query.setParameter("informacion", informacion);
		List<Telefono> listc = query.getResultList();
		return listc;
	}

	
}
