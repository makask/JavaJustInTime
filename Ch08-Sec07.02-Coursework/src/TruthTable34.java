
public class TruthTable34 {
	
	public static void main(String[] args) {
		
		boolean a = true, b = true, c = true, d = true;
		
		printStraightLine();
		printHeadings();
		printColumnsLine();
		
		for(int aCount = 1; aCount <= 2; aCount++, a = !a) {
			for(int bCount = 1; bCount <= 2; bCount++, b = !b) {
				for(int cCount = 1; cCount <= 2; cCount++, c = !c) {
					for(int dCount = 1; dCount <= 2; dCount++, d = !d) {
						printRow(a,b,c,d);
					}
				}
			}
		}
		printColumnsLine();
	}
	
	private static boolean p1(boolean a, boolean b, boolean c, boolean d) {
		return (((a || b) & c) || ((b || c) && d)) && (a || d);
	}
	
	private static boolean p2(boolean a, boolean b, boolean c, boolean d) {
		return a && c || b && d || c && d;
	}

	private static boolean p3(boolean a, boolean b, boolean c, boolean d) {
		return (b || c) && (c || d) && (a || d);
	}
	
	private static void printStraightLine() {
		System.out.println("_________________________________________________________");
	}
	
	private static void printHeadings() {
		System.out.println("|   a   |   b   |   c   |   d   |  p1   |  p2   |  p3   |");
	}
	
	private static void printColumnsLine() {
		System.out.println("|_______|_______|_______|_______|_______|_______|_______|");
	}
	
	private static void printRow(boolean a, boolean b, boolean c, boolean d) {
		System.out.println("|" + formatRowItem(a) + "|" + formatRowItem(b)
				+ "|" + formatRowItem(c) + "|" + formatRowItem(d)
				+ "|" + formatRowItem(p1(a,b,c,d)) + "|" + formatRowItem(p2(a,b,c,d))
				+ "|" + formatRowItem(p3(a,b,c,d)) + "|");
	}
	
	private static String formatRowItem(boolean rowItem) {
		return rowItem ? " true  " : " false ";
	}
}
