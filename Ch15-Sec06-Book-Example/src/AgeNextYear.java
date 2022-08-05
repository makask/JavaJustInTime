// Gets current age from first argument, and reports age next year.
// Gives an error message if age is not a valid number.
public class AgeNextYear {
	
	public static void main(String[] args) {
		
		try 
		{
			int ageNow = Integer.parseInt(args[0]);
			if(args.length > 1)
				throw new ArrayIndexOutOfBoundsException
							("You have supplied " + args.length + " arguments!");
			
			if(ageNow < 0)
				throw new NumberFormatException 
						("Your age of " + ageNow + " is negative!");
			
			int ageNextYear = ageNow + 1;
			
			System.out.println("Your age now is " + ageNow);
			System.out.println("Your age next year will be " + ageNextYear);
		}// try
		catch(ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("Please supply your age, and nothing else.");
			System.out.println("Exception message was: '"
					+ exception.getMessage() + "'");
			System.err.println(exception);
		}// catch
		catch(NumberFormatException exception)
		{
			System.out.println("Your age must be a non-negative whole number!");
			System.out.println("Exception message was: '"
					+ exception.getMessage() + "'");
			System.err.println(exception);
		}// catch
		// Other exceptions should not happen, 
		// but we catch anything else, lest we have overlooked something.
		catch(Exception exception)
		{
			System.out.println("Something unforeseen has happened. :-(");
			System.out.println("Exception message was: '"
					+ exception.getMessage() + "'");
			System.err.println(exception);
		}// catch
	}// main

}//class AgeNextYear