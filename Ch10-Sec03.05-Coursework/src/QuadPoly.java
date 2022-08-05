
public class QuadPoly {
	
	public double a1, a2, a3;
	
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
}
