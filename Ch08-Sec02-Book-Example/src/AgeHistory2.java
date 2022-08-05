// Print out an age history of two people.
// Arguments: present year, first birth year, second birth year.
public class AgeHistory2 {
	
	public static void main(String[] args) {
		// The year of the present day.
		int presentYear = 2021;
		
		// The two birth years, which must be less than the present year.
		int birthYear1 = 1983;
		int birthYear2 = 1989;
		
		// PERSON 1 
		// Start by printing the event of birth.
		System.out.println("Pn 1 was born in " + birthYear1 + ".");
		
		// Now we will go through the years between birth and last year.
		int someYear1 = birthYear1 + 1;
		int ageInSomeYear1 = 1;
		while(someYear1 != presentYear) {
			System.out.println("Pn 1 was " + ageInSomeYear1 + " in " + someYear1);
			someYear1++;
			ageInSomeYear1++;
		}
		
		// Finally, the age of the person this year.
		System.out.println("Pn 1 is " + ageInSomeYear1 + " this year. ");
		
		// PERSON 2
		// Start by printing the event of birth.
		System.out.println("Pn 1 was born in " + birthYear1 + ".");
				
		// Now we will go through the years between birth and last year.
		int someYear2 = birthYear2 + 1;
		int ageInSomeYear2 = 1;
		while(someYear2 != presentYear) {
			System.out.println("Pn 2 was " + ageInSomeYear2 + " in " + someYear2);
			someYear2++;
			ageInSomeYear2++;
		}
				
		// Finally, the age of the person this year.
		System.out.println("Pn 1 is " + ageInSomeYear2 + " this year. ");
	}
	
	
}
