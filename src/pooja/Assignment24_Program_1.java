/*Print all the Armstrong numbers from given array.
input : {10,123,153,125,371,1634}
output : 153
         371
*/
package pooja;

import java.util.Arrays;

public class Assignment24_Program_1 {

	void printAllArmstrongNumbers(int[] input) {
		System.out.println("Below are the armstrong numbers from given array : ");
		
		for (int index = 0; index < input.length; index++) {
			if (Armstrong_Number.isNumArmstrong(input[index])) {
				System.out.println(input[index]);
			}
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 123, 153, 125, 371, 1634 };
		System.out.println("Input array list : " + Arrays.toString(input));
		new Assignment24_Program_1().printAllArmstrongNumbers(input);
	}
}
