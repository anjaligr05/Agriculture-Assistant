package training.bosch.aa.domain;

public class ArtifactDetails {
	
	private int artifactId;
	private String artifactTitle;
	private String keyField;
	private String status;
	private String eName;
	private String vNo;
	
	
	
	public ArtifactDetails() {
		super();
	}



	public ArtifactDetails(int artifactId, String artifactTitle,
			String keyField, String status, String eName, String vNo) {
		super();
		this.artifactId = artifactId;
		this.artifactTitle = artifactTitle;
		this.keyField = keyField;
		this.status = status;
		this.eName = eName;
		this.vNo = vNo;
	}



	public int getArtifactId() {
		return artifactId;
	}



	public void setArtifactId(int artifactId) {
		this.artifactId = artifactId;
	}



	public String getArtifactTitle() {
		return artifactTitle;
	}



	public void setArtifactTitle(String artifactTitle) {
		this.artifactTitle = artifactTitle;
	}



	public String getKeyField() {
		return keyField;
	}



	public void setKeyField(String keyField) {
		this.keyField = keyField;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String geteName() {
		return eName;
	}



	public void seteName(String eName) {
		this.eName = eName;
	}



	public String getvNo() {
		return vNo;
	}



	public void setvNo(String vNo) {
		this.vNo = vNo;
	}



	@Override
	public String toString() {
		return "ArtifactDetails [artifactId=" + artifactId + ", artifactTitle="
				+ artifactTitle + ", eName=" + eName + ", keyField=" + keyField
				+ ", status=" + status + ", vNo=" + vNo + "]";
	}
	
	
	

}
