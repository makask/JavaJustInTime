import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

// "E:/EclipseWorkspace/JavaJustInTime2021/Ch14-Sec05.05-Coursework/src/puzzle.txt"
public class RandomOrderPuzzle {
	
	// The number of lines in the puzzle.
	private int noOfLines;
		
	// The puzzle lines in original order.
	private String[] linesInOriginalOrder;
	
	public static void main(String[] args) throws Exception {
		
		Scanner fileScanner = new Scanner(new File(args[0]));
		RandomOrderPuzzle puzzle = new RandomOrderPuzzle(fileScanner);
		
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println(puzzle);
		
	}
	
	public RandomOrderPuzzle(Scanner scanner) {
		
		readPuzzleInOriginalOrder(scanner);
		
		String[]originalPuzzle = copyArray(linesInOriginalOrder,noOfLines);
		String[]randomisedPuzzle = copyArray(linesInOriginalOrder, noOfLines);
		
		randomizeStringArrayOrder(randomisedPuzzle);
		
		playTheGame(originalPuzzle, randomisedPuzzle);
		
	}
	
	private void randomizeStringArrayOrder(String[] anArray) {
		for(int itemsRemaining = anArray.length; itemsRemaining > 0; itemsRemaining--) {
			int anIndex = (int) Math.random() * itemsRemaining;
			String itemAtAnIndex = anArray[anIndex];
			anArray[anIndex] = anArray[anArray.length - 1];
			anArray[anArray.length - 1] = itemAtAnIndex;
		}
	}
	
	// Initial size of the jobsInOriginalOrder array.
	private static final int INITIAL_ARRAY_SIZE = 2;
		
	// When jobsInOriginalOrder is full, we extend it by this factor.
	private static final int ARRAY_RESIZE_FACTOR = 1;
	
	// Read puzzle data from the given Scanner, count them using noOfLines,
	// and store in linesInOriginalOrder -- extending as required.
	private void readPuzzleInOriginalOrder(Scanner scanner) {
		
		linesInOriginalOrder = new String[INITIAL_ARRAY_SIZE];
		noOfLines = 0;
		while(scanner.hasNextLine()) {
			// Obtain the next line.
			String currentLine = readOneLine(scanner);
			// Extend the array if it is too small.
			if(noOfLines == linesInOriginalOrder.length) {
				String[]biggerArray = new String[linesInOriginalOrder.length + ARRAY_RESIZE_FACTOR];
				for(int index = 0; index < linesInOriginalOrder.length; index++)
					biggerArray[index] = linesInOriginalOrder[index];
				linesInOriginalOrder = biggerArray;
			}// if
			// Finally store the puzzle lines and update noOfLines
			linesInOriginalOrder[noOfLines] = currentLine;
			noOfLines++;
		}//while
	}
	
	// Read one line of text from the Scanner,
	private String readOneLine(Scanner scanner) {
		String data = scanner.nextLine();
		return data;
	}
	
	// Copy Array
	private String[]copyArray(String[]source, int dataLength){
		String[]result = new String[dataLength];
		for(int index = 0; index < dataLength; index++)
			result[index] = source[index];
		return result;
	}
	
	private String[] randomizedStringArrayOrder(String[] anArray) {
		for(int itemsRemaining = anArray.length; itemsRemaining > 0; itemsRemaining--) {
			int anIndex = (int) Math.random() * itemsRemaining;
			String itemAtAnIndex = anArray[anIndex];
			anArray[anIndex] = anArray[anArray.length - 1];
			anArray[anArray.length - 1] = itemAtAnIndex;
		}
		return anArray;
	}
	
	private void swap(String[]puzzle, int position) {
		String thatWasAtLastPosition = puzzle[puzzle.length - 1];
		String thatWillBeNewLastPosition = puzzle[position];
		puzzle[puzzle.length - 1] = thatWillBeNewLastPosition;
		puzzle[position] = thatWasAtLastPosition;
	}
	
	public void playTheGame(String[]neededOrder, String[]randomOrder) {
		for(int index=0; index<neededOrder.length; index++) {
			while(randomOrder[index].compareTo(neededOrder[index])!=0) {
				Scanner scanner = new Scanner(System.in);
				printRandomArray(randomOrder);
				System.out.println("Enter a line number to swap: ");
				int posNumber = scanner.nextInt();
				swap(randomOrder,posNumber);
			}
		}
	}
	
	public void printRandomArray(String[]randomArray) {
		
		for(int index = 0; index < randomArray.length; index++) {
			System.out.println(index + "\t\t" + randomArray[index]);
		}
	}
	
	
	public String toString() {
		String result = "";
		for(int index = 0; index < linesInOriginalOrder.length; index++) {
			result+=index + "\t\t" + linesInOriginalOrder[index] + "\n";
		}
		return result;
	}// toString
}
