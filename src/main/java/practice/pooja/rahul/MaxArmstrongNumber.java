/*Assignment 24 - Program 2 : Return the max Armstrong numbers from given array.
input : {10,407,123,153,125,371,1999}
output : 407*/

package practice.pooja.rahul;

public class MaxArmstrongNumber {

	void printMaxArmstrongNumbers(int[] num) {
		ArmstrongNumbers armstrong = new ArmstrongNumbers();
		boolean flag = false;
		int maxNum = 0;
		for (int index = 0; index < num.length; index++) {
			flag = armstrong.isArmstrong(num[index]);
			if (flag == true && num[index] > maxNum) {
				maxNum = num[index];
			}
		}
		System.out.println("The maximum armstrong number from given array is " + maxNum);
	}

	public static void main(String[] args) {
		int[] input = { 10, 407, 123, 153, 125, 371, 1634, 1999 };
		new MaxArmstrongNumber().printMaxArmstrongNumbers(input);
	}
}