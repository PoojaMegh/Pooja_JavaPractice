/*Assigment-30 : 2nd Jun'2023
Program 2 : 

int[] arr1 = {3,4,12,35};
int[] arr2 = {1,2,1,11};

output : {4,6,13,46}

int[] arr3 = {3,4,12,35};
int[] arr4 = {1,2,1,11,17,19};

for(int index=0;index<minLength;index++){

}

for(int index=minLength;index<maxLength;index++){
	if(arr3.length < arr4.length)
		output[index] = arr4[index];
	else
		output[index] = arr3[index];
}


output : {4,6,13,46,17,19}*/

package javaProgramPractice.pooja.rahul;

public class Assignment30PR2 {

	void getAdditionWRTIndex(int[] array1, int[] array2) {
		int minLength = 0;
		int[] output = null;
		int[] minLengthArray = null;
		int[] maxLengthArray = null;

		if (array1.length > array2.length) {
			minLength = array2.length;
			output = array1;
			minLengthArray = array2;
			maxLengthArray = array1;

		} else {
			minLength = array1.length;
			output = array2;
			minLengthArray = array1;
			maxLengthArray = array2;
		}

		for (int index = 0; index < minLength; index++) {
			output[index] = maxLengthArray[index] + minLengthArray[index];
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
		int[] arr1 = { 23, 44, 12, 35 };
		int[] arr2 = { 13, 22, 1, 11, 34 };
		new Assignment30PR2().getAdditionWRTIndex(arr1, arr2);
	}
}