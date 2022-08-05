
public class MeanAverage {
	public static void main(String[] args) {
		int sumSoFar = Integer.parseInt(args[0]);
		
		for (int index = 1; index < args.length; index = index + 1) {
			sumSoFar = sumSoFar + Integer.parseInt(args[index]);
		}
		
		System.out.println("The mean average is "
				+ sumSoFar / (double) args.length);
	}
}
