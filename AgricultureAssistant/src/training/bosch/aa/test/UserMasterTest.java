package training.bosch.aa.test;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.*;

import training.bosch.aa.dao.RoleDetailsDAO;
import training.bosch.aa.dao.UserMasterDAO;
import training.bosch.aa.domain.RoleDetails;
import training.bosch.aa.domain.UserMaster;
import training.bosch.aa.factory.RoleDetailsFactory;
import training.bosch.aa.factory.UserMasterFactory;

public class UserMasterTest {
	UserMasterDAO umobj = UserMasterFactory.create();
	RoleDetailsDAO roleDAO = RoleDetailsFactory.create();
	
	UserMaster umRef=new UserMaster("Nagaratna,nag123");
    RoleDetails temprd = new RoleDetails("Presentor");
	

    @Test
	public void insertData()
	{
		boolean result = umobj.insert(umRef, temprd);
		Assert.assertTrue(result);
	}
	
	UserMaster umRef1=new UserMaster("Sripriya","j1234");
    RoleDetails temprd1 = new RoleDetails("Presentor");

	@Test
	public void updateUser()
	{
		boolean result=umobj.update(umRef1,temprd1);
		Assert.assertTrue(result);
	}
	
	UserMaster umRef2=new UserMaster("Sripriya");
	
	@Test
	public void deleteUser()
	{
		boolean result=umobj.delete(umRef2);
		Assert.assertTrue(result);
	}
	
}
