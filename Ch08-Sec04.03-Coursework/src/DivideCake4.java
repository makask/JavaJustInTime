
public class DivideCake4 {
	
	public static void main(String[] args) {
		int age1 = 5; 
		int age2 = 10;
		int age3 = 15;
		int age4 = 20;
		
		int agesGCD = greatestCommonDivisor(age1, age2, age3, age4);
		
		System.out.println("The GCD of " + age1 + " and " + age2 + " and " + age3 + " and " + age4
				+ " is " + agesGCD + ".");
		
		int noOfPortions1 = age1 / agesGCD;
		int noOfPortions2 = age2 / agesGCD;
		int noOfPortions3 = age3 / agesGCD;
		int noOfPortions4 = age4 / agesGCD;
		
		System.out.println("So the should be divided into "
				+ (noOfPortions1 + noOfPortions2 + noOfPortions3 + noOfPortions4 + "."));
		
		System.out.println("The " + age1 + " year old gets " + noOfPortions1
				+ " and the " + age2 + " year old gets " + noOfPortions2 
				+ " and the " + age3 + " year old gets " + noOfPortions3
				+ " and the " + age4 + " year old gets " + noOfPortions4 + ".");
	}
	
	private static int greatestCommonDivisor(int age1, int age2, int age3, int age4) {
		
		while(age1!=age2)
			if(age1>age2)
				age1-=age2;
			else
				age2-=age1;
		while(age1!=age3)
			if(age1>age3)
				age1-=age3;
			else
				age3-=age1;
		while(age1!=age4)
			if(age1>age4)
				age1-=age4;
			else
				age4-=age1;
		return age1;
	}

}
