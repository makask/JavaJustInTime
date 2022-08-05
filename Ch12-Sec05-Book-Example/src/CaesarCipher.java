/**
 * This class implements a Caesar cipher with a fixed shift
 * specified per object at construction time. Cipher objects can
 * then translate a String or a single character as required.
 * 
 * @author John Lathams
 */
public class CaesarCipher {
	
	// The shift value for the cipher. This must be 0..25
	private final int cipherShift;
	
	/**
	 * Construct a cipher with the given shift.
	 * Any value outside the range 0 to 25 is converted using modulo 26.
	 * 
	 * @param requiredCipherShift The shift to be used for this cipher.
	 */
	public CaesarCipher(int requiredCipherShift) {
		cipherShift = (requiredCipherShift % 26 + 26) % 26;
	}// CaesarCipher
	
	/**
	 * Yields the cipher shift of this cipher.
	 * 
	 * @return The shift used for this cipher.
	 */
	public int getCipherShift() {
		return cipherShift;
	}// getCipherShift
	
	/**
	 * Construct a new CaesarCipher with a cipher shift which is one
	 * greater (modulo 26) than that used for this cipher.
	 * 
	 * @return The new CaesarCipher
	 */
	public CaesarCipher incrementShift() {
		return new CaesarCipher(cipherShift + 1);
	}// incrementShift
	
	/**
	 * Constructs a new CaesarCipher with a cipher shift which is one
	 * less (modulo 26) than that used for this cipher.
	 * 
	 * @return The new CaesarCipher
	 */
	public CaesarCipher decrementShift() {
		return new CaesarCipher(cipherShift - 1);
	}// decrementShift
	
	/**
	 * Translate a string.
	 * 
	 * @param message The string to be translated.
	 * @return The translated message.
	 */
	public String translate(String message) {
		String result = "";
		for(int index = 0; index < message.length();index++)
			result += translate(message.charAt(index));
		return result;
	}// translate
	
	/**
	 * Translate a single character.
	 * If it is a letter it is shifted within its alphabet.
	 * (i.e. upper or lower case).
	 * If it is not a letter, it is returned unchanged.
	 * 
	 * @param aChar The character to be translated.
	 * @return The translated character
	 */
	public char translate(char aChar) {
		if(aChar >= 'A' && aChar <= 'Z') {
			int letterNo = (int)aChar - (int)'A';
			letterNo = (letterNo + cipherShift) % 26;
			return (char)(letterNo + (int)'A');
		}// if
		else if(aChar >= 'a' && aChar <= 'z') {
			int letterNo = (int)aChar - (int)'a';
			letterNo = (letterNo + cipherShift) % 26;
			return (char)(letterNo + (int)'a');
		}// else if
		else
			return aChar;
	}// translate
	
}// class CaesarCipher
