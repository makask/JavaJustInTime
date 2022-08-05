//Program to decide how to divide a cake in proportion to the age of two 
//persons, using the minimum number of equal sized portions.
//The two arguments are the two positive integer ages.

//GCD(25,20)
//=(25-20,20) = (5,20)
//=(20-5,5)   = (5, 15)
//=(15-5,5)  = (10,5)
//=(10-5,5) =  (5,5)
public class DivideCake {
	public static void main(String[] args) {
		
		// Both ages must be positive.
		
		// First person`s age.
		int age1 = 10;
		// Second person`s age.
		int age2 = 15;
		
		//This is a multiple of the GCD, initially age1.
		int multiple1OfGCD = age1;
		
		//This is a multiple of the GCD, initially age2.
		int multiple2OfGCD = age2;
		
		//Compute the GCD of multiple1OfGCD and multiple2OfGCD.
		//While the two multiples are not the same, the difference
		//between them must also be a multiple of the GCD.
				
		//E.g. X = x * d, Y = y * d, (X - Y) = (x - y) * d
		
		//So we keep subtracting the smallest from the largest
		//until they are equal.
		while(multiple1OfGCD!=multiple2OfGCD) {
			if(multiple1OfGCD>multiple2OfGCD)
				multiple1OfGCD-=multiple2OfGCD;
			else
				multiple2OfGCD-=multiple1OfGCD;
		}
		
		// Now multiple1OfGCD == multiple2OfGCD
		//which is also the GCD of age1 and age2.
		System.out.println("The GCD of " + age1 + " and " + age2
		          + " is " + multiple1OfGCD + ".");
		
		//Calculate the number of portions for each person.
		int noOfPortions1 = age1/multiple1OfGCD;
		int noOfPortions2 = age2/multiple2OfGCD;
				
		//Report the total number of portions.
		System.out.println("So the cake should be divided into "
						          + (noOfPortions1 + noOfPortions2));
		//Report the number of portions for each person.
		System.out.println("The " + age1 + " year old gets " + noOfPortions1
						          + " and the " + age2 + " year old gets " + noOfPortions2);
	}
}
