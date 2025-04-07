/*Assignment 25 : Program 5 : WAP to return sum of all the palindrome numbers from given array.
input : {12,121,1331,371}
output : 121+1331*/

package practice.pooja.rahul.copy;

public class Assignment25SumOfPalindromeNumbers {

	int getSumOfPalindromeNumbers(int[] num) {
		int palindromeSum = 0;
		Assignment25PalindromeNumber assignment25PalindromeNumber = new Assignment25PalindromeNumber();

		for (int index = 0; index < num.length; index++) {
			if (assignment25PalindromeNumber.isPalindrome(num[index])) {
				palindromeSum = palindromeSum + num[index];
			}
		}
		return palindromeSum;
	}

	public static void main(String[] args) {
		int[] input = { 12, 121, 1331, 371 };
		Assignment25SumOfPalindromeNumbers assignment25SumOfPalindromeNumbers = new Assignment25SumOfPalindromeNumbers();
		int sum = assignment25SumOfPalindromeNumbers.getSumOfPalindromeNumbers(input);
		System.out.println("Sum of all the palindrome numbers in given array is " + sum);
	}
}