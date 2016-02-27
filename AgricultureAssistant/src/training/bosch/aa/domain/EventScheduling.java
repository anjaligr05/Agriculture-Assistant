package training.bosch.aa.domain;

import java.sql.Date;



// TODO: Auto-generated Javadoc
/**
 * The Class EventScheduling.
 */
public class EventScheduling {
	
	/** The event id. */
	private int eventId;
	
	/** The event details. */
	private String eventDetails;
	
	/** The date of event. */
	private Date dateOfEvent;
	
	
	
	/** The location. */
	private String location;
	
	/** The presentor name. */
	private String presentorName;

	/**
	 * Instantiates a new event scheduling.
	 */
	public EventScheduling() {
		super();
	}

	
	public EventScheduling(String eventDetails, Date dobj,
			 String location, String presentorName) {
		super();
		this.eventDetails = eventDetails;
		this.dateOfEvent = dobj;
		this.location = location;
		this.presentorName = presentorName;
	}

	

	public EventScheduling(String presentorName) {
		super();
		this.presentorName = presentorName;
	}


	/**
	 * Gets the event details.
	 * 
	 * @return the event details
	 */
	public String getEventDetails() {
		return eventDetails;
	}

	/**
	 * Sets the event details.
	 * 
	 * @param eventDetails the new event details
	 */
	public void setEventDetails(String eventDetails) {
		this.eventDetails = eventDetails;
	}

	/**
	 * Gets the date of event.
	 * 
	 * @return the date of event
	 */
	public Date getDateOfEvent() {
		return dateOfEvent;
	}

	/**
	 * Sets the date of event.
	 * 
	 * @param dateOfEvent the new date of event
	 */
	public void setDateOfEvent(Date dateOfEvent) {
		this.dateOfEvent = dateOfEvent;
	}

	
	/**
	 * Gets the location.
	 * 
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * Sets the location.
	 * 
	 * @param location the new location
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * Gets the presentor name.
	 * 
	 * @return the presentor name
	 */
	public String getPresentorName() {
		return presentorName;
	}

	/**
	 * Sets the presentor name.
	 * 
	 * @param presentorName the new presentor name
	 */
	public void setPresentorName(String presentorName) {
		this.presentorName = presentorName;
	}

	/**
	 * Gets the event id.
	 * 
	 * @return the event id
	 */
	public int getEventId() {
		return eventId;
	}

	/**
	 * Sets the event id.
	 * 
	 * @param eventId the new event id
	 */
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EventScheduling [dateOfEvent=" + dateOfEvent
				+ ", eventDetails=" + eventDetails + ", eventId=" + eventId
				+ ", location=" + location + ", presentorName=" + presentorName
				+ "]";
	}

}
