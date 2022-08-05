// Gets currnt age from first argument, and reports age next year.
public class AgeNextYear {
	public static void main(String[] args) {
		int ageNow = Integer.parseInt(args[0]);
		int ageNextYear = ageNow + 1;
		
		System.out.println("Your age now is " + ageNow);
		System.out.println("Your age next year will be " + ageNextYear);
	}// main
}// AgeNextYear
