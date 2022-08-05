
public class AddQuadPoly {
	
	public static void main(String[] args) {
		
		QuadPoly poly1 = new QuadPoly(6,4,2);
		QuadPoly poly2 = new QuadPoly(3,2,1);
		QuadPoly poly3 = new QuadPoly(poly1.coefficient1 + poly2.coefficient1, poly1.coefficient2 + poly2.coefficient2, 
				poly1.coefficient3 + poly2.coefficient3);
		
		System.out.println("Polynomial:\t" + poly1.coefficient1 + "x^2 + " + poly1.coefficient2 + "x + " + poly1.coefficient3);
		System.out.println("added to:\t" + poly2.coefficient1 + "x^2 + " + poly2.coefficient2 + "x + " + poly2.coefficient3);
		System.out.println("results in:\t" + poly3.coefficient1 + "x^2 + "
				+ poly3.coefficient2 + "x + " + poly3.coefficient3);
		
		
	}
	
}
