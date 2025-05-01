/*Assigment-27 : 25th May'2023

WAP to return output array by shifting all zeros at the end of the array.
Print output in main method (Arrays.toString(output));

int[] arr = {10,0,0,2,3,0,5,0,7}
output : {10,2,3,5,7,0,0,0,0}*/

package javaProgramPractice.pooja.rahul.copy;

import java.util.Scanner;

public class Assignment27 {

	void rightShiftZeros(int[] input) {
		int[] output = new int[input.length];
		int i = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[i] = input[index];
				i++;
			}
		}

		System.out.println("The output array is");
		for (int j = 0; j < output.length; j++) {
			System.out.print(+output[j]);
		}
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

		Assignment27 assignment27 = new Assignment27();
		assignment27.rightShiftZeros(inputArray);
		scanner.close();
	}
}