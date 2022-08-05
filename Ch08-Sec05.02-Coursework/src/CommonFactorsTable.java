
public class CommonFactorsTable {
	
	private static int tableSize = 20;
	
	public static void main(String[] args) {
		
		printLine();
		printColumnHeadings();
		printLine();
		for(int row = 2; row <= tableSize; row++)
			printRow(row);
		printLine();
	}
	
	private static void printLine() {
		System.out.print("|-----|");
		for(int column = 2; column <=tableSize; column++)
			System.out.print("----");
		System.out.println("|");
	}
	
	private static void printColumnHeadings() {
		System.out.print("|     |");
		for(int column = 2; column <= tableSize; column++)
			printNumber(column);
		System.out.println("|");
	}
	
	private static void printNumber(int n) {
		System.out.printf("%4d", n);
	}
	
	private static void printRow(int row) {
		System.out.print("|");
		printNumber(row);
		System.out.print(" |");
		for(int row2 = 2; row2 <= tableSize; row2++) {
			//printNumber(row2 * row);
			printGCDGreaterThanOne(row,row2);
		}
		System.out.println("|");
	}
	
	private static int calculateGCD(int number1, int number2) {
		while(number1!=number2)
			if(number1>number2)
				number1-=number2;
			else
				number2-=number1;
		return number1;
	}
	
	private static void printGCDGreaterThanOne(int number1, int number2) {
		if(calculateGCD(number1,number2)>1)
			System.out.print("--#-");
		else
			System.out.print("--|-");
	}
}
