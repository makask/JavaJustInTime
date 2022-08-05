import java.util.Scanner;
/* Program to analyse Job information supplied by the user. Each Job comprises 
 * a firm name and their typical salary. Output is mean salary and ascending sorted kist of jobs. 
 * There must be at least one job.
 */
public class JobAnalysis {

	public static void main(String[] args) {
		
		// A scanner for getting data from the user. 
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Enter the number of jobs: ");
		int noOfJobs = inputScanner.nextInt();
		// Skip past the end of that line.
		inputScanner.nextLine();
		
		// We keep the jobs in an array.
		Job[]jobs = new Job[noOfJobs];
		
		// Read the data in pairs,
		// build Job objects and store them in jobs array.
		for(int jobCount = 1; jobCount <= noOfJobs; jobCount++) {
			System.out.print("Enter the name of employer " + jobCount + ": ");
			String employer = inputScanner.nextLine();
			System.out.print("Enter the salary for '" + employer + "': ");
			int salary = inputScanner.nextInt();
			// Skip past the end of that line.
			inputScanner.nextLine();
			jobs[jobCount-1] = new Job(employer, salary);
		}// for
		
		// Now compute the sum of the salaries.
		int sumOfSalaries = 0;
		for(Job job : jobs)
			sumOfSalaries+=job.getSalary();
		
		// Compute the mean, which is a double, not an integer.
		double meanSalary = sumOfSalaries / (double) noOfJobs;
		
		// But we also want to round it to simplify the results.
		int meanSalaryRounded = (int)Math.round(meanSalary);
		
		// Sort the jobs by salary into ascending order.
		sort(jobs);
		
		// Produce the results
		System.out.println();
		System.out.println("The mean salary is:\t" + meanSalary);
		System.out.println("Which rounds to:\t" + meanSalaryRounded);
		System.out.println();
		
		// Output each job.
		for(Job job: jobs) {
			int differenceFromMean = job.getSalary() - meanSalaryRounded;
			String comparisonToMean = differenceFromMean == 0
					? "zero difference from"
					: (differenceFromMean < 0
					 ? "less than" : "greater than");
			System.out.printf("%s, which is %5d %s the mean%n",
					job, Math.abs(differenceFromMean), comparisonToMean);
		}// for
		
	}// main
	
	// Sort the given array of Jobs using compareTo on the Job objects.
	private static void sort(Job[]anArray) {
		
		// Each pass of the sort reduces unsortedLength by one.
		int unsortedLength = anArray.length;
		// If no change is made on a pass, the main loop can stop.
		boolean changedOnThisPass;
		do {
			changedOnThisPass = false;
			for(int pairLeftIndex = 0; pairLeftIndex < unsortedLength - 1; pairLeftIndex++) 
				if(anArray[pairLeftIndex].compareTo(anArray[pairLeftIndex + 1]) > 0) {
					Job thatWasAtPairLeftIndex = anArray[pairLeftIndex];
					anArray[pairLeftIndex] = anArray[pairLeftIndex + 1];
					anArray[pairLeftIndex + 1] = thatWasAtPairLeftIndex;
					changedOnThisPass = true;
				} // if
				unsortedLength--;
			
		}while(changedOnThisPass);
	}// sort
	
}// class JobAnalysis
