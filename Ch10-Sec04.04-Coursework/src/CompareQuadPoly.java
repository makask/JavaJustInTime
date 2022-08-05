public class CompareQuadPoly {
	
	public static void main(String[] args) {
		
		QuadPoly poly1 = new QuadPoly(3,2,1);
		QuadPoly poly2 = new QuadPoly(1,2,3);
		
		if(poly1.lessThan(poly2)) {
			System.out.println("The polynomial:\t" + poly1.toString());
			System.out.println("is smaller than:\t" + poly2.toString());
		} else if(poly2.lessThan(poly1)) {
			System.out.println("The polynomial:\t" + poly1.toString());
			System.out.println("is greater than:\t" + poly2.toString());
		} else if(poly1.equals(poly2)) {
			System.out.println("The polynomial:\t" + poly1.toString());
			System.out.println("is the same as:\t" + poly2.toString());
		}
			
	}
}
