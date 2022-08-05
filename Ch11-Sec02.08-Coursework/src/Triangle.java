
public class Triangle {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	// Constructor
	public Triangle(Point pointA, Point pointB, Point pointC) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}// constructor
	
	public Triangle shift(double x, double y) {
		Point aShifted = new Point(pointA.getX() + x, pointA.getY() + y);
		Point bShifted =  new Point(pointB.getX() + x, pointB.getY() + y );
		Point cShifted = new Point(pointC.getX() + x, pointC.getY() + y);
		return new Triangle(aShifted, bShifted, cShifted);
	}
	
	// Calculate are of a triangle.
	public double area() {
		double sideA = pointA.getDistance(pointB);
		double sideB = pointB.getDistance(pointC);
		double sideC = pointC.getDistance(pointA);
		// 1st calculate semi perimeter s = (a + b + c)/2
		double semiPerimeter = (sideA + sideB + sideC)/2;
		// area = Math.sqrt(s * (s-a) * (s-b) * (s-c))
		return Math.sqrt(semiPerimeter * (semiPerimeter-sideA) * (semiPerimeter-sideB) * (semiPerimeter-sideC));
	}
	
	// Calculate perimeter of a triangle. P = a + b + c
	public double perimeter() {
		double sideA = pointA.getDistance(pointB);
		double sideB = pointB.getDistance(pointC);
		double sideC = pointC.getDistance(pointA);
		return sideA + sideB + sideC;
	}
	
	public String toString() {
		return "Triangle(" + pointA + "," + pointB + "," + pointC + ")";
	}

}
