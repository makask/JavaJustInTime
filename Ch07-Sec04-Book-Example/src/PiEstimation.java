
//A program to estimate Pi using Leibniz`s formula.
//Argument is desired tolerance between successive terms.
//Reports the estimate , the number of terms
//and the library constant for comparison.
//
// Pi = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + 4/13...
//
public class PiEstimation {
	
	public static void main(String[] args) {
		
	// The tolerance is the minimum difference between successive 
	// terms before we stop estimating.
	double tolerance = Double.parseDouble(args[0]);
	
	// The value of the latest term.
	double latestTerm;
	
	// The result of our latest estimate, eventually the final result.
	double latestEstimate = 4;
	
	//We count the terms , initially 1 for the 4.
	int termCount = 1;
	
	//The value of the next term denominator, initially 3.
	int nextDenominator = 3;
	
	//The sign of the next term , initially -ve.
	int nextNumeratorSign = -1;
	
	//Keep adding terms until latest term is within tolerance
	do{
		latestTerm = nextNumeratorSign * 4 / nextDenominator;
		latestEstimate += latestTerm;
		termCount++;
		nextNumeratorSign *= -1;
		nextDenominator += 2;
	}while(Math.abs(latestTerm)>tolerance);
		System.out.println("The estimated value of Pi to tolerance " + tolerance
				          + " is " + latestEstimate);
		System.out.println("The estimate used " + termCount + " terms");
		System.out.println("The library value of Pi is " + Math.PI);
	
	}//main
	

}//class PiEstimation
