
public class DegreeCategory {
	public static void main(String[] args) {
		int studentMark = Integer.parseInt(args[0]);
		if(studentMark>=70)
			System.out.println("Honours, first class");
		else if(studentMark>=60)
			System.out.println("Honours, second class, division one");
		else if(studentMark>=50)
			System.out.println("Honours, second class, division two");
		else if(studentMark>=40)
			System.out.println("Honours, third class");
		else if(studentMark>=32)
			System.out.println("Pass/ordinary degree");
		else if(studentMark<32)
			System.out.println("Fail");
	}
}
