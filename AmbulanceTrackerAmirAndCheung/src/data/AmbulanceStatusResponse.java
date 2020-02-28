package cho.hackathon.data;

public class AmbulanceStatusResponse {

	public AmbulanceStatusResponse() {
		// TODO Auto-generated constructor stub
	}

	
	private String etaOfAmbulance;
	private String patienceStatus;
	private String ambulanceId;
	private String requestStatus;
	private String transactionId;
	
	
	
	public String getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getEtaOfAmbulance() {
		return etaOfAmbulance;
	}
	public void setEtaOfAmbulance(String etaOfAmbulance) {
		this.etaOfAmbulance = etaOfAmbulance;
	}
	public String getPatienceStatus() {
		return patienceStatus;
	}
	public void setPatienceStatus(String patienceStatus) {
		this.patienceStatus = patienceStatus;
	}
	public String getAmbulanceId() {
		return ambulanceId;
	}
	public void setAmbulanceId(String ambulanceId) {
		this.ambulanceId = ambulanceId;
	}
	
	
	
}
