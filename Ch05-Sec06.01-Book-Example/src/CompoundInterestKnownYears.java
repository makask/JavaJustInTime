
public class CompoundInterestKnownYears {
	public static void main(String[] args) {
		double initialInvestment = 100;
		double interestRate = 12.5;
		int noOfYearsInvested = 5;
		double currentBalance = initialInvestment;
		
		for(int year=1; year <=noOfYearsInvested; year = year + 1) {
			currentBalance = currentBalance + currentBalance * interestRate / 100;
		}
		
		System.out.println(initialInvestment + " invested at interest rate " + interestRate + ".");
		System.out.println("After " + noOfYearsInvested + " years, the balance will be " + currentBalance + ".");
	}
}
