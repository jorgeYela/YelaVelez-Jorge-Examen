package jpa;


import dao.*;

public class JPADAOFactory extends DAOFactory{

	@Override
	public UsuarioDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new JPAUsuarioDAO();
	}

	@Override
	public TelefonoDAO getCompraDAO() {
		// TODO Auto-generated method stub
		return new JPATelefonoDAO();
	}
	
	
}
