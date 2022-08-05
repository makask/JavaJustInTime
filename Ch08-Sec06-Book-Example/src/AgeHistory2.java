// Print out an age history of two people.
// Arguments: present date, first birth date, second birth date.
// Each date is three numbers: day, month, year.
public class AgeHistory2 {
	
	// The present date, strored as three variables.
	private static int presentDay, presentMonth, presentYear;
	
	public static void main(String[] args) {
		
		presentDay = 20;
		presentMonth = 4;
		presentYear = 2021;
		
		printAgeHistory(1,8,3,1983);
	}
	
	// Print the age history of one person, identified as personNumber.
	// The birth date must be less than the present date.
	private static void printAgeHistory(int personNumber, int birthDay, int birthMonth, int birthYear) {
		// Start by printing the event of birth.
		System.out.println("Pn " + personNumber + " was born on " 
				+ birthDay + "/" + birthMonth + "/" + birthYear + ".");
		
		// Now we will go through the years since birth but before today.
		int someYear = birthYear + 1;
		int ageInSomeYear = 1;
		while(someYear < presentYear 
				|| someYear == presentYear && birthMonth < presentMonth
				|| someYear == presentYear && birthMonth == presentMonth
				&& birthDay < presentDay) {
			
			System.out.println("Pn " + personNumber + " was " + ageInSomeYear
					+ " on " + birthDay + "/" + birthMonth
					+ "/" + someYear);
			
			someYear++;
			ageInSomeYear++;
		}
		
		// At this point birthDay/birthMonth/someYear
		// will be the next birthday, aged ageInSomeYear.
		// This will be greater than or equal to the present date.
		// If the person has not yet had their birthday this year
		// someYear equals presentYear.
		if(birthMonth == presentMonth && birthDay == presentDay)
			// then someYear must equal presentYear.
			System.out.println("Pn " + personNumber + " is "
					+ ageInSomeYear + " today!");
		else
			System.out.println("Pn " + personNumber + " will be "
					+ ageInSomeYear + " on " + birthDay + "/"
					+ birthMonth + "/" + someYear + ".");
	}
	
	

}
