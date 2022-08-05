
public class Phone {
	
	private final String make;
	private final String modelNumber;
	private final Account account;
	
	private int callTime = 0;
	
	public Phone(String requiredMake, String requiredModelNumber, Account requiredAccount) {
		make = requiredMake;
		modelNumber = requiredModelNumber;
		account = requiredAccount;
	}
	
	public String getName() {
		return make + " " + modelNumber;
	}
	
	public void calculateCallTime(int minutes) {
		callTime+=account.getCalledMinutes(minutes);
	}
	
	// Add funds to phone account.
	public void topUp(int amount) {
		account.increaseBalance(amount);
	}
	
	public Account getAccount() {
		return account;
	}
	
	public String toString() {
		return "Phone(" + make + " " + modelNumber + "," + callTime + "," + account + ")";
	}
}
