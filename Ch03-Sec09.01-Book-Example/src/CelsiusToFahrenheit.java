
public class CelsiusToFahrenheit {
	public static void main(String[] args) {
		double celsiusValue = Double.parseDouble(args[0]);
		double fahrenheitValue = celsiusValue * 9 / 5 + 32;
		System.out.println("Temperature " + celsiusValue + " Celsius"
				+ " in Fahrenheit is " + fahrenheitValue + ".");
	}
}
