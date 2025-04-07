/*Assigment-28 : 26th May'2023
Program 2 : 
return non zero elements from the array
int[] arr = {3,0,1,5,0,9,2,5,0,0,1};
output : {3,1,5,9,2,5,1}*/

package practice.pooja.rahul.copy;

import java.util.Scanner;

public class Assignment28PR2 {

	int getCountOfNonZeroNumbers(int[] num) {
		int count = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] != 0)
				count++;
		}
		return count;
	}

	void printNonZeroNumberArray(int[] num) {
		int[] output = new int[getCountOfNonZeroNumbers(num)];
		int i = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] != 0) {
				output[i] = num[index];
				i++;
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

		Assignment28PR2 assignment28PR2 = new Assignment28PR2();
		assignment28PR2.printNonZeroNumberArray(inputArray);
		scanner.close();
	}
}