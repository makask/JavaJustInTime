public class AddQuadPoly {
	
	public static void main(String[] args) {
		
		QuadPoly poly1 = new QuadPoly(6,4,2);
		QuadPoly poly2 = new QuadPoly(3,2,1);
		// Add
		QuadPoly poly3 = poly1.add(poly2);
		
		System.out.println("Polynomial:\t" + poly1);
		System.out.println("added to:\t" + poly2);
		System.out.println("results in:\t" + poly3);
		
		// Subtract
		QuadPoly poly4 = poly1.subtract(poly2);
		
		System.out.println("Polynomial:\t" + poly1);
		System.out.println("subtracted from:\t" + poly2);
		System.out.println("results in:\t" + poly4);
		
		
	}
	
}