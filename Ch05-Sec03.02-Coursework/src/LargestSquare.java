
public class LargestSquare {
	
	public static void main(String[] args) {
		
		int max = 5;
		int largestSquare = 0;
		
		while(Math.pow(largestSquare, 2) <= max) {
			largestSquare+=1;
		}
		
		largestSquare = (int) Math.pow(largestSquare -1, 2);
		System.out.println("Max number : " + max);
		System.out.println("Largest square: " + largestSquare);
	}
}
