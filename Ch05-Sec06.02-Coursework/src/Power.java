
public class Power{
	
	
	public static void main(String[] args) {
		
		double number1 = 2;
		int power = 3;
		double answer = 1;
		
		for (int i = 1; i <= power; i++) {
			
			answer *= number1;
			
					
		}
		System.out.println(number1 + " raised to power of " 
				          + power + " equals " + answer);
		
	 }
}