
public class PrintHoledRectangle{
	
	public static void main(String[] args) {
		
		//int height = Integer.parseInt(args[0])/2*2+1;
		//int width = Integer.parseInt(args[1])/2*2+1;
		
		int height = 5;
		int width = 5;
		int counter = 0;
		int centerCellPosition = ((width * height) / 2) + 1;
		
		for(int row = 1; row<=height; row++) {
			for(int column = 1; column <= width; column++) {
				counter++;
				if(counter!=centerCellPosition) {
					System.out.print("[_]");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
	}
}