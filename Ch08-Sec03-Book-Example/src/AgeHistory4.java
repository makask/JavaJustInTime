// Print out an age history of four people.
// Arguments: present year, first birth year, second, third, fourth. 
public class AgeHistory4 {
	
	// The main method: get arguments and call printAgeHistory.
	public static void main(String[] args) {
		
		// The year of the presentday. 
		int presentYear = 2021;
		// The four birth years which must be less than than the present year.
		int birthYear1 = 1956;
		int birthYear2 = 1976;
		int birthYear3 = 1990;
		int birthYear4 = 2003;
		
		// Now print the four age histories.
		printAgeHistory(presentYear, 1, birthYear1);
		printAgeHistory(presentYear, 2, birthYear2);
		printAgeHistory(presentYear, 3, birthYear3);
		printAgeHistory(presentYear, 4, birthYear4);
	}
	
	// Print the age history of one person, identified as personNumber.
	// Birth year must be less than present year.
	private static void printAgeHistory(int presentYear, int personNumber, int birthYear) {
		
		//Start by printing the event of birth.
		System.out.println("Pn " + personNumber + " was born in " + birthYear + ".");
		
		// Now we will go through the years between birth and last year. 
		int someYear = birthYear + 1;
		int ageInSomeYear = 1;
		
		while(someYear != presentYear) {
			System.out.println("Pn " + personNumber + " was " 
		+ ageInSomeYear + " in " + someYear + ".");
			someYear++;
			ageInSomeYear++;
		}
		// Finally, the age of the person this year.
		System.out.println("Pn " + personNumber + " is " 
				+ ageInSomeYear + " this year.");
	}
	
	
}
