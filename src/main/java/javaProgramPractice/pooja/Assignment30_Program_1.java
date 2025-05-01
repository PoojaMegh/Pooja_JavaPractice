/*Write a method to return sum of max number from both array.
 
Input Array1 = {23,44,12,35};
Input Array2 = {13,22,1,11,34};
Output Sum : 44 + 34 = 78
*/
package javaProgramPractice.pooja;

import java.util.Arrays;

public class Assignment30_Program_1 {
	
	int getSumOfMaxNumInArrays(int[] arr1, int[] arr2) {
		
		int maxArr1 = GetMaxNumInArray.getMaxNm(arr1);
		int maxArr2 = GetMaxNumInArray.getMaxNm(arr2);
		
		int sum = maxArr1 + maxArr2;
		
		return sum;
	}

	public static void main(String[] args) {
		int[] arr1 = {23,44,12,35};
		int[] arr2 = {13,22,1,11,34};
		System.out.println("Input Array1 : " + Arrays.toString(arr1) + "\nInput Array2 : " + Arrays.toString(arr2) + "\nSum of Max Numbers : " + GetMaxNumInArray.getMaxNm(arr1) + " + " + GetMaxNumInArray.getMaxNm(arr2) + " = " + new Assignment30_Program_1().getSumOfMaxNumInArrays(arr1, arr2));

	}

}
