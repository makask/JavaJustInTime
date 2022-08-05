//Program to find the four numbers in the range 100 to 999
//which have the property that the sum of the cubes of the three
//digits in the number is equal to the number itself.
public class SumOfCubedDigits {
	
	public static void main(String[] args) {
		// Print the message before printing the numbers.
		 System.out.print("The fours numbers in the range 100 to 999 " 
		                  +"with the property requested are: \n");
		 
		// Begin three nested for loops.
		for(int firstDigit = 1; firstDigit < 10; firstDigit++) {
			for(int secondDigit = 0; secondDigit < 10; secondDigit++) {
				for(int thirdDigit = 0; thirdDigit < 10; thirdDigit++) {
					
					int number = firstDigit * 100
							+ secondDigit * 10
							+ thirdDigit;
					
					int sumOfCubes = firstDigit * firstDigit * firstDigit 
							+ secondDigit * secondDigit * secondDigit
							+ thirdDigit * thirdDigit * thirdDigit;
					
					if(sumOfCubes == number) {
						System.out.println(number);
					}
				}
			}
		}
		       
	}
}
