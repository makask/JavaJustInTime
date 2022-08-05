
public class FieldPerimeter {
	public static void main(String[]args) {
		int length = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);
		int perimeter = length + length + width + width;
		System.out.println("Lenght of the field is: " + length
				+ ", width of the field is: " + width + "."
				+ " The lenght of fence needed to enclose the field: "
				+ perimeter + ".");
	}
}
