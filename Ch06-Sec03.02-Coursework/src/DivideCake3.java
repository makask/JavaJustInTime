
public class DivideCake3 {
	public static void main(String[] args) {
		int age1 = 12;
		int age2 = 16;
		int age3 = 20;
		
		int multiple1OfGCD = age1;
		int multiple2OfGCD = age2;
		int multiple3OfGCD = age3;
		
		while(multiple1OfGCD!=multiple2OfGCD) {
			if(multiple1OfGCD>multiple2OfGCD)
				multiple1OfGCD-=multiple2OfGCD;
			else
				multiple2OfGCD-=multiple1OfGCD;
		}
		
		while(multiple1OfGCD!=multiple3OfGCD) {
			if(multiple1OfGCD>multiple3OfGCD)
				multiple1OfGCD-=multiple3OfGCD;
			else
				multiple3OfGCD-=multiple1OfGCD;
		}
		
		while(multiple2OfGCD!=multiple3OfGCD) {
			if(multiple2OfGCD>multiple3OfGCD)
				multiple2OfGCD-=multiple3OfGCD;
			else
				multiple3OfGCD-=multiple2OfGCD;
		}
		
		System.out.println("The GCD of " + age1 + ", " + age2 + " and " + age3 + " is " + multiple1OfGCD + ".");
		
		int noOfPortions1 = age1/multiple1OfGCD;
		int noOfPortions2 = age2/multiple2OfGCD;
		int noOfPortions3 = age3/multiple3OfGCD;
		
		System.out.println("So the cake should be divided into "
		          + (noOfPortions1 + noOfPortions2 + noOfPortions3) + ".");
		
		System.out.println("The " + age1 + " year old gets " + noOfPortions1
		          + " and the " + age2 + " year old gets " + noOfPortions2
		          + " and the " + age3 + " year old gets " + noOfPortions3 + ".");
	}
}
