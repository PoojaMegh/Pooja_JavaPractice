/*WAP to return substring between first and last non repetative character from user defined string [use scanner class]
NOTE : Exclude first and last non repetative character from subString.

input : technocredits
output : nocredit
*/

package practice.pooja;

import java.util.Scanner;

public class Assignment21_Program_2 {
	
	char ch1, ch2;
	
	void subString(String input) {
		for (int index=0; index<input.length(); index++) {
			ch1 = input.charAt(index);
			if(input.indexOf(ch1)==input.lastIndexOf(ch1)) {
				break;
			}
		}
		for (int index=input.length()-1; index>=0; index--) {
			ch2 = input.charAt(index);
			if(input.indexOf(ch2)==input.lastIndexOf(ch2)) {
				break;
			}
		}
		System.out.println("Sub string of given string '" + input + "' excluding first and last non repetative character is : " + input.substring((input.indexOf(ch1))+1,(input.indexOf(ch2))));
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input string : ");
		String input = scanner.next();
		new Assignment21_Program_2().subString(input);
		scanner.close();
	}
}
