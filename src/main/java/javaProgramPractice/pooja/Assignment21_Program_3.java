/*find the difference between max number and min number from given array.

input : {14,66,23,45,11,19}
output : Max number is 66
         Min number is 11
 Difference between max and min is 55
*/
package javaProgramPractice.pooja;

public class Assignment21_Program_3 {
	static int max, min;
	
	int maxNm(int[] input) {
		max = input[0];
		for(int index=0; index<input.length; index++) {
			if(max<input[index])
				max = input[index];
		}
		System.out.println("Maximum number is : " + max );
		return max;
	}
	
	int minNm(int[] input) {
		min = input[0];
		for(int index=0; index<input.length; index++) {
			if(min>input[index])
				min = input[index];
		}
		System.out.println("Minimum number is : " + min );
		return min;
	}
	
	public static void main(String[] args) {
		int[] input = {14,66,23,45,11,19};
		Assignment21_Program_3 diff = new Assignment21_Program_3();
		System.out.println("Difference between max and min numbers is : " + (diff.maxNm(input) - diff.minNm(input)));
	}

}
