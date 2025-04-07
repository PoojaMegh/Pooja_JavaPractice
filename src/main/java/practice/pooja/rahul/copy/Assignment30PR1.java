/*Assigment-30 : 2nd Jun'2023

Program 1 : Write a method to return sum of max number from both array.

int getMaxNum(int[] arr1, int[] arr2){

}

 
int[] arr1 = {23,44,12,35};
int[] arr2 = {13,22,1,11,34};
output : 44 + 34 = 78*/

package practice.pooja.rahul.copy;

public class Assignment30PR1 {

	int getMaxNum(int[] arr1, int[] arr2) {
		int maxNumArr1 = 0;
		int maxNumArr2 = 0;
		for (int index = 0; index < arr1.length; index++) {
			if (maxNumArr1 < arr1[index])
				maxNumArr1 = arr1[index];
		}
		for (int index = 0; index < arr2.length; index++) {
			if (maxNumArr2 < arr2[index])
				maxNumArr2 = arr2[index];
		}
		return maxNumArr1 + maxNumArr2;
	}

	public static void main(String[] args) {
		int[] input1 = { 10, 15, 29, 85, 44 };
		int[] input2 = { 42, 41, 24, 19, 7, 52 };
		int sumOfMaxNumber = new Assignment30PR1().getMaxNum(input1, input2);
		System.out.println("Sum of Maximum numbers from 2 arrays is " + sumOfMaxNumber);
	}
}