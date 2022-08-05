import java.util.Arrays;
import java.util.Scanner;

public class PhoneCallList {
	
	private static final int INITIAL_ARRAY_SIZE = 100, ARRAY_RESIZE_FACTOR = 2;
	
	private int noOfPhoneCallItems;
	private PhoneCall[] phoneCallList;
	
	public PhoneCallList(Scanner scanner) {
		phoneCallList = new PhoneCall[INITIAL_ARRAY_SIZE];
		noOfPhoneCallItems = 0;
		while(scanner.hasNextLine()) {
			PhoneCall latestCall = new PhoneCall(scanner.nextLine());
			// Array extension
			if(noOfPhoneCallItems==phoneCallList.length) {
				PhoneCall[]biggerArray = new PhoneCall[phoneCallList.length * ARRAY_RESIZE_FACTOR];
				for(int index = 0; index < phoneCallList.length; index++)
					biggerArray[index] = phoneCallList[index];
				phoneCallList = biggerArray;
			}//if
			phoneCallList[noOfPhoneCallItems] = latestCall;
			noOfPhoneCallItems++;
		}//while
	}// PhoneCallList
	
	public PhoneCall[]getPhoneCallList(){
		return phoneCallList;
	}// getPhoneCallList
	
	// Find the PhoneCall objects corresponding to prefix
	// or return null if not found 
	//public PhoneCall[] findCalls(String prefix) {
		
	//}// findCall
	
	public String matchingCallsReport(String userInput) {
		
		String result = "";
		int callCountInArray = getCallItems();
		int callsMatched = 0;
		double totalCost = 0;
		Duration duration = new Duration("00:00:00");
		for(int index = 0; index < callCountInArray; index++) {
			if(phoneCallList[index].getPhoneNumber().contains(userInput)) {
				result += phoneCallList[index] + "\n";
				duration = duration.add(phoneCallList[index].getDuration());
				totalCost += phoneCallList[index].getCost();
				callsMatched++;
			}// if
		}// for
		
		result += "\nCalls Matched:\t " + callsMatched 
				+ "\nTotal duration:\t " + duration
				+ "\nTotal cost:\t" + totalCost;
		return result;
	}// matchinCallsReport
	
	// Get valid PhoneCallItems, items with null value are not counted
	private int getCallItems() {
		int itemCount = 0;
		for(int index = 0; index < phoneCallList.length; index++) {
			if(phoneCallList[index]!=null)
				itemCount++;
		}
		return itemCount;
	}// getCallItems
	
	//public String toString() {
	//	String result = "";
	//	for(int index = 0; index < phoneCallList.length; index++) {
	//		result += phoneCallList[index];
	//	}
	//	return result;
	//}
	

}// class PhoeCallList
