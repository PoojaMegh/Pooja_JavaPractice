/*	Program 1: On user defined input print sum of all digits of each word.
	input : He3ll2o T4ec4hnoc2redi3ts let23s do i22t.
	output : He3ll2o -> 5
	         T4ec4hnoc2redi3ts -> 13
	         let23s -> 5
	         do -> 0
	 	     i22t -> 4	 
	
note : use scanner.nextLine();
*/
package javaProgramPractice.pooja;

import java.util.Scanner;

public class Assignment26_Program_1 {
	
	int sumOfDigitInWord(String input) {
		int sum = 0;
		
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch) ;
			}
		}
		return sum;
	}
	
	void sumOfDigitsInWordInArray(String input) {
		String word = "";
		String[] inputArray = input.split(" ");
		System.out.println("\nOn user defined input print sum of all digits of each word :\n");
		for(int index=0; index<inputArray.length; index++) {
			word = inputArray[index];
			int sum = sumOfDigitInWord(word);
			System.out.println(word + "--->" + sum);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input : ");
		String input = scanner.nextLine();
		new Assignment26_Program_1().sumOfDigitsInWordInArray(input);
		scanner.close();
	}
}
