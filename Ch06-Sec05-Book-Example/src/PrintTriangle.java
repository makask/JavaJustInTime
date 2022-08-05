//Program to print out an isosceles right angled triangle.
//The height (which is also the width) is given as an argument.
//We assume the argument represents a positive integer.

public class PrintTriangle {
	
	public static void main(String[] args) {
		
		//The height (also the width) is given as an argument.
		//int height = Integer.parseInt(args[0]);
		int height = 5;
		
		//Print out height number of rows.
		for (int column = 1; column <=height; column++) {
			//Print out row number of cells, on the same line.
			for (int row = 1; row<= column; row++) {
				System.out.print("[_]");
			}
			System.out.println();
		}
		
	}
}
