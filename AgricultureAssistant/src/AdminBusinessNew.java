


import java.lang.Character.Subset;
import java.util.*;

import training.bosch.aa.dao.EventSchedulingDAO;
import training.bosch.aa.daoImpl.*;
import training.bosch.aa.dao.RoleDetailsDAO;
import training.bosch.aa.dao.UserMasterDAO;
import training.bosch.aa.daoImpl.RoleDetailsDAOImpl;
import training.bosch.aa.domain.EventScheduling;
import training.bosch.aa.domain.RoleDetails;
import training.bosch.aa.domain.UserMaster;
import training.bosch.aa.factory.*;

public class AdminBusinessNew {
	public static int flag = 2;
	public static int flagE=1;

	public static void main(String[] args) {
		
	//	createRole();
		//flag++;
		flagE++;
	//	createUser();
	//	updateRole();
	//	deleteRole();
	//	deleteUser();
	//	updateUser();
	//	readUsers();
	//   searchByUserName();
	//	searchByRoleName();
	//	readRoles();
		searchByRole();
	}
	
	
	public static void createRole() {
		RoleDetailsDAO mobj = RoleDetailsFactory.create();
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter Role Name:");
		String roleName = scanObj.next();
		RoleDetails rd = new RoleDetails(roleName);
		boolean result = mobj.insert(rd, flag);
		if (result == true) {
			System.out.println("Insertion sucessful");
		} else
			System.out.println("Insertion Failed...");

	}
	
	public static void readRoles(){
		
		RoleDetailsDAO mobj = RoleDetailsFactory.create();	
		ArrayList<RoleDetails> result1= mobj.read();
		if(result1!= null)
		{
			System.out.println(result1);
		}
		else
		{
			System.out.println("Read failed..");
		}
	}
	
	public static void searchByRole(){
		RoleDetailsDAO mobj = RoleDetailsFactory.create();
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter Role Name:");
		String roleName = scanObj.next();
		RoleDetails result5= mobj.readByRole(roleName);
		if(result5!= null)
		{
			System.out.println(result5);
		}
		else
		{
			System.out.println("Read failed..");
		}
	}
		
	
	public static void deleteRole(){
		
		RoleDetailsDAO mobj= RoleDetailsFactory.create();
		Scanner scanObj= new Scanner(System.in);
		System.out.println("Enter the Role Name to delete:");
		String rolename=scanObj.next();
		RoleDetails rd=new RoleDetails(rolename);
		boolean result= mobj.delete(rd);
		if(result==true)
		{
			System.out.println("Role Deletion Sucessfull");
			System.out.println(rd);
		}
		else
		{
			System.out.println("deletion Failed");
		}
	}
	
	public static void updateRole(){
		RoleDetailsDAO mobj= RoleDetailsFactory.create();
		Scanner scanObj= new Scanner(System.in);
		System.out.println("Enter the Role Name to edit:");
		String rolename=scanObj.next();
		System.out.println("Enter the new Role Name:");
		String newRole=scanObj.next();
		RoleDetails rd= new RoleDetails(rolename);
		boolean result2=mobj.update(rd,newRole);
		System.out.println(result2);
		System.out.println(rd);
		
	}
	
	public static void createUser() {
		UserMasterDAO mobj = UserMasterFactory.create();
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter Username:");
		String userName = scanObj.next();
		System.out.println("Enter Password:");
		String password = scanObj.next();
		System.out.println("Enter Rolename:");
		String roleName = scanObj.next();
		UserMaster um = new UserMaster(userName, password);
		RoleDetails rd = new RoleDetails(roleName);
		boolean result1 = mobj.insert(um, rd);
		if (result1 == true) {
			System.out.println("New User Created...");
			System.out.println(um);
			System.out.println(rd);
		} else {
			System.out.println("User Creation Failed...");
		}

	}
	
	
	
//	public static void updateUser(){
//		UserMasterDAO mobj = UserMasterFactory.create();
//		Scanner scanObj = new Scanner(System.in);
//		System.out.println("Enter Username:");
//		String username=scanObj.next();
//		System.out.println("Enter new Password:");
//		String password=scanObj.next();
//		UserMaster um= new UserMaster(username,password);
//		System.out.println("Enter the new Role:");
//		String rolename=scanObj.next();
//		RoleDetails rd=new RoleDetails(rolename);
//		int result4=mobj.update(um, rd);
//		if(result4>0)
//		{
//			System.out.println("User updation sucessful...");
//		}
//		else
//		{
//			System.out.println("Updation failed...");
//		}
//		
//	}
//	
//	public static void readUsers(){
//		UserMasterDAO mobj = UserMasterFactory.create();
//		ArrayList<UserMaster> result1= mobj.read();
//		if(result1!= null)
//		{
//			System.out.println(result1);
//		}
//		else
//		{
//			System.out.println("Read failed..");
//		}
//		
//	}
//	
//	public static void searchByUserName(){
//		UserMasterDAO mobj = UserMasterFactory.create();
//		Scanner scanObj = new Scanner(System.in);
//		System.out.println("Enter Username:");
//		String userName = scanObj.next();
//		UserMaster um = new UserMaster(userName);
//		um=mobj.findByPrimaryKey(userName);
//		System.out.println(um);
//		
//	}
//	
//	public static void searchByRoleName(){
//		UserMasterDAO mobj = UserMasterFactory.create();
//		Scanner scanObj = new Scanner(System.in);
//		System.out.println("Enter Role Name:");
//		String roleName = scanObj.next();
//		ArrayList<UserMaster> result5= mobj.findByRoleName(roleName);
//		if(result5!= null)
//		{
//			System.out.println(result5);
//		}
//		else
//		{
//			System.out.println("Read failed..");
//		}
//		
//		
//	}
//	
//	public static void deleteUser(){
//		UserMasterDAO mobj = UserMasterFactory.create();
//		Scanner scanObj = new Scanner(System.in);
//		System.out.println("Enter Username:");
//		String userName = scanObj.next();
//		UserMaster um = new UserMaster(userName);
//		boolean result3= mobj.delete(um);
//		if(result3==true)
//		{
//			System.out.println("User deletion sucessful..."+um);
//		}
//		else
//		{
//			System.out.println("User Deletion failed...");
//		}
//	}
//	
//	
//	public static void createEvent(){
//		EventSchedulingDAO esObj=new EventSchedulingDAOImpl();
//		Scanner scanObj = new Scanner(System.in);
//		System.out.println("Enter Event Details");
//		String eDetails=scanObj.next();
//		scanObj.nextLine();
//		System.out.println("Enter Event Date in the pattern dd-mm-yyyy:");
//		String eDate = scanObj.next();
//		String edd=eDate.substring(1,3);
//		String emm=eDate.substring(4,6);
//		String ey=eDate.substring(6);
//		 
//		int ed=Integer.parseInt(edd);
//		System.out.println("Enter Event Time:");
//		String eTime = scanObj.next();
//		System.out.println("Enter Event Location:");
//		String eLocation=scanObj.next();
//		System.out.println("Enter Presentor Name:");
//		String pName=scanObj.next();
////		EventScheduling es= new EventScheduling(eDetails,eDate,eTime,eLocation,pName);
////		boolean res=esObj.insert(es, flagE);
////		if(res==)
////		
//		
//	}
//	
//	
	
	
}
