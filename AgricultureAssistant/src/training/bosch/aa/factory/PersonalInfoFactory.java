package training.bosch.aa.factory;


import training.bosch.aa.dao.PersonalInfoDAO;
import training.bosch.aa.daoImpl.PersonalInfoDAOImpl;

public class PersonalInfoFactory {
	private static final PersonalInfoDAOImpl pi = new PersonalInfoDAOImpl();

	
	public static PersonalInfoDAO create() {
		return pi;
	}

}
