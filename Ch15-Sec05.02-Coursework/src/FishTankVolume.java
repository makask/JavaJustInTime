
public class FishTankVolume {
	
	public static void main(String[] args) {
		
		try
		{
			int width = Integer.parseInt(args[0]);
			int depth = Integer.parseInt(args[1]);
			int height = Integer.parseInt(args[2]);
			
			int volume = width * depth * height;
			System.out.println("The volume of a tank with dimensions "
					+ "(" + width + "," + depth + "," + height + ") "
					+ "is " + volume + ".");
		}// try
		catch(ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("Please supply fish tank dimensions as width, depth, height.");
			System.err.println(exception);
		}// catch
		catch(NumberFormatException exception)
		{
			System.out.println("Dimensions width, depth and height must be whole numbers!");
			System.out.println("Exception message was: '"
					+ exception.getMessage() + "'");
			System.err.println(exception);
		}
		catch(Exception exception)
		{
			System.out.println("Something unforeseen has happened. :-(");
			System.out.println("Exception message was: '"
					+ exception.getMessage() + "'");
			System.err.println(exception);
		}// catch
	}// main

}// class FishTankVolume
