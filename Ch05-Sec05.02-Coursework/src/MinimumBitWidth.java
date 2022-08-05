
public class MinimumBitWidth {
	public static void main(String[] args) {
		int noOfValues = 10000;
		int noOfBits = 0;
		int x = 2;
		
		while(Math.pow(x, noOfBits)<noOfValues) {
			noOfBits += 1;
			
			System.out.println("You need " + noOfBits
					+ " bits to represent "
					+ noOfValues + " values ");
		}
	}
}







