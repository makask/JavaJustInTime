
public class PhoneCall {
	
	private String phoneNumber;
	private Duration callDuration;
	private double cost;
	
	public PhoneCall(String details) {
		String[]detailParts = details.split("\t+");
		phoneNumber = detailParts[0];
		callDuration = new Duration(detailParts[1]);
		cost = Double.parseDouble(detailParts[2]);
	}// PhoneCall
	
	public String getPhoneNumber() {
		return phoneNumber;
	}// getPhoneNumber
	
	public Duration getDuration() {
		return callDuration;
	}//getDuration
	
	public double getCost() {
		return cost;
	}// getCost
	
	public String toString() {
		//return phoneNumber + "\t" + callDuration + "\t" + cost + "\t";
		return String.format(phoneNumber + "\t" + callDuration + "\t%1.2f", cost);
	}// toString
	

}// class PhoneCall
