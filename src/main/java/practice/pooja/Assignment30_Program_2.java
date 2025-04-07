/*Write a method to return sum array of two given arrays.
 
Input Array1 = {3,4,12,35}
Input Array2 = {1,2,1,11}
Output Array : {4,6,13,46}

Input Array3 = {3,4,12,35}
Input Array4 = {1,2,1,11,17,19}
Output Array : {4,6,13,46,17,19}
*/
package practice.pooja;

import java.util.Arrays;

public class Assignment30_Program_2 {
	
	int[] getSumArray(int[] arr1, int[] arr2) {
		
		int minLength = 0;
		int maxLength = 0;
		
		if(arr1.length > arr2.length) {
			minLength = arr2.length;
			maxLength = arr1.length;
		} else {
			minLength = arr1.length;
			maxLength = arr2.length;
		}
		
		int[] outputArray = new int[maxLength];
		for (int index = 0; index < minLength; index++) {
			outputArray[index] = arr1[index] + arr2[index];
		}
		
		for (int index = minLength; index < maxLength; index++) {
			if(arr1.length > arr2.length) {
				outputArray[index] = arr1[index];
			} else {
				outputArray[index] = arr2[index];
			}
		}
		
		return outputArray;
	}

	public static void main(String[] args) {
		int[] arr1 = {3,4,12,35,21,7};
		int[] arr2 = {1,2,1,11};
		int[] arr3 = {3,4,12,35};
		int[] arr4 = {1,2,1,11,17,19};
		System.out.println("Input Array1 : " + Arrays.toString(arr1) + "\nInput Array2 : " + Arrays.toString(arr2) + "\nOutput Array : " + Arrays.toString(new Assignment30_Program_2().getSumArray(arr1, arr2)));
		System.out.println("\n-----------------------------------------------\n");
		System.out.println("Input Array1 : " + Arrays.toString(arr3) + "\nInput Array2 : " + Arrays.toString(arr4) + "\nOutput Array : " + Arrays.toString(new Assignment30_Program_2().getSumArray(arr3, arr4)));

	}

}
