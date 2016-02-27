package training.bosch.aa.test;



import org.junit.Assert;
import org.junit.Test;

import training.bosch.aa.dao.PersonalInfoDAO;
import training.bosch.aa.domain.PersonalInfo;
import training.bosch.aa.factory.PersonalInfoFactory;

public class PersonalInfoTest {
	
	PersonalInfoDAO pRef=PersonalInfoFactory.create();
	
	
		
	@Test
	public void insertUser()
	{
		PersonalInfo pi= new PersonalInfo("Anjali","Reddy","9876543210","ar@gmail.com","Anjali","anj123");
		boolean result=pRef.insert(pi);
		Assert.assertTrue(true);
		
	}

}
