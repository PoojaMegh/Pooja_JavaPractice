/*WAP to return sum of all the palindrom numbers from given array.
input : {12,121,1331,371}
output : 121+1331
*/
package practice.pooja;

import java.util.Arrays;

public class Assignment25_Program_5 {
	
	int sumAllPalindromeNum(int[] input) {
		int sum = 0;
		
		for(int index=0; index<input.length; index++) {
			if(PalindromeNumber.isNumPalindrome(input[index])) {
				sum = sum + input[index];
			}
		}
		System.out.println("Sum of all palindrome numbers in given list is : " + sum);
		return sum;
	}
	
	public static void main(String[] args) {
		int[] input = {12,121,1331,371};
		System.out.println("Input number list : " + Arrays.toString(input));
		new Assignment25_Program_5().sumAllPalindromeNum(input);
	}
}
