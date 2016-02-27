package training.bosch.aa.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class RoleDetails.
 */
public class RoleDetails {

	/** The role id. */
	private int roleId;
	
	/** The role name. */
	private String roleName;

	/**
	 * Instantiates a new role details.
	 */
	public RoleDetails() {

	}
	

	public RoleDetails(String roleName) {
		super();
		this.roleName = roleName;
	}


	/**
	 * Gets the role id.
	 * 
	 * @return the role id
	 */
	public int getRoleId() {
		return roleId;
	}

	/**
	 * Sets the role id.
	 * 
	 * @param roleId the new role id
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	/**
	 * Gets the role name.
	 * 
	 * @return the role name
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * Sets the role name.
	 * 
	 * @param roleName the new role name
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	@Override
	public String toString() {
		return "RoleDetails [roleId=" + roleId + ", roleName=" + roleName + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	
}
