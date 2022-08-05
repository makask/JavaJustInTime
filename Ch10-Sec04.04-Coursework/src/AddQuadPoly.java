public class AddQuadPoly {
	
	public static void main(String[] args) {
		
		QuadPoly poly1 = new QuadPoly(6,4,2);
		QuadPoly poly2 = new QuadPoly(3,2,1);
		QuadPoly poly3 = new QuadPoly(poly1.a1 + poly2.a1, poly1.a2 + poly2.a2, 
				poly1.a3 + poly2.a3);
		
		System.out.println("Polynomial:\t" + poly1.toString());
		System.out.println("added to:\t" + poly2.toString());
		System.out.println("results in:\t" + poly3.toString());
		
		
	}
	
}
