/*WAP to verify given string is anagram or not without Array's sort method.
input : LISTEN
        SILENT
output : Given String is anagram.
		 
input : HEERT
        EARTH
output : not an anagram String.

*/
package pooja;

import java.util.Scanner;

public class Assignment31_Program_2 {
	
	boolean isStringAnagram(String input1, String input2) {
		boolean flagAnagram = true;
		
		if(input1.length() != input2.length()) {
			return flagAnagram = false;
		} else {
			while(input1.length()>0) {
				char ch = input1.charAt(0);
				input1 = input1.replace(Character.toString(ch),"");
				input2 = input2.replace(Character.toString(ch),"");
				if(input1.length() != input2.length()){
					flagAnagram = false;
					break;
				} 		
			}
		}
		return flagAnagram;
	}
	
	void display(String input1, String input2) {
		if(isStringAnagram(input1, input2)) 
			System.out.println("Given Strings are anagram");
		else 
			System.out.println("Given Strings are not anagram");
		}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String : ");
		String input1 = scanner.nextLine();
		System.out.println("Enter Second String : ");
		String input2 = scanner.nextLine();
		new Assignment31_Program_2().display(input1, input2);
		scanner.close();
	}

}
