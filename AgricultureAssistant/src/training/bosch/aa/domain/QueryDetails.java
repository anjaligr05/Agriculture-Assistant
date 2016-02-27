package training.bosch.aa.domain;

public class QueryDetails {
	private int queryId;
	private String query;
	private String answer;
	private String status;
	private String pName;
	
	
	
	public QueryDetails() {
		super();
	}



	public QueryDetails(int queryId, String query, String answer,
			String status, String pName) {
		super();
		this.queryId = queryId;
		this.query = query;
		this.answer = answer;
		this.status = status;
		this.pName = pName;
	}



	public int getQueryId() {
		return queryId;
	}



	public void setQueryId(int queryId) {
		this.queryId = queryId;
	}



	public String getQuery() {
		return query;
	}



	public void setQuery(String query) {
		this.query = query;
	}



	public String getAnswer() {
		return answer;
	}



	public void setAnswer(String answer) {
		this.answer = answer;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getpName() {
		return pName;
	}



	public void setpName(String pName) {
		this.pName = pName;
	}



	@Override
	public String toString() {
		return "QueryDetails [answer=" + answer + ", pName=" + pName
				+ ", query=" + query + ", queryId=" + queryId + ", status="
				+ status + "]";
	}
	
	
	
	
	
}
