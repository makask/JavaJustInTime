
public class PrintTriangleMirror {
	public static void main(String[] args) {
		int height = 5;
		
		for(int column = 1; column<=height; column++) {
			for(int row=height; row >= column; row--) {
				System.out.print("{_}");
			}
			System.out.println();
		}
	}
}
