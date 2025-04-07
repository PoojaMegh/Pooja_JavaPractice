/*WAP to verify given string is anagram or not with Array's sort method.
input : LISTEN
        SILENT
output : Given String is anagram.
		 
input : HEERT
        EARTH
output : not an anagram String.

*/
package practice.arrayMethods;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
	
	void isStringAnagram(String input1, String input2) {
		input1 = input1.toLowerCase();
		input2 = input2.toLowerCase();
		char[] arr1 = input1.toCharArray();
		char[] arr2 = input2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Given Strings are anagram");
		} else {
			System.out.println("Given Strings are not anagram");
		}
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String : ");
		String input1 = scanner.nextLine();
		System.out.println("Enter Second String : ");
		String input2 = scanner.nextLine();
		new AnagramString().isStringAnagram(input1, input2);
		scanner.close();
	}

}
