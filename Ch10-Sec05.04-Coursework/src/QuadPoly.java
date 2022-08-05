public class QuadPoly {
	
	private double a1, a2, a3;
	
	public QuadPoly(double a1, double a2,double a3) {
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}
	
	public boolean equals(QuadPoly other) {
		return a1 == other.a1 
				&& a2 == other.a2 
				&& a3 == other.a3;
	}
	
	public boolean lessThan(QuadPoly other) {
		return a1 < other.a1 || a1 == other.a1
				&& a2 < other.a2 || a2 == other.a2
				&& a3 < a3;
	}
	
	// Add +
	public QuadPoly add(QuadPoly other) {
		return new QuadPoly(a1 + other.a1, a2 + other.a2, a3 + other.a3);
	}
	
	// Subtract
	public QuadPoly subtract(QuadPoly other) {
		return new QuadPoly(a1 - other.a1, a2 - other.a2, a3 - other.a3);
	}
	
	public String toString() {
		return a1 + "x^2 + " + a2 + "x + " + a3;
	}
}