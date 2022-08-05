// 2 3 6 2 6 1
public class MaxList {
	public static void main(String[] args) {
		double firstNumber = Double.parseDouble(args[0]);
		double max = firstNumber;
		int maximumsFound = 0;
		int position = 1;
		
		for(int index = 1; index < args.length; index++) {
			if(Double.parseDouble(args[index])>max) {
				max = Double.parseDouble(args[index]);
				maximumsFound++;
				position++;
			}
			
		}
		
		System.out.println("The maximum from given list of numbers is : " + max + " in the position of " + position);
		
	}
	
}
