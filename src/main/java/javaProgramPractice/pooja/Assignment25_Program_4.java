/*WAP to return the maximum length palindrom String.
input : {"technocredits", "naman", "abcdcba", "techno"}
output : abcdcba

*/
package javaProgramPractice.pooja;

import java.util.Arrays;

public class Assignment25_Program_4 {
	
	int getMaxLengthPalindrome(String[] input) {
		int maxLength = 0;
		String maxString = "";
		
		for(int index=0; index<input.length; index++) {
			if(PalindromeString.isStringPalindrome(input[index])) {
				if(maxLength < input[index].length()) {
					maxLength = input[index].length();
					maxString = input[index];
				}
			}
		}
		System.out.println("Maximum length Palindrome string in given list is : " + maxString + "\twith Length --->" + maxLength);
		return maxLength;
	}
	
	public static void main(String[] args) {
		String[] input = {"technocredits", "naman", "abcdcba", "techno"};
		System.out.println("Input string list : " + Arrays.toString(input));
		new Assignment25_Program_4().getMaxLengthPalindrome(input);
	}
}
