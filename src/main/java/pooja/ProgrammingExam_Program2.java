/*
WAP to print a single occurrence element from the array in Java?
	i/p  : {5,8,1,2,4,3,2,1}
	o/p : {5,8,4,3}
*/

package pooja;

import java.util.Arrays;

public class ProgrammingExam_Program2 {

	int[] getUniqueElementArrayNum(int[] input){
		int[] temp = new int[input.length];
		int tempIndex = 0;
		for(int i = 0 ; i < input.length ; i++) {
			int count= numFreq(input, input[i]);
			if(count == 1) {
				temp[tempIndex++] = input[i];
			}
		}
		int[] output = new int[tempIndex];
		for(int i = 0 ; i < output.length ; i++) {
			output[i] = temp[i];
		}
		return output;
	}
	
	int numFreq(int[] input, int num) {
		int numFreq = 0;
		for(int index=0; index<input.length; index++) {
			if(input[index]==num)
				numFreq++;
		}
		return numFreq;
	}

		public static void main(String[] args) {
			int[] inputArr = {5,8,1,2,4,3,2,1};
			System.out.println("Input Array : " + Arrays.toString(inputArr) + "\nOutput Array : " + Arrays.toString(new ProgrammingExam_Program2().getUniqueElementArrayNum(inputArr)));
		}
}
