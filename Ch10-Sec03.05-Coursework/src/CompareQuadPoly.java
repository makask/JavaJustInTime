
public class CompareQuadPoly {
	
	public static void main(String[] args) {
		
		QuadPoly poly1 = new QuadPoly(3,2,1);
		QuadPoly poly2 = new QuadPoly(1,2,3);
		
		if(poly1.lessThan(poly2)) {
			System.out.println("The polynomial:\t" + poly1.a1 + "x^2 + " + poly1.a2 + "x + " + poly1.a3);
			System.out.println("is smaller than:\t" + poly2.a1 + "x^2 + " + poly2.a2 + "x + " + poly2.a3);
		} else if(poly2.lessThan(poly1)) {
			System.out.println("The polynomial:\t" + poly1.a1 + "x^2 + " + poly1.a2 + "x + " + poly1.a3);
			System.out.println("is greater than:\t" + poly2.a1 + "x^2 + " + poly2.a2 + "x + " + poly2.a3);
		} else if(poly1.equals(poly2)) {
			System.out.println("The polynomial:\t" + poly1.a1 + "x^2 + " + poly1.a2 + "x + " + poly1.a3);
			System.out.println("is the same as:\t" + poly2.a1 + "x^2 + " + poly2.a2 + "x + " + poly2.a3);
		}
			
	}
}
