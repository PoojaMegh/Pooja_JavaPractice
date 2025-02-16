/*WAP to fulfill following requirements.
	a) method to print ascii of given character.
		input : C
		output : 67
	
	b) method to print character associated with given ascii.
		input : 50
		output : 2
		input : 99
		output : c
	
	c) write a method to print ascii for all upper case character
	d) write a method to print ascii for all lower case characters.
*/

package pooja;

public class Assignment29_Program_2 {
	
	void asciiOfChar(char ch) {
		int ascii = ch;
		System.out.println("Ascii value of given character " + ch + " --> " + ascii );
	}
	
	void charOfAscii(int ascii) {
		char ch = (char) ascii;
		System.out.println("\nCharacter value of given Ascii " + ascii + " --> " + ch );
	}
	
	void asciiOfUpperChar() {
		System.out.println("\nAscii value of all uppercase characters : \n" );
		
		for(char ch = 'A' ; ch <= 'Z' ; ch++) {
			int ascii = ch;
			System.out.println(ch + " --> " + ascii );
		}
	}
	
	void asciiOfLowerChar() {
		System.out.println("\nAscii value of all lowercase characters : \n" );
		
		for(char ch = 'a' ; ch <= 'z' ; ch++) {
			int ascii = ch;
			System.out.println(ch + " --> " + ascii );
		}
	}

	public static void main(String[] args) {
		Assignment29_Program_2 ascii = new Assignment29_Program_2();
		ascii.asciiOfChar('C');
		ascii.charOfAscii(50);
		ascii.charOfAscii(99);
		ascii.asciiOfUpperChar();
		ascii.asciiOfLowerChar();
	}

}
