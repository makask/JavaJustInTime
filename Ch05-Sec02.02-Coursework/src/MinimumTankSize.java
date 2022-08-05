
public class MinimumTankSize {
	
	public static void main(String[] args) {
		double requiredVolume = Double.parseDouble(args[0]);
		double sideLength = 1;
		
		while(sideLength * sideLength * sideLength < requiredVolume) {
			sideLength = sideLength + 0.5;
			System.out.println("You need a tank of " + sideLength 
					+ " metres per side to hold the volume "
					+ requiredVolume + " cubic metres. ");
		}
	}
}

