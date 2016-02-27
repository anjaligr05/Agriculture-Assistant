package training.bosch.aa.domain;

public class PersonalInfo {

	private String fName;
	private String lName;
	private String phoneNo;
	private String emailId;
	private String username;
	private String password;

	public PersonalInfo() {
		super();
	}
	
	public PersonalInfo(String username) {
		super();
		this.username=username;
	}
	

	public PersonalInfo(String fName, String lName, String phoneNo,
			String emailId, String username, String password) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.username = username;
		this.password = password;
	}



	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "PersonalInfo [emailId=" + emailId + ", fName=" + fName
				+ ", lName=" + lName + ", password=" + password + ", phoneNo="
				+ phoneNo + ", username=" + username + "]";
	}

}
