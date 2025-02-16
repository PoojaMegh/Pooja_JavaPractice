/*Assignment 25 - program 4 : WAP to return the maximum length palindrom String.
input : {"technocredits", "naman", "abcdcba", "techno"}
output : abcdcba*/

package pooja.rahul.copy;

public class Assignment25MaxLengthPalindromeString {

	boolean isPalindromeString(String str) {
		Assignment25PaliondromeString assignment25PaliondromeString = new Assignment25PaliondromeString();
		String reverse = assignment25PaliondromeString.getReverseString(str);
		if (str.equalsIgnoreCase(reverse))
			return true;
		else
			return false;
	}

	String getMaxLengthPalidromeString(String[] str) {
		int maxLength = 0;
		String maxLengthString = "";
		for (int index = 0; index < str.length; index++) {
			if (isPalindromeString(str[index])) {
				if (maxLength < str[index].length()) {
					maxLength = str[index].length();
					maxLengthString = str[index];
				}
			}
		}
		return maxLengthString;
	}

	public static void main(String[] args) {
		String[] input = { "technocredits", "naman", "abcdcba", "techno" };
		Assignment25MaxLengthPalindromeString assignment25MaxLengthPalindromeString = new Assignment25MaxLengthPalindromeString();
		String maxLengthPalindromeString = assignment25MaxLengthPalindromeString.getMaxLengthPalidromeString(input);
		System.out.println("The Maximum length palindrome string from given array is " + maxLengthPalindromeString);
	}
}