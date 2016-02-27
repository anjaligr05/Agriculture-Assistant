package training.bosch.aa.UserMasterBusiness;

import java.util.Scanner;
import training.bosch.aa.dao.RoleDetailsDAO;
import training.bosch.aa.dao.UserMasterDAO;
import training.bosch.aa.daoImpl.RoleDetailsDAOImpl;
import training.bosch.aa.domain.RoleDetails;
import training.bosch.aa.domain.UserMaster;
import training.bosch.aa.factory.*;

public class AdminBusiness {
	public static int flag = 2;

	public static void main(String[] args) {

	//	createRole();
		//flag++;

	//	createUser();
	//	updateRole();
		deleteRole();
	}

	public static void createRole() {
		RoleDetailsDAO mobj = RoleDetailsFactory.create();
		// RoleDetailsDAO mobj=new RoleDetailsDAOImpl();
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
	
	public static void updateRole(){
		RoleDetailsDAO mobj= RoleDetailsFactory.create();
		Scanner scanObj= new Scanner(System.in);
		System.out.println("Enter the Role Name to edit:");
		String rolename=scanObj.next();
		System.out.println("Enter the new Role Name:");
		String newRole=scanObj.next();
		RoleDetails rd= new RoleDetails(rolename);
		int result2=mobj.update(rd,newRole);
		System.out.println(result2);
		System.out.println(rd);
		
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
}
