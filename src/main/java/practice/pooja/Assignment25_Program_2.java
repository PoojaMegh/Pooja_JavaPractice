/*WAP to find whether the given number is Palindrome.
input : 12321
output : 12321 is a Palindrome number

input : 123331
output : 12331 is not a Palindrome number
*/
package practice.pooja;

public class Assignment25_Program_2 {
		
	void display(int input) {
		if(PalindromeNumber.isNumPalindrome(input))
			System.out.println(input + " is a Palindrome number.");
		else
			System.out.println(input + " is not a Palindrome number.");
		System.out.println("====================================");
	}

	public static void main(String[] args) {
		new Assignment25_Program_2().display(12321);
		new Assignment25_Program_2().display(123331);
	}
}
