/*Assignment22 - Program 1 : Return difference between sum of odd index number - sum of even index number.
Note : You should return positive difference.
input : {2,5,8,4,6,10}
output : 3
(5+4+10)-(2+8+6)*/

package javaProgramPractice.pooja.rahul;

public class Assignment22PR1 {

	int checkEvenOddSum(int[] num) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0)
				evenSum = evenSum + num[index];
			else
				oddSum = oddSum + num[index];
		}
		if (evenSum > oddSum)
			return (evenSum - oddSum);
		else
			return (oddSum - evenSum);
	}

	public static void main(String[] args) {
		int[] input = { 4, 8, 7, 6, 3, 5, 11, 12 };
		int evenOddDifference = new Assignment22PR1().checkEvenOddSum(input);
		System.out.println("The positive difference between sum of even numbers and sum of odd numbers from given array is : "
				+ evenOddDifference);
	}
}