package training.bosch.aa.factory;

import training.bosch.aa.dao.RoleDetailsDAO;

import training.bosch.aa.daoImpl.RoleDetailsDAOImpl;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating RoleDetails objects.
 */
public class RoleDetailsFactory {

	/** The Constant rd. */
	private static final RoleDetailsDAOImpl rd = new RoleDetailsDAOImpl();

	/**
	 * Creates the.
	 * 
	 * @return the role details dao
	 */
	public static RoleDetailsDAO create() {
		return rd;
	}

}
