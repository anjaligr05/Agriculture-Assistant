package training.bosch.aa.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class UserMaster.
 */
public class UserMaster {

	/** The username. */
	private String username;
	
	/** The password. */
	private String password;
	
	/** The role id. */
	private int roleId;

	/**
	 * Instantiates a new user master.
	 */
	
	
	public UserMaster(String username) {
		super();
		this.username=username;
	}
	
	
	public UserMaster() {
		super();
	}


	public UserMaster(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}



	/**
	 * Gets the username.
	 * 
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 * 
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 * 
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the role id.
	 * 
	 * @return the role id
	 */
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId)
	{
		this.roleId=roleId;
	}

	/**
	 * Sets the role name.
	 * 
	 * @param roleName the new role name
	 */
	public void setRoleName(String roleName) {
		this.roleId = roleId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "UserMaster [password=" + password + ", roleId=" + roleId
				+ ", username=" + username + "]";
	}

}
