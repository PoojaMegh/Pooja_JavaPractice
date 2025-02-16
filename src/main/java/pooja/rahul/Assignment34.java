/*Assigment-34 : 14th Jun'2023 [Exception Handling]
Take 3 numbers from user, considering user can give any other input apart from number. At that time notify user by saying "Given input is not a number".

input : 10
        Techno
        12Credits
        5
        true
        Hello
        7

output : Array -> [10,5,7]   		

NOTE : write a code in main method.*/

package pooja.rahul;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment34 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[3];
		int index = 0;
		while(index < numbers.length) {
			try {
				System.out.println("Please enter input " + index);
				numbers[index] = scanner.nextInt();
				index++;
			} catch (InputMismatchException ime) {
				System.out.println("Given input is not a number");
				String temp = scanner.nextLine();
				System.out.println(temp);
			}
		}
		scanner.close();
		System.out.print("Output array : { ");
		for (index = 0; index < numbers.length; index++) {
			if (index != numbers.length - 1) {
				System.out.print(numbers[index] + " , ");
			} else {
				System.out.print(numbers[index] + " ");
			}
		}
		System.out.print("}");
		
	}
}