package training.bosch.aa.factory;

import training.bosch.aa.dao.UserMasterDAO;
import training.bosch.aa.daoImpl.UserMasterDAOImpl;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating UserMaster objects.
 */
public class UserMasterFactory {

	/** The Constant um. */
	private static final UserMasterDAOImpl um = new UserMasterDAOImpl();

	/**
	 * Creates the.
	 * 
	 * @return the user master dao
	 */
	public static UserMasterDAO create() {
		return  um;
	}

}
