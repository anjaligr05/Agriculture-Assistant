package training.bosch.aa.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import training.bosch.aa.dao.UserMasterDAO;
import training.bosch.aa.domain.RoleDetails;
import training.bosch.aa.domain.UserMaster;
import training.bosch.aa.util.ResourceManager;

// TODO: Auto-generated Javadoc
/**
 * The Class UserMasterDAOImpl.
 */
public class UserMasterDAOImpl implements UserMasterDAO {

	/* (non-Javadoc)
	 * @see training.bosch.aa.dao.UserMasterDAO#delete(training.bosch.aa.domain.UserMaster)
	 */
	public boolean delete(UserMaster um) {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		try {
			PreparedStatement pstat = conn.prepareStatement(DELETEUSER_QUERY);
			pstat.setString(1, um.getUsername());
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

		return false;
	}

	/* (non-Javadoc)
	 * @see training.bosch.aa.dao.UserMasterDAO#findByPrimaryKey(java.lang.String)
	 */
	public UserMaster findByPrimaryKey(String primaryKey) {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		try {
			PreparedStatement pstat = conn.prepareStatement(SELECT_BY_PK_QUERY);
			pstat.setString(1, primaryKey);
			ResultSet RS = pstat.executeQuery();
			UserMaster um = new UserMaster();
			while (RS.next()) {
				um.setUsername(RS.getString(1));
				um.setPassword(RS.getString(2));
				um.setRoleId(RS.getInt(3));
			}
			return um;
		} catch (Exception e) {
			e.printStackTrace();
		}
		ResourceManager.disConnect();
		return null;

	}

	/* (non-Javadoc)
	 * @see training.bosch.aa.dao.UserMasterDAO#findByRoleName(java.lang.String)
	 */
	public ArrayList<UserMaster> findByRoleName(String roleName) {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		ArrayList<UserMaster> retList = new ArrayList<UserMaster>();
		try {
			PreparedStatement pstat = conn
					.prepareStatement(SELECT_BY_ROLENAMEQUERY);
			pstat.setString(1, roleName);
			ResultSet RS = pstat.executeQuery();
			while (RS.next()) {
				UserMaster localUm = new UserMaster();
				localUm.setUsername(RS.getString(1));
				localUm.setPassword(RS.getString(2));
				localUm.setRoleId(RS.getInt(3));
				retList.add(localUm);
			}
			ResourceManager.disConnect();
			return retList;

		} catch (Exception e) {
			e.printStackTrace();
		}
		ResourceManager.disConnect();

		return null;
	}

	/* (non-Javadoc)
	 * @see training.bosch.aa.dao.UserMasterDAO#insert(training.bosch.aa.domain.UserMaster)
	 */
	public boolean insert(UserMaster um, RoleDetails rd) {
		// TODO Auto-generated method stub

		Connection conn = ResourceManager.obtainConnection();
		
		try {
			PreparedStatement pstat = conn.prepareStatement(CREATEUSER_QUERY);
			pstat.setString(1, um.getUsername());
			pstat.setString(2, um.getPassword());
			pstat.setString(3, rd.getRoleName());
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
	 * @see training.bosch.aa.dao.UserMasterDAO#read()
	 */
	public ArrayList<UserMaster> read() {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		ArrayList<UserMaster> returnList = new ArrayList<UserMaster>();
		try {
			PreparedStatement pstat = conn.prepareStatement(READUSERS_QUERY);
			ResultSet RS = pstat.executeQuery();

			while (RS.next()) {
				UserMaster loginUm = new UserMaster();
				loginUm.setUsername(RS.getString(1));
				loginUm.setPassword(RS.getString(2));
				loginUm.setRoleId(RS.getInt(3));
				returnList.add(loginUm);
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
	 * @see training.bosch.aa.dao.UserMasterDAO#update(training.bosch.aa.domain.UserMaster)
	 */
	public boolean  update(UserMaster um,RoleDetails rd) {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		try {
			PreparedStatement pstat = conn.prepareStatement(UPDATEUSER_QUERY);
			//	
			pstat.setString(1, um.getPassword());
			pstat.setString(2, rd.getRoleName());
			pstat.setString(3, um.getUsername());
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
