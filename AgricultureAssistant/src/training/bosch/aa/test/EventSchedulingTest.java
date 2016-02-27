package training.bosch.aa.test;

import java.text.SimpleDateFormat;

//import java.util.Date;
import java.sql.Date;
import org.junit.Test;

import junit.framework.Assert;
import training.bosch.aa.dao.EventSchedulingDAO;
import training.bosch.aa.domain.EventScheduling;
import training.bosch.aa.factory.EventSchedulingFactory;

public class EventSchedulingTest {
	
	EventSchedulingDAO esObj=EventSchedulingFactory.create();
	int d=2;
	int m=9;
	int y=2013;
	
	SimpleDateFormat SDF = new SimpleDateFormat("dd-MMM-yyyy");
	Date dobj = new Date(y-1900,m,d);	
	EventScheduling esRef=new EventScheduling("Presentation on Crops",dobj,"Koppal","Anjali");
	
	
	@Test
	public void insertEvent()
	{
		
		boolean result=esObj.insert(esRef, 2);
		Assert.assertTrue(result);
	}
	
	int d1=23;
	int m1=5;
	int y1=2013;
	
	SimpleDateFormat SDF1 = new SimpleDateFormat("dd-MMM-yyyy");
	Date dobj1 = new Date(y-1900,m,d);	
	EventScheduling esRef1=new EventScheduling("Presentation on Crops",dobj,"Koppal","Anjali");
	
	
	@Test
	public void updateEvent()
	{
		
		int result=esObj.update(esRef1);
		boolean res;
		if(result>0)
			res=true;
		else
			res=false;
		Assert.assertTrue(res);
	}
	
	EventScheduling esRef2=new EventScheduling("Anjali");
	@Test
	public void deleteEvent()
	{
		boolean  result=esObj.delete(esRef2);
		Assert.assertTrue(result);
	}
	
}
