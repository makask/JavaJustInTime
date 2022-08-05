
public class FahrenheitToCelsius {
	public static void main(String[] args) {
		double fahrenheit = Double.parseDouble(args[0]);
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature " + fahrenheit + " Fahrenheit"
				+ " in Celsius is " + celsius + ".");
	}
}

// (Fahrenheit − 32) × 5/9 = 0°C

