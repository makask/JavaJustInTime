
public class RomanNumber {
	
	private int decimalNumber;
	private String romanNumber;

	public RomanNumber(int requiredDecimalNumber) {
		decimalNumber = requiredDecimalNumber;
	}
	
	public RomanNumber(String requiredRomanNumber) {
		romanNumber = requiredRomanNumber;
	}
	
	public int getDecimalNumber() {
		return decimalNumber;
	}
	
	public String getRomanNumber() {
		return romanNumber;
	}
	
	public static int processDecimal(int decimal, int lastNumber, int lastDecimal){
		if(lastNumber>decimal)
			return 	lastDecimal - decimal;
		else
			return lastDecimal + decimal;
	}//processDecimal
	
	public int romanToDecimal(String requiredRoman){
		int decimal = 0;
		int lastNumber = 0;
		String romanNumeral = requiredRoman.toUpperCase();
		for (int index = romanNumeral.length() - 1; index >= 0; index--) {
			
			char convertToDecimal = requiredRoman.charAt(index);
			switch(convertToDecimal){
				case 'M': 
					decimal = processDecimal(1000, lastNumber, decimal);
					lastNumber = 1000;
					break;
				case 'D':
					decimal = processDecimal(500, lastNumber, decimal);
					lastNumber = 500;
					break;
				case 'C':
					decimal = processDecimal(100, lastNumber, decimal);
					lastNumber = 100;
					break;
				case 'L':
					decimal = processDecimal(50, lastNumber, decimal);
					lastNumber = 50;
					break;
				case 'X':
					decimal = processDecimal(10, lastNumber, decimal);
					lastNumber = 10;
					break;
				case 'V':
					decimal = processDecimal(5, lastNumber, decimal);
					lastNumber = 5;
					break;
				case 'I':
					decimal = processDecimal(1, lastNumber, decimal);
					lastNumber = 1;
					break;
			}//switch
			
		}//for
		return decimal;
	}//romanToDecimal
	
	public String decimalToRoman(int number) {
		String result = "";
		while(number>=1000) {
			number-=1000;
			result+='M';
		}
		while(number>=900) {
			number-=900;
			result+='C' + 'M';
		}
		while(number>=500) {
			number-=500;
			result+='D';
		}
		while(number>=400) {
			number-=400;
			result+='C'+'D';
		}
		while(number>=100) {
			number-=100;
			result+='C';
		}
		while (number >= 90){
			number-=90;
			result+= 'X' + 'C';
		}
		while (number >= 50){
			number-=50;
			result+= 'L';
		}
		while (number >= 40){
			number-=40;
			result+= 'X' + 'L';
		}
		while (number >= 10){
			number-=10;
			result+= 'X';
		}
		while (number >= 9){
			number-=9;
			result+= 'I'+'X';
		}
		while (number >= 5){
			number-=5;
			result+= 'V';
		}
		while (number >= 4){
			number-=4;
			result+= 'I' + 'V';
		}
		while (number >= 1){
			number-=1;
			result+= 'I';
		}
		return result;
	}
}
