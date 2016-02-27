package training.bosch.aa.daoImpl;

import java.sql.Connection;
import java.sql.Date;


import java.sql.SQLException;

import java.sql.ResultSet;

import java.sql.PreparedStatement;
import java.util.ArrayList;



import training.bosch.aa.dao.EventSchedulingDAO;
import training.bosch.aa.domain.EventScheduling;
import training.bosch.aa.util.ResourceManager;
import training.bosch.aa.business.*;

public class EventSchedulingDAOImpl implements EventSchedulingDAO {

	public boolean delete(EventScheduling es) {
		// TODO Auto-generated method stub
		Connection conn= ResourceManager.obtainConnection();
		try
		{
			PreparedStatement pstat= conn.prepareStatement(DELETEVENT_QUERY);
			pstat.setString(1, es.getPresentorName());
			int rowsAffect=pstat.executeUpdate();
			if(rowsAffect>0)
			{
				ResourceManager.disConnect();
				return true;
			}
			else
			{
				ResourceManager.disConnect();
				return false;
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		ResourceManager.disConnect();
		
		return false;
	}

	public ArrayList<EventScheduling> findByPresentorName(String presentorName) {
		// TODO Auto-generated method stub
		
		Connection conn=ResourceManager.obtainConnection();
		ArrayList<EventScheduling> retList= new ArrayList<EventScheduling>();
		try{
			PreparedStatement pstat=conn.prepareStatement(READEVENTS_BY_PNAME);
			pstat.setString(1,presentorName);
			ResultSet RS= pstat.executeQuery();
			while(RS.next())
			{
				EventScheduling localEs=new EventScheduling();
				localEs.setEventId(RS.getInt(1));
				localEs.setEventDetails(RS.getString(2));
				localEs.setDateOfEvent(RS.getDate(3));
				localEs.setLocation(RS.getString(4));
				localEs.setPresentorName(RS.getString(5));
				retList.add(localEs);
			}
			ResourceManager.disConnect();
			return retList;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		ResourceManager.disConnect();

		return null;
	}

	public boolean insert(EventScheduling es, int flagE) {
		// TODO Auto-generated method stub
		Connection conn=ResourceManager.obtainConnection();
		try {
			if(flagE==1)
			{
				PreparedStatement pstat1=conn.prepareStatement(EVENT_SEQUENCE);
				int count=pstat1.executeUpdate();
			}
				
			PreparedStatement pstat=conn.prepareStatement(CREATEEVENT_QUERY);
			pstat.setString(1, es.getEventDetails());
			pstat.setDate(2, (Date) es.getDateOfEvent());
			pstat.setString(3, es.getLocation());
			pstat.setString(4, es.getPresentorName());
			int rowsAffect=pstat.executeUpdate();
			if(rowsAffect>0)
			{
				ResourceManager.disConnect();
				return true;
			}
			else
			{
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

	public ArrayList<EventScheduling> read() {
		// TODO Auto-generated method stub
		Connection conn=ResourceManager.obtainConnection();
		ArrayList<EventScheduling> returnList= new ArrayList<EventScheduling>();
		try
		{
			PreparedStatement pstat= conn.prepareStatement(READEVENTS_QUERY);
			ResultSet RS=pstat.executeQuery();
			
			while(RS.next())
			{
				EventScheduling loginEs=new EventScheduling();
				loginEs.setEventId(RS.getInt(1));		
				loginEs.setEventDetails(RS.getString(2));
				loginEs.setDateOfEvent(RS.getDate(3));
				loginEs.setLocation(RS.getString(4));
				loginEs.setPresentorName(RS.getString(5));
				
			    returnList.add(loginEs);
			}
			
			ResourceManager.disConnect();
			return returnList;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		ResourceManager.disConnect();

		
		return null;
	}

	public int update(EventScheduling es) {
		// TODO Auto-generated method stub
		
		Connection conn=ResourceManager.obtainConnection();
		try {
			PreparedStatement pstat=conn.prepareStatement(UPDATEEVENT_QUERY);
		//	
			pstat.setString(1, es.getEventDetails());
			pstat.setDate(2, (Date) es.getDateOfEvent());
			pstat.setString(3,es.getLocation());
			pstat.setString(4, es.getPresentorName());
			int rowsAffect=pstat.executeUpdate();
			return rowsAffect;					} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		return 0;
	}

}
