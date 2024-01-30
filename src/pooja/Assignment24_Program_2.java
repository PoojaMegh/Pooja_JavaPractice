/*Return the max Armstrong numbers from given array.
input : {10,407,123,153,125,371,1999}
output : 1634
*/
package pooja;

import java.util.Arrays;

public class Assignment24_Program_2 {

	void getMaxArmstrongNumber(int[] input) {
		int maxNum = 0;
		
		for (int index = 0; index < input.length; index++) {
			if (Armstrong_Number.isNumArmstrong(input[index]) == true && input[index] > maxNum) {
				maxNum = input[index];
			}
		}
		System.out.println("The maximum armstrong number from given array is: " + maxNum);
	}

	public static void main(String[] args) {
		int[] input = { 10, 407, 123, 153, 125, 371, 1634, 1999 };
		System.out.println("Input array list : " + Arrays.toString(input));
		new Assignment24_Program_2().getMaxArmstrongNumber(input);
	}

}
