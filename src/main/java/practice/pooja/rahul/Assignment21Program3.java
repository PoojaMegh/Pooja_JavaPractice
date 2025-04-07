/*Program 3:  find the difference between max number and min number from given array.

input : {14,66,23,45,11,19}
output : Max number is 66
         Min number is 11
		 Difference between max and min is 55*/

package practice.pooja.rahul;

public class Assignment21Program3 {

	int maxNumber(int[] num) {
		int maxNumber = num[0];
		for (int index = 0; index < num.length; index++) {
			if (maxNumber < num[index])
				maxNumber = num[index];
		}
		System.out.println("The max number from given array is : " + maxNumber);
		return maxNumber;
	}

	int minNumber(int[] num) {
		int minNumber = num[0];
		for (int index = 0; index < num.length; index++) {
			if (minNumber > num[index])
				minNumber = num[index];
		}
		System.out.println("The min number from given array is : " + minNumber);
		return minNumber;
	}

	void checkMinMaxAndDifference(int[] num) {
		int max = maxNumber(num);
		int min = minNumber(num);
		if (max > min)
			System.out.println("The difference between max and min is " + (max - min));
		else
			System.out.println("The difference between max and min is " + (min - max));
	}

	public static void main(String[] args) {
		int[] num = { 14, 66, 23, 45, 11, 19 };
		new Assignment21Program3().checkMinMaxAndDifference(num);
	}
}