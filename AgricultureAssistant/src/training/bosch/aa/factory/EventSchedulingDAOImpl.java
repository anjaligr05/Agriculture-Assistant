package training.bosch.aa.factory;

import training.bosch.aa.dao.EventSchedulingDAO;

public class EventSchedulingDAOImpl {
	
	
	private static final EventSchedulingDAO es = new EventSchedulingDAOImpl();
	
	
	public static EventSchedulingDAO create()
	{
		return es;
	}


}
