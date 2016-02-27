package training.bosch.aa.test;

import org.junit.Assert;
import org.junit.Test;

import training.bosch.aa.dao.RoleDetailsDAO;
import training.bosch.aa.dao.UserMasterDAO;
import training.bosch.aa.domain.RoleDetails;
import training.bosch.aa.domain.UserMaster;
import training.bosch.aa.factory.RoleDetailsFactory;
import training.bosch.aa.factory.UserMasterFactory;

public class RoleDetailsTest {
	
	
	RoleDetailsDAO roleObj = RoleDetailsFactory.create();
	RoleDetails rRef1=new RoleDetails("Administrator");
	
	public RoleDetails initRd()
	{
	    RoleDetails rRef = new RoleDetails();
		rRef.setRoleName("Administrator");
		return rRef;
	}
	
	@Test
	public void insertRole()
	{
		boolean result = roleObj.insert(rRef1,2);
		Assert.assertTrue(result);
	}
	
	

	RoleDetails rRef2=new RoleDetails("Administrator");
	@Test
	public void updateRole()
	{
		boolean result=roleObj.update(rRef2, "Admin");
		Assert.assertTrue(result);
	}

	RoleDetails rRef3=new RoleDetails("Editor");
	@Test
	public void deleteRole()
	{
		boolean result=roleObj.delete(rRef3);
		Assert.assertTrue(result);
	}
}
