
public class WorkFuture {
	
	public static void main(String[] args) {
		int presentYear = 2021;
		int birthYear = 1983;
		int workYears = 68;
		int yearOfRetirement = birthYear + workYears;
		int yearsLeftToWork = workYears - (presentYear - birthYear);
		System.out.println("You have " + yearsLeftToWork + " years left to work. ");
		while(presentYear!=yearOfRetirement) {
			System.out.println("In "  + presentYear + " you will have " + yearsLeftToWork + " years left to work. ");
			presentYear = presentYear + 1;
			yearsLeftToWork = yearsLeftToWork - 1;
		}
		System.out.println("You will retire in " + yearOfRetirement + ".");
	}
}
