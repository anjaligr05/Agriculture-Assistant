package training.bosch.aa.business;

import training.bosch.aa.dao.PersonalInfoDAO;
import training.bosch.aa.domain.PersonalInfo;
import training.bosch.aa.factory.PersonalInfoFactory;

public class EditorBusiness {

	
	
	public static boolean updateProfile(String fName,String lName,String phoneNo, String emailId,String username,String password )
	{
		PersonalInfoDAO pi = PersonalInfoFactory.create();
		PersonalInfo piRef=new PersonalInfo(fName,lName,phoneNo,emailId,username,password);
		boolean result=pi.update(piRef);
		return result;		
		
	}
	
	
}
