package training.bosch.aa.daoImpl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import training.bosch.aa.util.ResourceManager;


import training.bosch.aa.dao.QueryDetailsDAO;
import training.bosch.aa.domain.PersonalInfo;
import training.bosch.aa.domain.QueryDetails;
import training.bosch.aa.domain.RoleDetails;

public class QueryDetailsDAOImpl implements QueryDetailsDAO {

	public boolean delete(QueryDetails qd) {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		try {
			PreparedStatement pstat = conn.prepareStatement(DELETEQUERY_QUERY);
			pstat.setString(1, qd.getpName());
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

	public QueryDetails findByPresentorName(String pName) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		//ArrayList<RoleDetails> retList = new ArrayList<RoleDetails>();
		try {
			PreparedStatement pstat = conn
					.prepareStatement(SELECT_BY_PName_QUERY);
			pstat.setString(1, pName);
			ResultSet RS = pstat.executeQuery();
			QueryDetails localQd = new QueryDetails();
			while (RS.next()) {
				
				localQd.setQuery(RS.getString(1));
				localQd.setAnswer(RS.getString(2));
				localQd.setStatus(RS.getString(3));
				localQd.setpName(RS.getString(4));
				
				//retList.add(localRd);
			}
			ResourceManager.disConnect();
			return localQd;

		} catch (Exception e) {
			e.printStackTrace();
		}
		ResourceManager.disConnect();

		return null;
		
	}

	public boolean insert(QueryDetails qd)
	{	int flag=1;
		Connection conn = ResourceManager.obtainConnection();
		try {
			
			if(flag==1)
			{	
				PreparedStatement pstat1= conn.prepareStatement(QUERY_SEQ);
				int rowAffect= pstat1.executeUpdate();
				flag++;
			}
			
		
			PreparedStatement pstat = conn.prepareStatement(INSERTQUERY_QUERY);
			pstat.setString(1, qd.getQuery());
			pstat.setString(2, qd.getAnswer());
			pstat.setString(3, qd.getStatus());
			pstat.setString(4, qd.getpName());
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

	public ArrayList<QueryDetails> read() {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		ArrayList<QueryDetails> returnList = new ArrayList<QueryDetails>();
		try {
			PreparedStatement pstat = conn.prepareStatement(READQUERY_QUERY);
			ResultSet RS = pstat.executeQuery();

			while (RS.next()) {
				QueryDetails localQd = new QueryDetails();
				
				localQd.setQuery(RS.getString(1));
				localQd.setAnswer(RS.getString(2));
				localQd.setStatus(RS.getString(3));
				localQd.setpName(RS.getString(4));				
				returnList.add(localQd);
			}

			ResourceManager.disConnect();
			return returnList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		ResourceManager.disConnect();

		return null;
}

	public boolean update(QueryDetails qd, String newQuery) {
		// TODO Auto-generated method stub
		Connection conn = ResourceManager.obtainConnection();
		try {
			PreparedStatement pstat = conn.prepareStatement(UPDATEQUERY_QUERY);
			//	
			pstat.setString(1,qd.getQuery());
			pstat.setString(2,qd.getpName());
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
