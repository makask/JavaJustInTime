
public class MaxTwoDoubles {
	public static void main(String[] args) {
		double firstNum = Double.parseDouble(args[0]);
		double secondNum = Double.parseDouble(args[1]);
		
		System.out.println("First number is: " + firstNum);
		System.out.println("Second number is: " + secondNum);
		
		if(firstNum > secondNum)
			System.out.println("Maximum is first number: " + firstNum + ".");
		else
			System.out.println("Maximum is second number: " + secondNum + ".");
	}
}
