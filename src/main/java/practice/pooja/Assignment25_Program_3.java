/*WAP to verify whether given String is Palindrome.

input : Naman
output : naman is a Palindrome string.

input : technot
output : technot is not a Palindrome string.
*/

package practice.pooja;

public class Assignment25_Program_3 {

	
	
	void display(String input) {
		if(PalindromeString.isStringPalindrome(input))
			System.out.println(input + " is a Palindrome word.");
		else
			System.out.println(input + " is not a Palindrome word.");
		System.out.println("==================================");
	}
	
	public static void main(String[] args) {
		new Assignment25_Program_3().display("Naman");
		new Assignment25_Program_3().display("technot");
	}
}
