public class YearsBeforeRetirement {
	public static void main(String[]args) {
		int myAgeNow;
		int ageOfRetirement;
		int yearsLeftWorking;
		myAgeNow = Integer.parseInt(args[0]);
		ageOfRetirement = 68;
		yearsLeftWorking = ageOfRetirement - myAgeNow;
		System.out.println("My age now is " + myAgeNow + ".");
		System.out.println("I will retire at the age of " + ageOfRetirement + ".");
		System.out.println("Years left working is " + yearsLeftWorking + ".");
	}
}
