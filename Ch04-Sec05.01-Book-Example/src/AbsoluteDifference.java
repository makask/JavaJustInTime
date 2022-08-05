
public class AbsoluteDifference {
	
	public static void main(String[] args) {
		
		double firstNumber = Double.parseDouble(args[0]);
		double secondNumber = Double.parseDouble(args[1]);
		
		double absoluteDifference;
		
		if(firstNumber > secondNumber) {
			System.out.println("First number is larger then the second.");
			absoluteDifference = firstNumber - secondNumber;
		}
		else if(firstNumber == secondNumber) {
			System.out.println("Numbers are equal.");
			absoluteDifference = 0;
		}
		else {
			System.out.println("The second number is larger than the first.");
			absoluteDifference = secondNumber - firstNumber;
		}
		System.out.println("The absolute difference is " + absoluteDifference);
	}

}
