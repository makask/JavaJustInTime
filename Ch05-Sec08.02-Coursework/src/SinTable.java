
public class SinTable {
	public static void main(String[] args) {
		System.out.println("----------------------------------------");
		System.out.println("| Sin table from 0 to 90 in steps of 10");
		System.out.println("----------------------------------------");
		
		for (int i = 0; i <= 90; i=i+10) {
			System.out.println("| sin(" + i + ") = " + Math.sin(Math.toRadians(i)));
		}
		System.out.println("----------------------------------------");
	}
}
