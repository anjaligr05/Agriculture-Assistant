package training.bosch.aa.factory;

import training.bosch.aa.dao.RoleDetailsDAO;
import training.bosch.aa.dao.UserMasterDAO;

public class RoleDetailsDAOImpl {
	
	
	private static final RoleDetailsDAO rd = new RoleDetailsDAOImpl();
	
	
	public static RoleDetailsDAO create()
	{
		return rd;
	}

	
}
