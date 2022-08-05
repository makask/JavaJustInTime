// Program to decide how to divide a cake in proportion to the age of two
// persons, using the minimum number of equal sized portions.
// The two arguments are the two positive integer ages.
public class DivideCake {
	
	// Obtain arguments, get GCD, compute portions and report it all.
	public static void main(String[] args) {
		
		// Both ages must be positive.
		int age1 = 14;
		int age2 = 21;
		
		int agesGCD = greatestCommonDivisor(age1, age2);
		
		System.out.println("The GCD of " + age1 + " and " + age2
				+ " is " + agesGCD + ".");
		
		int noOfPortions1 = age1 / agesGCD;
		int noOfPortions2 = age2 / agesGCD;
		
		System.out.println("So the should be divided into "
				+ (noOfPortions1 + noOfPortions2));
		
		System.out.println("The " + age1 + " year old gets " + noOfPortions1
				+ " and the " + age2 + " year old gets " + noOfPortions2 + ".");
	}
	
	// Find the GCD of two positive integers.
	private static int greatestCommonDivisor(int multiple1OfGCD, int multiple2OfGCD) {
		
		// Both multiple1OfGCD and multiple2OfGCD must be positive.
		// While the two multiples are not the same, the difference
		// between them must also be a multiple of the GCD.
		// So we keep subtracting the smallest from the largest
		// until they are equal.
		
		while(multiple1OfGCD!=multiple2OfGCD) 
			if(multiple1OfGCD>multiple2OfGCD)
				multiple1OfGCD-=multiple2OfGCD;
			else
				multiple2OfGCD-=multiple1OfGCD;
		// Now multiple1OfGCD == multiple2OfGCD
		// which is alse the GCD of their original values.
		return multiple1OfGCD;
	}
}
