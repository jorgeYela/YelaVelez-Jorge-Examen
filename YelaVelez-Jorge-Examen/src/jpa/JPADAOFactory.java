package jpa;


import dao.*;

public class JPADAOFactory extends DAOFactory{

	@Override
	public UsuarioDAO getUsuarioDAO() {
		// TODO Auto-generated method stub
		return new JPAUsuarioDAO();
	}

	@Override
	public TelefonoDAO getTelefonoDAO() {
		// TODO Auto-generated method stub
		return new JPATelefonoDAO();
	}

	@Override
	public TipoDAO getTipoDAO() {
		// TODO Auto-generated method stub
		return new JPATipoDAO();
	}

	@Override
	public OperadoraDAO getOperadoraDAO() {
		// TODO Auto-generated method stub
		return new JPAOperadoraDAO();
	}
	
}
