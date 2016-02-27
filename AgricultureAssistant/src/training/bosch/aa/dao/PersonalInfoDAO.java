package training.bosch.aa.dao;

import java.util.ArrayList;

import training.bosch.aa.domain.PersonalInfo;
import training.bosch.aa.domain.RoleDetails;
import training.bosch.aa.domain.UserMaster;

public interface PersonalInfoDAO {
	
	public static final String INSERTINFO_QUERY = "INSERT INTO PERSONAL_INFO VALUES (?,?,?,?,?,?)";

	/** The Constant UPDATEUSER_QUERY. */
	public static final String UPDATEINFO_QUERY = "UPDATE PERSONAL_INFO SET FNAME=? ,LNAME=?, PHONE_NO=?, EMAIL_ID=?, PASSWORD=? WHERE USERNAME=?";

	/** The Constant DELETEUSER_QUERY. */
	public static final String DELETEINFO_QUERY = "DELETE FROM PERSONAL_INFO WHERE USERNAME=?";

	/** The Constant READUSERS_QUERY. */
	public static final String READINFO_QUERY = "SELECT * FROM PERSONAL_INFO";

	/** The Constant SELECT_BY_PK_QUERY. */
	public static final String SELECT_BY_PK_QUERY = "SELECT * FROM PERSONAL_INFO WHERE USERNAME=?";

	
	/**
	 * Insert.
	 * 
	 * @param um
	 *            the um
	 * 
	 * @return true, if successful
	 */
	public boolean insert(PersonalInfo pi);

	/**
	 * Update.
	 * 
	 * @param um
	 *            the um
	 * 
	 * @return the int
	 */
	public boolean update(PersonalInfo pi);

	/**
	 * Read.
	 * 
	 * @return the array list< user master>
	 */
	public ArrayList<PersonalInfo> read();

	/**
	 * Find by primary key.
	 * 
	 * @param primaryKey
	 *            the primary key
	 * 
	 * @return the user master
	 */
	public PersonalInfo findByPrimaryKey(String primaryKey);

	
		
	public boolean delete(PersonalInfo pi);

}



