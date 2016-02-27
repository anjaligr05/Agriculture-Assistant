package training.bosch.aa.dao;

import training.bosch.aa.domain.*;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserMasterDAO.
 */
public interface UserMasterDAO {

	/** The Constant CREATEUSER_QUERY. */
	public static final String CREATEUSER_QUERY = "INSERT INTO USER_DETAILS VALUES (?,?,(SELECT ROLE_ID FROM ROLE_DETAILS WHERE ROLE_NAME = ?))";

	/** The Constant UPDATEUSER_QUERY. */
	public static final String UPDATEUSER_QUERY = "UPDATE USER_DETAILS SET PASSWORD=? ,ROLE_ID=(SELECT ROLE_ID FROM ROLE_DETAILS WHERE ROLE_NAME = ?) WHERE USERNAME=?";

	/** The Constant DELETEUSER_QUERY. */
	public static final String DELETEUSER_QUERY = "DELETE FROM USER_DETAILS WHERE USERNAME=?";

	/** The Constant READUSERS_QUERY. */
	public static final String READUSERS_QUERY = "SELECT * FROM USER_DETAILS";

	/** The Constant SELECT_BY_PK_QUERY. */
	public static final String SELECT_BY_PK_QUERY = "SELECT * FROM USER_DETAILS WHERE USERNAME=?";

	/** The Constant SELECT_BY_ROLENAMEQUERY. */
	public static final String SELECT_BY_ROLENAMEQUERY = "SELECT * FROM USER_DETAILS WHERE ROLE_ID=(SELECT ROLE_ID FROM ROLE_DETAILS WHERE ROLE_NAME=?)";

	/**
	 * Insert.
	 * 
	 * @param um
	 *            the um
	 * 
	 * @return true, if successful
	 */
	public boolean insert(UserMaster um, RoleDetails rd);

	/**
	 * Update.
	 * 
	 * @param um
	 *            the um
	 * 
	 * @return the int
	 */
	public boolean update(UserMaster um,RoleDetails rd);

	/**
	 * Read.
	 * 
	 * @return the array list< user master>
	 */
	public ArrayList<UserMaster> read();

	/**
	 * Find by primary key.
	 * 
	 * @param primaryKey
	 *            the primary key
	 * 
	 * @return the user master
	 */
	public UserMaster findByPrimaryKey(String primaryKey);

	/**
	 * Find by role name.
	 * 
	 * @param roleName
	 *            the role name
	 * 
	 * @return the array list< user master>
	 */
	public ArrayList<UserMaster> findByRoleName(String roleName);

	/**
	 * Delete.
	 * 
	 * @param um
	 *            the um
	 * 
	 * @return true, if successful
	 */
	public boolean delete(UserMaster um);

}
