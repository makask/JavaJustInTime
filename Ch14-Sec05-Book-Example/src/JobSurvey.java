import java.io.File;
import java.util.Scanner;
/* Program to report jobs and their salaries.
 * Each command line argument is the name of a text file containing:
 * 	 The first line is a name or description of the jobs.
 * 	 Subsequent lines describe one job, in the format:
 * 	   Employer (including spaces but not tabs) <TAB> salary
 *  Output is a report for each file containing:
 *     Name or description of the jobs, average salary
 *     Job deails in name order and again in salary order.
 */
public class JobSurvey {
	
	public static void main(String[] args) throws Exception {
		
		for(String filename : args) {
			// Programmers
			//JobList jobList = new JobList(new Scanner(new File("E:/EclipseWorkspace/JavaJustInTime2021/Ch14-Sec05-Book-Example/src/programmers.txt")));
			// Testers
			JobList jobList = new JobList(new Scanner(new File("E:/EclipseWorkspace/JavaJustInTime2021/Ch14-Sec05-Book-Example/src/testers.txt")));
			//JobList jobList = new JobList(new Scanner(new File("E:/testers.txt")));
			System.out.println(jobList);
			System.out.println();
		}// for
		
	}// main

}// class JobSurvey

