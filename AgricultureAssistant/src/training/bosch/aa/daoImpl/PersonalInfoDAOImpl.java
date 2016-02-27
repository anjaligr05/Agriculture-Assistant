package training.bosch.aa.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import training.bosch.aa.dao.PersonalInfoDAO;
import training.bosch.aa.domain.PersonalInfo;
import training.bosch.aa.domain.UserMaster;
import training.bosch.aa.util.ResourceManager;

public class PersonalInfoDAOImpl implements PersonalInfoDAO {

	public boolean delete(PersonalInfo pi) {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		try {
			PreparedStatement pstat = conn.prepareStatement(DELETEINFO_QUERY);
			pstat.setString(1,pi.getUsername());
			int rowsAffect = pstat.executeUpdate();
			if (rowsAffect > 0) {
				ResourceManager.disConnect();
				return true;
			} else {
				ResourceManager.disConnect();
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		ResourceManager.disConnect();
		return false;
	}

	public PersonalInfo findByPrimaryKey(String primaryKey) {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		try {
			PreparedStatement pstat = conn.prepareStatement(SELECT_BY_PK_QUERY);
			pstat.setString(1, primaryKey);
			ResultSet RS = pstat.executeQuery();
			PersonalInfo pi = new PersonalInfo();
			while (RS.next()) {
				pi.setfName(RS.getString(1));
				pi.setlName(RS.getString(2));
				pi.setPhoneNo(RS.getString(3));
				pi.setEmailId(RS.getString(4));
				pi.setUsername(RS.getString(5));
				pi.setPassword(RS.getString(6));
				
			}
			return pi;
		} catch (Exception e) {
			e.printStackTrace();
		}
		ResourceManager.disConnect();
		return null;
		
		
	}


	public boolean insert(PersonalInfo pi) {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		
		try {
			PreparedStatement pstat = conn.prepareStatement(INSERTINFO_QUERY);
			pstat.setString(1, pi.getfName());
			pstat.setString(2, pi.getlName());
			pstat.setString(3, pi.getPhoneNo());
			pstat.setString(4, pi.getEmailId());
			pstat.setString(5, pi.getUsername());
			pstat.setString(6, pi.getPassword());
			int rowsAffect = pstat.executeUpdate();
			if (rowsAffect > 0) {
				ResourceManager.disConnect();
				return true;
			} else {
				ResourceManager.disConnect();
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResourceManager.disConnect();
		return false;

		
		
	}

	public ArrayList<PersonalInfo> read() {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		ArrayList<PersonalInfo> returnList = new ArrayList<PersonalInfo>();
		try {
			PreparedStatement pstat = conn.prepareStatement(READINFO_QUERY);
			ResultSet RS = pstat.executeQuery();

			while (RS.next()) {
				PersonalInfo loginPi = new PersonalInfo();
				loginPi.setfName(RS.getString(1));
				loginPi.setlName(RS.getString(2));
				loginPi.setPhoneNo(RS.getString(3));
				loginPi.setEmailId(RS.getString(4));
				loginPi.setUsername(RS.getString(5));
				loginPi.setPassword(RS.getString(6));
				
				returnList.add(loginPi);
			}

			ResourceManager.disConnect();
			return returnList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		ResourceManager.disConnect();
		return null;
		
		
	}

	public boolean update(PersonalInfo pi) {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		try {
			PreparedStatement pstat = conn.prepareStatement(UPDATEINFO_QUERY);
			//	
			pstat.setString(1, pi.getfName());
			pstat.setString(2, pi.getlName());
			pstat.setString(3, pi.getPhoneNo());
			pstat.setString(4, pi.getEmailId());
			pstat.setString(5, pi.getUsername());
			pstat.setString(6, pi.getPassword());
			int rowsAffect = pstat.executeUpdate();
			if(rowsAffect>0)
				return true;
			else 
				return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return false;
	}

	

}
