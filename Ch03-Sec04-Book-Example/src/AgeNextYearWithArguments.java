
public class AgeNextYearWithArguments {
	public static void main(String[]args) {
		int ageNow;
		int ageNextYear;
		
		ageNow = Integer.parseInt(args[0]);
		ageNextYear = ageNow + 1;
		
		System.out.println("My age now is " + ageNow + ".");
		System.out.println("My age next year will be " + ageNextYear + ".");
	}
}
