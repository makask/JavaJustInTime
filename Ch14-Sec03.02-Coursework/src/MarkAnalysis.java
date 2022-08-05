import java.util.Scanner;

public class MarkAnalysis {
	
	public static void main(String[] args) {
		
		// A scanner for getting data from the user.
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Enter the number of marks: ");
		int numberOfMarks = inputScanner.nextInt();
		
		// Marks are ints, stored in an array.
		int[]studentMarks = new int[numberOfMarks];
		
		// Obtain the student marks from the input. 
		for(int index = 0; index < numberOfMarks; index++ ) {
			System.out.println("Enter mark #" + (index + 1) + ":");
			int nextMark = inputScanner.nextInt();
			//If entered mark is less than 0 program stops.
			if(nextMark < 0) {
				System.out.println("Mark must be grater than or equal to 0");
				break;
			}else {
				studentMarks[index] = nextMark;
			}// else
		}// for
		
		// Now we compute the sum of the marks.
		int sumOfMarks = 0;
		for(int mark : studentMarks)
			sumOfMarks+=mark;
		
		// Compute the mean, which is a double, not an integer.
		double meanMark = sumOfMarks / (double)numberOfMarks;
		
		// Get minimum mark: 
		int minimumMark = studentMarks[0];
		for(int index = 1; index < numberOfMarks; index++) {
			if(studentMarks[index]<minimumMark)
				minimumMark = studentMarks[index];
		}// for
		
		// Get maximum mark: 
		int maximumMark = studentMarks[0];
		for(int index = 1; index < numberOfMarks; index++) {
			if(studentMarks[index] > maximumMark)
				maximumMark = studentMarks[index];
		}
		
		sort(studentMarks);
		
		// Produce the results.
		System.out.println("The mean mark is:\t" + meanMark);
		System.out.println("The minimum mark is:\t" + minimumMark);
		System.out.println("The maximum mark is:\t" + maximumMark);
		System.out.println();
		
		System.out.println("Person | Score | difference from mean");
		for(int index = 0; index < numberOfMarks; index++) {
			double differenceFromMean = studentMarks[index] - meanMark;
			System.out.printf("%6d | %5d | %6.2f%n", index + 1, studentMarks[index], differenceFromMean);
		}// for
	}// main
	
	// Sort a given array of int into ascending order.
	private static void sort(int[]studentMarks) {
		int unsortedLength = studentMarks.length;
		boolean changedOnThisPass;
		do {
			changedOnThisPass = false;
			for(int pairLeftIndex = 0; pairLeftIndex < unsortedLength - 1; pairLeftIndex++) 
				if(studentMarks[pairLeftIndex]>studentMarks[pairLeftIndex+1]) {
					int thatWasAtPairLeftIndex = studentMarks[pairLeftIndex];
					studentMarks[pairLeftIndex] = studentMarks[pairLeftIndex + 1];
					studentMarks[pairLeftIndex + 1] = thatWasAtPairLeftIndex;
					changedOnThisPass = true;
				}
			unsortedLength--;
		}while(changedOnThisPass);
	}// sort
	
}// class MarkAnalysis