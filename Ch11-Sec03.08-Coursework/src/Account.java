
public class Account {
	
	private final String nameOfTheServiceProvider;
	// balance in whole pence 
	private int currentBalance = 0;
	
	// Constructor
	public Account(String requiredNameOfTheServiceProvider) {
		nameOfTheServiceProvider = requiredNameOfTheServiceProvider;
	}
	
	public void makeCall(int desiredAmount) {
		if(desiredAmount > currentBalance)
			desiredAmount = currentBalance;
		currentBalance-=desiredAmount;
	}	
	
	public int getCalledMinutes(int desiredAmount) {
		if(desiredAmount > currentBalance)
			desiredAmount = currentBalance;
		return desiredAmount;
	}
	
	// Add funds to your account
	public void increaseBalance(int amount) {
		currentBalance+=(amount * 100);
	}
	
	public String getNameOfTheServiceProvider() {
		return nameOfTheServiceProvider;
	}
	
	// String representation of Account class
	public String toString() {
		return "Account(" + nameOfTheServiceProvider + "," + currentBalance + ")"; 
	}
}
