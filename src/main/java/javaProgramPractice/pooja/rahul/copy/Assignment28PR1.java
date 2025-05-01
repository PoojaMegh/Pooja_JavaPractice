/*Assigment-28 : 26th May'2023
Program 1: 
Shift all the zeros to left of the array.

int[] arr = {3,0,1,5,0,9,2,5,0,0,1};
output : {0,0,0,0,3,1,5,9,2,5,1}*/

package javaProgramPractice.pooja.rahul.copy;

import java.util.Scanner;

public class Assignment28PR1 {

	void leftShiftZeros(int[] input) {
		int[] output = new int[input.length];
		int i = input.length - 1;
		for (int index = input.length - 1; index >= 0; index--) {
			if (input[index] != 0) {
				output[i] = input[index];
				i--;
			}
		}

		System.out.println("The output array is");
		System.out.print("{ ");
		for (int j = 0; j < output.length; j++) {
			System.out.print(output[j]);
			if (j != output.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to enter in the array? ");
		int length = scanner.nextInt();
		int[] inputArray = new int[length];
		for (int index = 0; index < length; index++) {
			System.out.println("Enter the number at index " + index);
			inputArray[index] = scanner.nextInt();
		}

		Assignment28PR1 assignment28 = new Assignment28PR1();
		assignment28.leftShiftZeros(inputArray);
		scanner.close();
	}

}
