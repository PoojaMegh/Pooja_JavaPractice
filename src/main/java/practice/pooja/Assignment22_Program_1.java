/*Return difference between sum of odd index number - sum of even index number.
Note : You should return positive difference.
input : {2,5,8,4,6,10}
output : 3
(5+4+10)-(2+8+6)
*/
package practice.pooja;

public class Assignment22_Program_1 {
	
	int oddSum, evenSum, sumDiff;
	
	void sumEvenOdd(int[] input) {
		for(int index=0; index<input.length; index++) {
			if(index%2==0)
				evenSum = evenSum + input[index];
			else 
				oddSum = oddSum + input[index];
		}
		
		if (evenSum > oddSum)
			sumDiff = evenSum - oddSum;
		else
			sumDiff = oddSum - evenSum;
		System.out.println("Difference between sum of odd index number - sum of even index number is : " + sumDiff);
	}
	
	public static void main(String[] args) {
		int[] input = {2,5,8,4,6,10};
		new Assignment22_Program_1().sumEvenOdd(input);
	}
}
