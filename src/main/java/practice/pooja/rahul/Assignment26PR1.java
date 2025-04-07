/*Assignment-26 : 24th May'2023

Program 1: On user defined input print sum of all digits of each word.
input : He3ll2o T4ec4hnoc2redi3ts let23s do i22t.
output : He3ll2o -> 5
         T4ec4hnoc2redi3ts -> 13
         let23s -> 5
         do -> 0
 	     i22t -> 4	 

note : use scanner.nextLine();*/

package practice.pooja.rahul;

import java.util.Scanner;

public class Assignment26PR1 {

	void getSumOfDigits(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println(input + " ==> " + sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the multi word alphanumeric string");
		String str = scanner.nextLine();
		String[] input = str.split(" ");
		Assignment26PR1 assignment26pr1 = new Assignment26PR1();
		for (int index = 0; index < input.length; index++) {
			assignment26pr1.getSumOfDigits(input[index]);
		}
		scanner.close();
	}
}