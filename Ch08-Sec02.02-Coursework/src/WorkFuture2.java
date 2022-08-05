public class WorkFuture2 {
	public static void main(String[] args) {
		int presentYear1 = 2021;
		int workYears1 = 68;
		
		// PERSON 1 DATA : 
		int birthYear1 = 1983;
		int yearOfRetirement1 = birthYear1 + workYears1;
		int yearsLeftToWork1 = workYears1 - (presentYear1 - birthYear1);
		
		System.out.println("Pn 1 has " + yearsLeftToWork1 + " years left to work. ");
		
		while(presentYear1!=yearOfRetirement1) {
			System.out.println("In "  + presentYear1 + " pn 1 will have " + yearsLeftToWork1 + " years left to work. ");
			presentYear1 = presentYear1 + 1;
			yearsLeftToWork1 = yearsLeftToWork1 - 1;
		}
		System.out.println("Pn 1 will retire in " + yearOfRetirement1 + ".");
		
		int presentYear2 = 2021;
		int workYears2 = 68;
		
		// PERSON 2 DATA : 
		int birthYear2 = 1989;
		int yearOfRetirement2 = birthYear2 + workYears2;
		int yearsLeftToWork2 = workYears2 - (presentYear2 - birthYear2);
		
		System.out.println("Pn 2 has " + yearsLeftToWork2 + " years left to work. ");
		
		while(presentYear2!=yearOfRetirement2) {
			System.out.println("In "  + presentYear2 + " pn 2 will have " + yearsLeftToWork2 + " years left to work. ");
			presentYear2 = presentYear2 + 1;
			yearsLeftToWork2 = yearsLeftToWork2 - 1;
		}
		System.out.println("Pn 2 will retire in " + yearOfRetirement2 + ".");
	}
}
