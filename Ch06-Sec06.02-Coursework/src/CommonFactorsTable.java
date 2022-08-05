
public class CommonFactorsTable {
	public static void main(String[] args) {
		
		int div = 0;
		
		//Top heading
		System.out.print("|-----|");
		for(int column = 2; column <= 20; column++) {
			System.out.print("-----");
		}
		System.out.println("|");
		
		System.out.print("|     |");
		
		for(int column = 2; column <= 20; column++) {
			if(column < 10)
				System.out.print("   " + column + " ");
			else
				System.out.print("  " + column + " ");
			
		}
		System.out.println("|");
		
		// Underline headings -- same as topline. 
		System.out.print("|-----|");
		for(int column = 2; column <= 20; column++) {
			System.out.print("-----");
		}
		System.out.println("|");
		
		// Now the rows
		for(int row = 2; row <=20; row++) {
			if(row<10)
				System.out.print("|   " + row + " |");
			else
				System.out.print("|  " + row + " |");
			for(int column = 2; column <= 20; column++) {
				if(row>column)
					div = column;
				else
					div = row;
				while((column%div!=0)||(row%div!=0))
					div--;
				if(div>1)
					System.out.print("---#-");
				else
					System.out.print("---|-");
				}
			System.out.println("|");
		}
		
		// Bottom line -- sama as Top line.
		System.out.print("|-----|");
		for(int row = 2; row <= 20; row++)
			System.out.print("-----");
		System.out.println("|");
	}
}
