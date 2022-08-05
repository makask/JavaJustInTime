
public class Variance {
	public static void main(String[] args) {
		double arrayFirstNumber = Double.parseDouble(args[0]);
		
		double meanAverage = 0; 
		double variance = 0;
		
		
		for (int index = 0; index < args.length; index++) {
			meanAverage = meanAverage + Double.parseDouble(args[index]);
		}
		
		meanAverage = meanAverage / args.length;
		
		for (int index = 0; index < args.length; index++) {
			variance = variance + Math.pow(Double.parseDouble(args[index])-meanAverage, 2);
		}
		
		variance = variance / args.length;
		
		System.out.println("The mean average is " + meanAverage);
		System.out.println("The variance is " + variance);
	}
}
