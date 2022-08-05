// Gets current age from first argument, and reports age next year.
// Gives an error message if age is not a valid number.
public class AgeNextYear {
	// Returns true if and only if given string is all digits and not empty.
	private static boolean isNonEmptyDigits(String shouldBeDigits) {
		boolean okaySoFar = shouldBeDigits.length() != 0;
		int index = 0;
		while(okaySoFar && index < shouldBeDigits.length()) {
			okaySoFar = Character.isDigit(shouldBeDigits.charAt(index));
			index++;
		}// while
		return okaySoFar;
	}// isNonEmptyDigits
	
	// Check argument and compute result or report error.
	public static void main(String[] args) {
		if(args.length > 0 && isNonEmptyDigits(args[0])) {
			int ageNow = Integer.parseInt(args[0]);
			int ageNextYear = ageNow + 1;
			
			System.out.println("Your age now is " + ageNow);
			System.out.println("Your age next year will be " + ageNextYear);
		}// if
		else {
			System.out.println("Please supply you age, as a whole number.");
		}
	}// main
	
}// class AgeNextYear
