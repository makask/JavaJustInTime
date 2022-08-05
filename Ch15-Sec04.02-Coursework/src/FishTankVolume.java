
public class FishTankVolume {
	
	public static void main(String[] args) {
		try {
			
			int width = Integer.parseInt(args[0]);
			int depth = Integer.parseInt(args[1]);
			int height = Integer.parseInt(args[2]);
			
			int volume = width * depth * height;
			System.out.println("The volume of a tank with dimensions "
					+ "(" + width + "," + depth + "," + height + ") "
					+ "is " + volume + ".");
			
		}catch(Exception exception) {
			System.out.println("Please supply width, depth and height as whole numbers.");
			System.out.println("Exception message was: '"
					+ exception.getMessage() + "'");
			System.err.println(exception);
		}
	}// main

}// class FishTankVolume
