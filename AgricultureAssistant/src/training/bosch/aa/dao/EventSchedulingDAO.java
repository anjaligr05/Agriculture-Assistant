package training.bosch.aa.dao;

import java.util.ArrayList;

import training.bosch.aa.domain.EventScheduling;

// TODO: Auto-generated Javadoc
/**
 * The Interface EventSchedulingDAO.
 */
public interface EventSchedulingDAO {

	/** The Constant EVENT_SEQUENCE. */
	public static final String EVENT_SEQUENCE = "CREATE SEQUENCE EVENT_SEQ INCREMENT BY 1 START WITH 1 NOCYCLE NOCACHE";

	/** The Constant CREATEEVENT_QUERY. */
	public static final String CREATEEVENT_QUERY = "INSERT INTO EVENT_SCHEDULING VALUES (EVENT_SEQ.NEXTVAL,?,?,?,?)";

	/** The Constant UPDATEEVENT_QUERY. */
	public static final String UPDATEEVENT_QUERY = "UPDATE EVENT_SCHEDULING SET EVENT_DETAILS=?, DATE_OF_EVENT=?, LOCATION=? WHERE PRESENTOR_NAME=?";

	/** The Constant DELETEVENT_QUERY. */
	public static final String DELETEVENT_QUERY = "DELETE FROM EVENT_SCHEDULING WHERE PRESENTOR_NAME=?";

	/** The Constant READEVENTS_QUERY. */
	public static final String READEVENTS_QUERY = "SELECT * FROM EVENT_SCHEDULING";

	/** The Constant READEVENTS_BY_PNAME. */
	public static final String READEVENTS_BY_PNAME = "SELECT * FROM EVENT_SCHEDULING WHERE PRESENTOR_NAME=?";

	/**
	 * Insert.
	 * 
	 * @param es
	 *            the es
	 * 
	 * @return true, if successful
	 */
	public boolean insert(EventScheduling es,int flagE);

	/**
	 * Update.
	 * 
	 * @param es
	 *            the es
	 * 
	 * @return the int
	 */
	public int update(EventScheduling es);

	/**
	 * Read.
	 * 
	 * @return the array list< event scheduling>
	 */
	public ArrayList<EventScheduling> read();

	/**
	 * Find by presentor name.
	 * 
	 * @param presentorName
	 *            the presentor name
	 * 
	 * @return the array list< event scheduling>
	 */
	public ArrayList<EventScheduling> findByPresentorName(String presentorName);

	/**
	 * Delete.
	 * 
	 * @param es
	 *            the es
	 * 
	 * @return true, if successful
	 */
	public boolean delete(EventScheduling es);

}
