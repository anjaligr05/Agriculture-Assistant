package training.bosch.aa.business;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.sql.Date;

import training.bosch.aa.dao.EventSchedulingDAO;
import training.bosch.aa.dao.PersonalInfoDAO;
import training.bosch.aa.dao.RoleDetailsDAO;
import training.bosch.aa.dao.UserMasterDAO;
import training.bosch.aa.domain.EventScheduling;
import training.bosch.aa.domain.PersonalInfo;
import training.bosch.aa.domain.RoleDetails;
import training.bosch.aa.domain.UserMaster;
import training.bosch.aa.factory.EventSchedulingFactory;
import training.bosch.aa.factory.PersonalInfoFactory;
import training.bosch.aa.factory.RoleDetailsFactory;
import training.bosch.aa.factory.UserMasterFactory;

public class AdminBusiness {
	public static int flag=2;
	public static int flagE=2;
	public static boolean createRole(String roleName){
		RoleDetailsDAO rd= RoleDetailsFactory.create();
		RoleDetails rRef=new RoleDetails(roleName);
		boolean res=rd.insert(rRef, flag);
		return res;
		
	}
	
	public static boolean deleteRole(String roleName)
	{
		RoleDetailsDAO rd= RoleDetailsFactory.create();
		RoleDetails rRef=new RoleDetails(roleName);
		boolean res=rd.delete(rRef);
		return res;
		
	}
	
	public static boolean updateRole(String roleName,String newRoleName)
	{
		RoleDetailsDAO rd= RoleDetailsFactory.create();
		RoleDetails rRef=new RoleDetails(roleName);
		boolean res=rd.update(rRef,newRoleName);
		return res;
		
	}
	
	
	
	public static boolean createUser(String username,String password,String roleName)
	{
		UserMasterDAO um=  UserMasterFactory.create();
		UserMaster umRef=new UserMaster(username,password);
		RoleDetails rdRef=new RoleDetails(roleName);
		boolean c=um.insert(umRef, rdRef);
		return c;
		
	}
	
	public static boolean deleteUser(String username)
	{
		UserMasterDAO um=  UserMasterFactory.create();
		UserMaster umRef=new UserMaster(username);
		boolean c=um.delete(umRef);
		return c;
		
	}
	
	public static boolean updateUser(String username,String password,String roleName)
	{
		UserMasterDAO um=  UserMasterFactory.create();
		UserMaster umRef=new UserMaster(username,password);
		RoleDetails rdRef=new RoleDetails(roleName);
		boolean c=um.update(umRef, rdRef);
		return c;
	}

	public static boolean createEvent(String edetails,String date,String location,String pName)
		{
		EventSchedulingDAO es = EventSchedulingFactory.create();
		String edd=date.substring(1,3);
		String emm=date.substring(4,6);
		String eyy=date.substring(6);
		int ed=Integer.parseInt(edd);
		int em=Integer.parseInt(emm);
		int ey=Integer.parseInt(eyy);
		SimpleDateFormat SDF = new SimpleDateFormat("dd-MMM-yyyy");
		Date dobj = new Date(ey-1900,em,ed);
		EventScheduling esRef= new EventScheduling(edetails,dobj,location,pName);
		boolean result=es.insert(esRef, flagE);
		
		return result;
		
	}
	
	public static boolean updateEvent(String edetails,String date,String location,String pName)
	{
		EventSchedulingDAO es= EventSchedulingFactory.create();
		String edd=date.substring(1,3);
		String emm=date.substring(4,6);
		String eyy=date.substring(6);
		int ed=Integer.parseInt(edd);
		int em=Integer.parseInt(emm);
		int ey=Integer.parseInt(eyy);
		SimpleDateFormat SDF = new SimpleDateFormat("dd-MMM-yyyy");
		Date dobj = new Date(ey-1900,em,ed);
		EventScheduling esRef= new EventScheduling(edetails,dobj,location,pName);
		int res=es.update(esRef);
		if(res>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean deleteEvent(String pName)
	{
		EventSchedulingDAO es= EventSchedulingFactory.create();
		EventScheduling esRef=new EventScheduling(pName);
		boolean result=es.delete(esRef);
		return result;
		
	}
	
	public static boolean displayEvent()
	{
		EventSchedulingDAO es= EventSchedulingFactory.create();
		EventScheduling esRef=new EventScheduling();
		ArrayList<EventScheduling> res=es.read();
		if(res!=null)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	public static UserMaster readbyusername(String username)
	{
		UserMasterDAO um= UserMasterFactory.create();
		UserMaster umRef = new UserMaster(username);
		UserMaster umRef1=um.findByPrimaryKey(username);
		if(umRef1!=null)
		return umRef1;
		else 
			return null;

	}
	
	public static boolean updateProfile(String fName,String lName,String phoneNo, String emailId,String username,String password )
	{
		PersonalInfoDAO pi = PersonalInfoFactory.create();
		PersonalInfo piRef=new PersonalInfo(fName,lName,phoneNo,emailId,username,password);
		boolean result=pi.update(piRef);
		return result;		
		
	}
	
	public static boolean deleteProfile(String username)
	{
		PersonalInfoDAO pi = PersonalInfoFactory.create();
		PersonalInfo piRef=new PersonalInfo(username);
		boolean res=pi.delete(piRef);
		return res;
		
	}
	
	
	
}
