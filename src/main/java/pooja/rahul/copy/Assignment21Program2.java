/*Program 2: 
WAP to return substring between first and last non repetative character from user defined string [use scanner class]
NOTE : Exclude first and last non repetative character from subString.

input : technocredits
output : nocredit*/

package pooja.rahul.copy;

import java.util.Scanner;

public class Assignment21Program2 {

	char firstNonRepetativeCharacter(String str) {
		char ch = str.charAt(0);
		int index = 0;
		for (; index < str.length(); index++) {
			if (str.indexOf(str.charAt(index)) == str.lastIndexOf(str.charAt(index))) {
				ch = str.charAt(index);
				break;
			}
		}
		return ch;
	}

	char lastNonRepetativeCharacter(String str) {
		char ch = str.charAt(0);
		int index = str.length() - 1;
		for (; index >= 0; index--) {
			if (str.indexOf(str.charAt(index)) == str.lastIndexOf(str.charAt(index))) {
				ch = str.charAt(index);
				break;
			}
		}
		return ch;
	}

	String printSubString(String str) {
		char firstNonRepetativeChar = firstNonRepetativeCharacter(str);
		char lastNonRepetativeChar = lastNonRepetativeCharacter(str);
		String subString = str.substring(str.indexOf(firstNonRepetativeChar) + 1, str.indexOf(lastNonRepetativeChar));
		return subString;
	}

	public static void main(String[] args) {
		Assignment21Program2 assignment21Program2 = new Assignment21Program2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string:");
		String input = scanner.next();
		String str = assignment21Program2.printSubString(input);
		System.out.println("The substring between first and last non-repetative character excluding first and last non-repetative character is as below :");
		System.out.println(str);
		scanner.close();
	}
}