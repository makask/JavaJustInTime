
public class RoundPennies {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int pound = (n + 50) / 100;
		System.out.println(n + " cents = " + pound + " pound(s)");
	}
}
