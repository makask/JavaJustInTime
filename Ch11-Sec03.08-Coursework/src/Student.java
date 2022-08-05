
public class Student {
	
	private final String name;
	private Phone currentPhone = null;
	
	public Student(String requiredName) {
		name = requiredName;
	}
	
	public Student(String requiredName, Phone requiredPhone) {
		name = requiredName;
		currentPhone = requiredPhone;
	}
	
	
	// Make a call
	public void makeCall(int desiredAmount) {
		currentPhone.calculateCallTime(desiredAmount);
		currentPhone.getAccount().makeCall(desiredAmount);
	}
	
	// Add call time , using whole pounds
	public void topUp(int desiredAmount) {
		currentPhone.topUp(desiredAmount);
	}
	
	// Buy new phone
	public void buyPhone(Phone requiredPhone) {
		currentPhone = requiredPhone;
	}
	
	// Discard current phone
	public void discardPhone() {
		currentPhone = null;
	}
	
	public Phone getPhone() {
		return currentPhone;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Student(" + name + "," + currentPhone + ")";
	}
	
}
