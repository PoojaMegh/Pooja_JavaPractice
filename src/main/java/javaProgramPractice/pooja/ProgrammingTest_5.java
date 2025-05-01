/*WAP to return count of visible tree in given array.

Input = {3,5,4,9,7,8}
Output : 3
*/

package javaProgramPractice.pooja;

import java.util.Arrays;

public class ProgrammingTest_5 {
	
	int visibleTree(int[] input) {
		int output = 1;
		int maxNm = input[0];
		
		for (int index = 0; index < input.length; index++) {
			if(input[index] > maxNm) {
				maxNm = input[index];
				output++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = {3,5,4,9,7,8};
		System.out.println("Input Array : " + Arrays.toString(input) + "\nOutput : " + new ProgrammingTest_5().visibleTree(input));
	}

}
