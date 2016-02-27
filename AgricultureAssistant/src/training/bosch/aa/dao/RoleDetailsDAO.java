package training.bosch.aa.dao;

import java.util.ArrayList;

import training.bosch.aa.domain.RoleDetails;
import training.bosch.aa.domain.UserMaster;

// TODO: Auto-generated Javadoc
/**
 * The Interface RoleDetailsDAO.
 */
public interface RoleDetailsDAO {

	/** The Constant ROLLID_SEQUENCE. */
	public static final String ROLLID_SEQUENCE = "CREATE SEQUENCE ROLE_ID_SEQ INCREMENT BY 1 START WITH 1 NOCYCLE NOCACHE";

	/** The Constant CREATEROLE_QUERY. */
	public static final String CREATEROLE_QUERY = "INSERT INTO ROLE_DETAILS VALUES (ROLE_ID_SEQ.NEXTVAL,?)";

	/** The Constant DELETEROLE_QUERY. */
	public static final String DELETEROLE_QUERY = "DELETE FROM ROLE_DETAILS WHERE ROLE_NAME=?";

	/** The Constant UPDATEROLE_QUERY. */
	public static final String UPDATEROLE_QUERY = "UPDATE ROLE_DETAILS SET ROLE_NAME=? WHERE ROLE_NAME=?";

	/** The Constant READROLE_QUERY. */
	public static final String READROLE_QUERY = "SELECT * FROM ROLE_DETAILS";

	/** The Constant READROLE_BY_ROLENAME. */
	public static final String READROLE_BY_ROLENAME = "SELECT * FROM ROLE_DETAILS WHERE ROLE_NAME=?";

	/**
	 * Insert.
	 * 
	 * @param rd
	 *            the rd
	 * 
	 * @return true, if successful
	 */
	public boolean insert(RoleDetails rd,int flag);

	/**
	 * Read.
	 * 
	 * @return the array list< role details>
	 */
	public ArrayList<RoleDetails> read();

	/**
	 * Read by role.
	 * 
	 * @param roleName
	 *            the role name
	 * 
	 * @return the array list< role details>
	 */
	public RoleDetails readByRole(String roleName);

	/**
	 * Delete.
	 * 
	 * @param rd
	 *            the rd
	 * 
	 * @return true, if successful
	 */
	public boolean delete(RoleDetails rd);

	/**
	 * Update.
	 * 
	 * @param rd
	 *            the rd
	 * 
	 * @return the int
	 */
	public boolean update(RoleDetails rd,String newRole);

}
