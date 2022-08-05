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
		// We keep track of the birthday we are considering.
		Date someBirthday = new Date(birthDate.day, birthDate.month, birthDate.year + 1);
		int ageOnSomeBirthday = 1;
		while(someBirthday.lessThan(presentDate)) {
			
			System.out.println("Pn " + personNumber + " was " + ageOnSomeBirthday 
					+ " on " + someBirthday.day + "/" + someBirthday.month + "/" + someBirthday.year + ".");
			someBirthday = new Date(someBirthday.day, someBirthday.month, someBirthday.year + 1);
			ageOnSomeBirthday++;
		}//while
		
		// Now deal with the next birthday.
		if(someBirthday.equals(presentDate))
			// then someYear must equal presentDate.year 
			System.out.println("Pn " + personNumber + " is "
					+ ageOnSomeBirthday + " today!");
		else
			System.out.println("Pn " + personNumber + " will be "
					+ ageOnSomeBirthday + " on " + someBirthday.day + "/"
					+ someBirthday.month + "/" + someBirthday.year + ".");
		
	}
}