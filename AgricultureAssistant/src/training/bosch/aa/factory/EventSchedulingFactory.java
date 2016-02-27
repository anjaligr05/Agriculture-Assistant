package training.bosch.aa.factory;

import training.bosch.aa.dao.EventSchedulingDAO;
import training.bosch.aa.daoImpl.EventSchedulingDAOImpl;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating EventScheduling objects.
 */
public class EventSchedulingFactory {

	/** The Constant es. */
	private static final EventSchedulingDAOImpl es = new EventSchedulingDAOImpl();

	/**
	 * Creates the.
	 * 
	 * @return the event scheduling dao
	 */
	public static EventSchedulingDAO create() {
		return es;
	}

}
