
public class CompoundInterestKnownTarget {
	
	public static void main(String[] args) {
		double initialInvestment = 100;
		double interestRate = 12.5;
		double targetBalance = 1000;
		int noOfYearsInvested = 0;
		double currentBalance = initialInvestment;
		
		while(currentBalance < targetBalance) {
			currentBalance = currentBalance + currentBalance * interestRate / 100;
			noOfYearsInvested = noOfYearsInvested + 1;
		}
		
		System.out.println(initialInvestment + " invested at interest rate " + interestRate + ".");
		System.out.println("After " + noOfYearsInvested + " years, the balance will be " + currentBalance + ".");
	}
}
