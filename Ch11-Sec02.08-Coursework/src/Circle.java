
public class Circle {
	
	private Point centre;
	private double radius;
	
	// Constructor
	public Circle(Point centre, double radius) {
		this.centre = centre;
		this.radius = radius;
	}
	
	// Shift x and y coordinates
	public Circle shift(double xShift, double yShift) {
		Point shiftedCentre = new Point(centre.getX() + xShift, centre.getY() + yShift);
		return new Circle(shiftedCentre, radius);
	}
	
	// Calculate an area of a circle, A = PI * (r * r)
	public double area() {
		return Math.PI * Math.pow(radius,2);
	}
	
	// Calculate perimeter of a circle, C = 2 * PI * r
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public String toString() {
		return "Circle(" + centre + "," + radius + ")";
	}
}
