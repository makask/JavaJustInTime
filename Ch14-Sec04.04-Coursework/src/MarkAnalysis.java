import java.util.Scanner;
public class MarkAnalysis {
	
	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int noOfStudents = inputScanner.nextInt();
		inputScanner.nextLine();
		
		Student[]students = new Student[noOfStudents];
		
		// Enter students
		for(int index = 1; index <= noOfStudents; index++) {
			System.out.print("Enter the name of student " + index + ":");
			String studentName = inputScanner.nextLine();
			System.out.print("Enter the mark for '" + studentName + "':");
			int studentMark = inputScanner.nextInt();
			inputScanner.nextLine();
			students[index-1] = new Student(studentName, studentMark);
		}
		
		int sumOfMarks = 0;
		for(Student student : students)
			sumOfMarks+=student.getMark();
			
		// Compute the mean, which is a double, not an integer.
		double meanMark = sumOfMarks / (double)noOfStudents;
		
		// Calculate minimum mark:
		int minimum = students[0].getMark();
		for(int index = 1; index < students.length; index++) {
			if(students[index].getMark() < minimum)
				minimum = students[index].getMark();
		}
		
		// Calculate maximum mark: 
		int maximum = students[0].getMark();
		for(int index = 1; index < students.length; index++) {
			if(students[index].getMark() > maximum)
				maximum = students[index].getMark();
		}
		
		sort(students);
		
		// Produce the results.
		System.out.println("The mean mark is:\t" + meanMark);
		System.out.println("The minimum mark is:\t" + minimum);
		System.out.println("The maximum mark is:\t" + maximum);
		System.out.println();
		
		System.out.println("Person and Score | difference from mean");
		for(int index = 0; index < noOfStudents; index++) {
			double differenceFromMean = students[index].getMark() - meanMark;
			//System.out.printf("%6d | %5d | %6.2f%n", index + 1, students[index], differenceFromMean);
			System.out.printf("%-10s got%3d|%6.2f%n", students[index].getName(),students[index].getMark(), differenceFromMean);
		}// for
			
			
	}
	
	// Sort a given array of int into ascending order.
		private static void sort(Student[]anArray) {
			int unsortedLength = anArray.length;
			boolean changedOnThisPass;
			do {
				changedOnThisPass = false;
				for(int pairLeftIndex = 0; pairLeftIndex < unsortedLength - 1; pairLeftIndex++) 
					if(anArray[pairLeftIndex].compareTo(anArray[pairLeftIndex+1]) > 0) {
						Student thatWasAtPairLeftIndex = anArray[pairLeftIndex];
						anArray[pairLeftIndex] = anArray[pairLeftIndex + 1];
						anArray[pairLeftIndex + 1] = thatWasAtPairLeftIndex;
						changedOnThisPass = true;
					}
				unsortedLength--;
			}while(changedOnThisPass);
		}// sort

}
