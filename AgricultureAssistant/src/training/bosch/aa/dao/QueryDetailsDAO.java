package training.bosch.aa.dao;

import java.util.ArrayList;

import training.bosch.aa.domain.PersonalInfo;
import training.bosch.aa.domain.QueryDetails;

public interface QueryDetailsDAO {
	
	public static final String QUERY_SEQ="CREATE SEQUENCE QUERY_SEQ INCREMENT BY 1 START WITH 1  NOCYCLE NOCACHE";
	
	public static final String INSERTQUERY_QUERY = "INSERT INTO QUERY_DETAILS VALUES (QUERY_SEQ.NEXTVAL,?,?,?,?)";
	
	
	/** The Constant UPDATEUSER_QUERY. */
	public static final String UPDATEQUERY_QUERY = "UPDATE QUERY_DETAILS SET QUERY=?  WHERE PRESENTOR_NAME=?";

	/** The Constant DELETEUSER_QUERY. */
	public static final String DELETEQUERY_QUERY = "DELETE FROM QUERY_DETAILS WHERE PRESENTOR_NAME=?";

	/** The Constant READUSERS_QUERY. */
	public static final String READQUERY_QUERY = "SELECT * FROM QUERY_DETAILS";

	/** The Constant SELECT_BY_PK_QUERY. */
	public static final String SELECT_BY_PName_QUERY = "SELECT * FROM QUERY_DETAILS WHERE PRESENTOR_NAME=?";

	public static final String UPDATESTATUS_QUERY = "UPDATE QUERY_DETAILS SET QUERY_STATUS=? WHERE PRESENTOR_NAME=?";

	/**
	 * Insert.
	 * 
	 * @param um
	 *            the um
	 * 
	 * @return true, if successful
	 */
	public boolean insert(QueryDetails qd);

	/**
	 * Update.
	 * 
	 * @param um
	 *            the um
	 * 
	 * @return the int
	 */
	public boolean update(QueryDetails qd, String newQuery);

	/**
	 * Read.
	 * 
	 * @return the array list< user master>
	 */
	public ArrayList<QueryDetails> read();

	/**
	 * Find by primary key.
	 * 
	 * @param primaryKey
	 *            the primary key
	 * 
	 * @return the user master
	 */
	public QueryDetails findByPresentorName(String pName);

	
		
	public boolean delete(QueryDetails qd);


}
