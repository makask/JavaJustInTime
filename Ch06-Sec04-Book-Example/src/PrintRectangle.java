//Program to print out an isosceles right angled triangle.
//The height (which is also the width) is given as an argument.
//We assume the argument represents a positive integer.
public class PrintRectangle {
	public static void main(String[] args) {
		// The width of the rectangle, in cells.
		int width = 5;
		// The height of the rectangle, in cells. 
		int height = 10;
		
		//Print out height number of rows.
		for(int row=1; row <= height; row++) {
			// Print out width number of cells, on the same line.
			for(int column = 1; column <= width; column++) 
				System.out.print("[_]");
				// End the line 
				System.out.println();
		}//for
	}//main
}
