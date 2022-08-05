import java.util.Arrays;

public class FishTankVolume {
	
	public static void main(String[]args) {
		
		if(args.length > 0 && isNonEmptyDigits(args[0]) && isNonEmptyDigits(args[1]) && isNonEmptyDigits(args[2])) {
			int width = Integer.parseInt(args[0]);
			int depth = Integer.parseInt(args[1]);
			int height = Integer.parseInt(args[2]);
			
			int volume = width * depth * height;
			System.out.println("The volume of a tank with dimensions "
					+ "(" + width + "," + depth + "," + height + ") "
					+ "is " + volume + ".");
		}else {
			System.out.println("Please enter three whole numbers: ");
		}// else
		
	}// main
	
	private static boolean isNonEmptyDigits(String shouldBeDigits) {
		boolean okaySoFar = shouldBeDigits.length() != 0;
		int index = 0;
		while(okaySoFar && index < shouldBeDigits.length()) {
			okaySoFar = Character.isDigit(shouldBeDigits.charAt(index));
			index++;
		}// while
		return okaySoFar;
	}// isNonEmptyDigits
	
}// class FishTankVolume
