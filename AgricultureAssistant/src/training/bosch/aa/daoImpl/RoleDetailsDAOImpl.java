package training.bosch.aa.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import training.bosch.aa.business.*;
import training.bosch.aa.dao.RoleDetailsDAO;
import training.bosch.aa.domain.RoleDetails;
import training.bosch.aa.util.ResourceManager;

// TODO: Auto-generated Javadoc
/**
 * The Class RoleDetailsDAOImpl.
 */ 
public class RoleDetailsDAOImpl implements RoleDetailsDAO {

	/* (non-Javadoc)
	 * @see training.bosch.aa.dao.RoleDetailsDAO#delete(training.bosch.aa.domain.RoleDetails)
	 */
	public boolean delete(RoleDetails rd) {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		try {
			PreparedStatement pstat = conn.prepareStatement(DELETEROLE_QUERY);
			pstat.setString(1, rd.getRoleName());
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

	/* (non-Javadoc)
	 * @see training.bosch.aa.dao.RoleDetailsDAO#insert(training.bosch.aa.domain.RoleDetails)
	 */
	public boolean insert(RoleDetails rd,int flag) {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		try {
			
			if(flag==1)
			{	
				PreparedStatement pstat1= conn.prepareStatement(ROLLID_SEQUENCE);
				int rowAffect= pstat1.executeUpdate();
				flag++;
			}
			
			PreparedStatement pstat = conn.prepareStatement(CREATEROLE_QUERY);
			pstat.setString(1, rd.getRoleName());
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

	/* (non-Javadoc)
	 * @see training.bosch.aa.dao.RoleDetailsDAO#read()
	 */
	public ArrayList<RoleDetails> read() {
		// TODO Auto-generated method stub

		Connection conn = ResourceManager.obtainConnection();
		ArrayList<RoleDetails> returnList = new ArrayList<RoleDetails>();
		try {
			PreparedStatement pstat = conn.prepareStatement(READROLE_QUERY);
			ResultSet RS = pstat.executeQuery();

			while (RS.next()) {
				RoleDetails localRd = new RoleDetails();
				localRd.setRoleId(RS.getInt(1));
				localRd.setRoleName(RS.getString(2));
				returnList.add(localRd);
			}

			ResourceManager.disConnect();
			return returnList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		ResourceManager.disConnect();

		return null;
	}

	/* (non-Javadoc)
	 * @see training.bosch.aa.dao.RoleDetailsDAO#readByRole(java.lang.String)
	 */
	public RoleDetails readByRole(String roleName) {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		//ArrayList<RoleDetails> retList = new ArrayList<RoleDetails>();
		try {
			PreparedStatement pstat = conn
					.prepareStatement(READROLE_BY_ROLENAME);
			pstat.setString(1, roleName);
			ResultSet RS = pstat.executeQuery();
			RoleDetails localRd = new RoleDetails();
			while (RS.next()) {
				
				localRd.setRoleId(RS.getInt(1));
				localRd.setRoleName(RS.getString(2));
				//retList.add(localRd);
			}
			ResourceManager.disConnect();
			return localRd;

		} catch (Exception e) {
			e.printStackTrace();
		}
		ResourceManager.disConnect();

		return null;
	}

	/* (non-Javadoc)
	 * @see training.bosch.aa.dao.RoleDetailsDAO#update(training.bosch.aa.domain.RoleDetails)
	 */
	public boolean update(RoleDetails rd,String newRole) {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		try {
			PreparedStatement pstat = conn.prepareStatement(UPDATEROLE_QUERY);
			//	
			pstat.setString(1,newRole);
			pstat.setString(2,rd.getRoleName());
			int rowsAffect = pstat.executeUpdate();
			if (rowsAffect>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}
