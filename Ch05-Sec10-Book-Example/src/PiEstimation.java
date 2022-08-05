
//A program to estimate Pi using Leibniz`s formula. 
//Argument is desired tolerance between successive terms. 
//Reports the estimate, the number of terms
//and the library constant for comparison

public class PiEstimation {
	
	public static void main(String[] args) {
		
		//The tolerance is the minimum difference between successive 
		//terms before we stop estimating.
		//double tolerance = Double.parseDouble(args[0]);
		double tolerance = 0.1;
		
		//The result from our previous estimate, initially 0 for 0 terms. 
		
		double previousEstimate = 0;
		
		//The result from our latest estimate, eventually the final result
		
		double latestEstimate = 4;
		
		//We count the terms, initially 1 for the 4. 
		int termCount = 1;
		
		//The value of the next term denominator , initially 3.
		int nextDenominator = 3;
		
		//The sign of the next term, initially -ve
		int nextNumeratorSign = -1;
		
		//Keep adding terms until change is within tolerance. 
		while(Math.abs(latestEstimate - previousEstimate) > tolerance){
			previousEstimate = latestEstimate;
			latestEstimate += nextNumeratorSign * 4.0 / nextDenominator;
			termCount++;
			nextNumeratorSign *= -1;
			nextDenominator +=2;
		}//while
		
		System.out.println("The estimated value of Pi to tolerance " + tolerance
				          + " is " + latestEstimate);
		System.out.println("The estimate used " + termCount + " terms ");
		System.out.println("The library value of Pi is " + Math.PI);
	}//main

}//class PiEstimation