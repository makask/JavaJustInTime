
public class RomanNumberTest {
	
	public static void main(String[] args) {
		
		RomanNumber convertToRoman = new RomanNumber(Integer.parseInt(args[0]));
		RomanNumber convertToDecimal = new RomanNumber("MMXXV");
		
		for(int index = convertToRoman.getDecimalNumber(); index <= Integer.parseInt(args[1]); index++) {
			System.out.println("Roman for " + index + " is " + convertToRoman.decimalToRoman(index));
		}
		
		String number = "MMXXV";
		
		System.out.println((convertToDecimal.romanToDecimal(number)));
	}
	
	

}
