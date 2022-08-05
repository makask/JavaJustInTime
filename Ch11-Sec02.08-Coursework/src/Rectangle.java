
public class Rectangle {
	
	private Point diag1End1;
	private Point diag1End2;
	
	public Rectangle(Point diag1End1, Point diag1End2) {
		this.diag1End1 = diag1End1;
		this.diag1End2 = diag1End2;
	}
	
	public Point c() {
		return new Point(diag1End1.getX(), diag1End2.getY());
	}
	
	public Point d() {
		return new Point(diag1End2.getX(), diag1End1.getY());
	}
	
	public Rectangle shift(double xShift, double yShift){
		Point shiftDiag1End1 = new Point(diag1End1.getX() + xShift, diag1End1.getY() + yShift);
		Point shiftDiag1End2 = new Point(diag1End2.getX() + xShift, diag1End2.getY() + yShift);
		Rectangle shiftedRectangle = new Rectangle(shiftDiag1End1, shiftDiag1End2);
		return shiftedRectangle;
	}//shift
	
	public String toString() {
		return "Rectangle(" + diag1End1 + "," + d() + "," + diag1End2 + "," + c() + ")";
	}
	
	//Rectangle area = Width * Length
	public double area(){
		return diag1End1.getDistance(c()) * diag1End1.getDistance(d());
	}//area
		
	//Rectangle perimeter = 2 * (Width + Length)
	public double perimeter(){
		return 2 * (diag1End1.getDistance(c()) + diag1End1.getDistance(d()));
	}//perimeter
}
