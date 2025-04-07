/*
How to check if two String are Anagram
	i/p: keep i/p: peek  o/p: anagram
	i/p: hat   i/p: cat     o/p: not an anagram
*/

package practice.pooja;

import java.util.Arrays;

public class ProgrammingExam_Program3 {

	void isStringAnagram(String input1, String input2) {
		char[] arr1 = input1.toCharArray();
		char[] arr2 = input2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("\n'" + input1 + "' and '" + input2 + "' - Given Strings are anagram");
		} else {
			System.out.println("\n'" + input1 + "' and '" + input2 + "' - Given Strings are not anagram");
		}
		
	}

	public static void main(String[] args) {
		new ProgrammingExam_Program3().isStringAnagram("keep", "peek");
		new ProgrammingExam_Program3().isStringAnagram("hat", "cat");
	}
}
