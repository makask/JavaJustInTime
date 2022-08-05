
public class PassFailDistinction {
	public static void main(String[] args) {
		int input = Integer.parseInt(args[0]);
		if(input >= 50)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		if(input >= 70)
			System.out.println("Distinction");
		
	}
}
