/*Assignment 25 : Program 2 : WAP to find whether the given number is palindrom.
input : 1221
output : 1221 is a palindrom number*/

package pooja.rahul;

public class Assignment25PalindromeNumber {

	boolean isPalindrome(int num) {
		Assignment25ReverseNumber assignment25ReverseNumber = new Assignment25ReverseNumber();
		int totalDigits = assignment25ReverseNumber.getDigitsCount(num) - 1;
		int orgNumber = num;
		double newNumber = 0;
		while (num > 0) {
			int digit = num % 10;
			newNumber = newNumber + digit * Math.pow(10, totalDigits--);
			num = num / 10;
		}
		if (orgNumber == newNumber)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		boolean flag = new Assignment25PalindromeNumber().isPalindrome(1222);
		if (flag)
			System.out.println("Given number is palindrome");
		else
			System.out.println("Given number is not palindrome");
	}
}
