package training.bosch.aa.factory;

import training.bosch.aa.dao.UserMasterDAO;
import training.bosch.aa.daoImpl.UserMasterDAOImpl;
public class UserMasterDaoFactory {
	
	
	private static final UserMasterDAO um = new UserMasterDAOImpl();
	
	
	public static UserMasterDAO create()
	{
		return um;
	}
	

}
