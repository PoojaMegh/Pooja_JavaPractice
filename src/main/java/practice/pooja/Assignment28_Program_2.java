/*WAP to return output array by returning only non zero elements from the array.
int[] arr = {3,0,1,5,0,9,2,5,0,0,1}
output : {3,1,5,9,2,5,1}
*/
package practice.pooja;

import java.util.Arrays;

public class Assignment28_Program_2 {

	int[] reArrangeArray(int[] input) {
		
		int inputLength = 0;
		int i=0;
		
		for(int index=0; index<input.length; index++) {
			if(input[index] != 0) {
				inputLength++;
			}
		}
		
		int[] output = new int[inputLength];

		for(int index=0; index<input.length; index++) {
			if(input[index] != 0) {
				output[i] = input[index];
				i++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = {3,0,1,5,0,9,2,5,0,0,1};
		System.out.println("Input Array : " + Arrays.toString(input) + "\nOutput Array : " + Arrays.toString(new Assignment28_Program_2().reArrangeArray(input)));
	}
	
}
