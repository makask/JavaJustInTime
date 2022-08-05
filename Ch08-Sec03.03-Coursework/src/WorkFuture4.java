
public class WorkFuture4 {
	
	public static void main(String[] args) {
		
		printWorkFuture(1, 1989, 2021, 68);
		printWorkFuture(2, 1983, 2021, 68);
		printWorkFuture(3, 2000, 2021, 68);
		printWorkFuture(4, 2011, 2021, 68);
		
	}
	
	private static void printWorkFuture(int personNumber ,int birthYear, int presentYear, int workYears) {
		int yearOfRetirement = birthYear + workYears;
		int yearsLeftToWork = workYears - (presentYear - birthYear);
		
		System.out.println("Pn " + personNumber + " has " + yearsLeftToWork + " years left to work. ");
		
		while(presentYear!=yearOfRetirement) {
			System.out.println("In "  + presentYear + " pn " + personNumber + " will have " + yearsLeftToWork + " years left to work. ");
			presentYear++;
			yearsLeftToWork--;
		}
		System.out.println("Pn " + personNumber + " will retire in " + yearOfRetirement + ".");
	}

}
