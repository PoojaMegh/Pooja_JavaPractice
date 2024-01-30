/*WAP to return output array by shifting all zeros at the end of the array.
Print output in main method (Arrays.toString(output));

int[] arr = {10,0,0,2,3,0,5,0,7}
output : {10,2,3,5,7,0,0,0,0}
*/
package pooja;

import java.util.Arrays;

public class Assignment27_Program_1 {
	
	int[] reArrangeArray(int[] input) {
		int[] output = new int[input.length];
		int i=0;
		
		for(int index=0; index<input.length; index++) {
			if(input[index] != 0) {
				output[i] = input[index];
				i++;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] input = {10,0,0,2,3,0,5,0,7};
		System.out.println("Input Array : " + Arrays.toString(input) + "\nRearranged Array : " + Arrays.toString(new Assignment27_Program_1().reArrangeArray(input)));
	}
}
