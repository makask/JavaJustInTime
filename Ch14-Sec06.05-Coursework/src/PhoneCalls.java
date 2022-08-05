import java.util.Scanner;
import java.io.File;

public class PhoneCalls {
	
	private static PhoneCallList callList;
	
	// Test file location: 
	//E:/EclipseWorkspace/JavaJustInTime2021/Ch14-Sec06.05-Coursework/src/test-phone-calls.txt
	
	public static void main(String[] args) throws Exception {
		callList = new PhoneCallList(new Scanner(new File(args[0])));
		Scanner inputScanner = new Scanner(System.in);
		String userInput;
		do {
			System.out.print("Enter phone number prefix, or Q to quit: ");
			userInput = inputScanner.nextLine();
			if(! userInput.equals("Q"))
				System.out.println(callList.matchingCallsReport(userInput));
		}while(! userInput.equals("Q"));
	}// main

}// class PhoneCalls
