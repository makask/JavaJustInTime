// Print out an age history of two people.
// Arguments: present date, first birth date , second birth date
// Each date is three numbers: day month year.
public class AgeHistory2 {
	
	// The present date;
	private static Date presentDate;
	
	public static void main(String[] args) {
		
		presentDate = new Date(21,4,2021);
		Date birthDate1 = new Date(8,3,1983);
		Date birthDate2 = new Date(13,12,1989);
		
		printAgeHistory(1, birthDate1);
		printAgeHistory(2, birthDate2);
	}
	
	// Print the age history of one person, identified as personNumber.
	// The birth date must be less than the present date.
	private static void printAgeHistory(int personNumber, Date birthDate) {
		
		// Start by printing the event of birth.
		System.out.println("Pn " + personNumber + " was born on "
				+ birthDate.day + "/" + birthDate.month + "/" + birthDate.year + ".");
		
		// Now we will go through the years since birth but before today.
		int someYear = birthDate.year + 1;
		int ageInSomeYear = 1;
		while(someYear < presentDate.year 
				|| someYear == presentDate.year
			       && birthDate.month < presentDate.month
				|| someYear == presentDate.year
				   && birthDate.month == presentDate.month
				   && birthDate.day < presentDate.day) {
			
			System.out.println("Pn " + personNumber + " was " + ageInSomeYear 
					+ " on " + birthDate.day + "/" + birthDate.month + "/" + someYear + ".");
			someYear++;
			ageInSomeYear++;
		}//while
		
		// At this point birthDate.day/birthDate.month/someYear
		// will be the next birthday, aged ageInSomeYear.
		// This will be greater than or equal to the present date.
		// If the person has not yet had their birthday this year
		// someYear equals presentDate.year, 
		// otherwise someYear equals presentDate.year + 1.
		if(birthDate.month == presentDate.month && birthDate.day == presentDate.day)
			// then someYear must equal presentDate.year 
			System.out.println("Pn " + personNumber + " is "
					+ ageInSomeYear + " today");
		else
			System.out.println("Pn " + personNumber + " will be "
					+ ageInSomeYear + " on " + birthDate.day + "/"
					+ birthDate.month + "/" + someYear + ".");
		
	}
}
