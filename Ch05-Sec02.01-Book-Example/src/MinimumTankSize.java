
public class MinimumTankSize {
	public static void main(String[] args) {
		double requiredVolume = Double.parseDouble(args[0]);
		int sideLength = 1;
		
		while(sideLength * sideLength * sideLength < requiredVolume) {
			sideLength = sideLength + 1;
			System.out.println("You need a tank of " + sideLength 
					+ " metres per side to hold the volume "
					+ requiredVolume + " cubic metres. ");
		}
	}
}
