
public class StudentsCalling {
	
	public static void main(String[] args) {
		
		Student student1 = createStudent("Chatty Charlie");
		Student student2 = createStudent("Norman No Friends");
		Student student3 = createStudent("Popular Penny");
		
		Phone phone1 = new Phone("Snotia", "BIFR", new Account("World@1"));
		Phone phone2 = new Phone("Cyoo", "L8TRON", new Account("4 FRN Touch"));
		Phone phone3 = new Phone("Tysonly", "14U", new Account("Foney Friends"));
		Phone phone4 = new Phone("Simm", "UL8R", new Account("VerTuleTyat"));
		
		makeCall(student1, 300);
		topUp(student2, 20);
		buyPhone(student1,phone1);
		buyPhone(student2, phone2);
		buyPhone(student3, phone3);
		topUp(student1, 10);
		topUp(student2, 20);
		topUp(student3, 30);
		makeCall(student1, 300);
		makeCall(student1,1200);
		makeCall(student1,10);
		makeCall(student2, 10);
		makeCall(student3,65);
		makeCall(student3,115);
		makeCall(student3,488);
		makeCall(student3,302);
		makeCall(student3,510);
		makeCall(student3,250);
		discardPhone(student3,phone4);
		discardPhone(student3);
	}
	
	private static Student createStudent(String name) {
		Student student = new Student(name);
		System.out.println("Creating student: " + student.getName());
		System.out.println("Result:");
		System.out.println(student);
		System.out.println();
		return student;
	}
	
	// Helper method to make a phone call.
	private static void makeCall(Student student, int durationInSeconds) {
		if(student.getPhone()==null) {
			System.out.println("This next call has no effect, as has no phone!");
			System.out.println(student);
			System.out.println("is making a call for desired " + durationInSeconds + " seconds");
			System.out.println("Result:");
			System.out.println(student);
			System.out.println();
		}else {
			System.out.println(student);
			System.out.println("is making a call for desired " + durationInSeconds + " seconds");
			student.makeCall(durationInSeconds);
			System.out.println("Result:");
			System.out.println(student);
			System.out.println();
		} 
	}
	
	// Helper metod to buy a new phone 
	private static void buyPhone(Student student, Phone phone) {
		System.out.println(student);
		System.out.println("is buying phone " + phone.getName());
		System.out.println("with account " + phone.getAccount().getNameOfTheServiceProvider());
		student.buyPhone(phone);
		System.out.println("Result:");
		System.out.println(student);
		System.out.println();
	}
	
	// Helper method to top up with a whole number of pounds 
	private static void topUp(Student student, int desiredAmount) {
		if(student.getPhone() == null) {
			System.out.println("This next top up has no effect, as has no phone!");
			System.out.println(student);
			System.out.println("is topping up by: " + desiredAmount);
			System.out.println("Result: ");
			System.out.println(student);
			System.out.println();
		}else {
			System.out.println(student);
			System.out.println("is topping up by " + desiredAmount);
			student.topUp(desiredAmount);
			System.out.println("Result:");
			System.out.println(student);
			System.out.println();
		}
			
	}
	// Helper method to discard current phone and buy new one.
	private static void discardPhone(Student student, Phone phone) {
		System.out.println(student);
		System.out.println("is buying phone " + phone.getName());
		System.out.println("with account " + phone.getAccount().getNameOfTheServiceProvider());
		student.discardPhone();
		student.buyPhone(phone);
		System.out.println("Result: ");
		System.out.println(student);
		System.out.println();
	}
	
	// Helper method to discard current phone without buying a new one. 
	private static void discardPhone(Student student) {
		System.out.println(student);
		System.out.println("is discarding phone " + student.getPhone().getName());
		System.out.println("with account " + student.getPhone().getAccount().getNameOfTheServiceProvider());
		student.discardPhone();
		System.out.println("Result:");
		System.out.println(student);
		System.out.println();
	}
}
