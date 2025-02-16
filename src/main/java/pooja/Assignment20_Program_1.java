/*Return difference of sum of even and odd numbers from given String.
input1 = "Te4ch1noc5re7dit2s";
output : 7
hint : sum of even digits - sum of odd digits (make sure you return positive difference only)
hint : 13 - 6

input2 = "Te4ch1noc5re8dit2s"
output : 8
hint : 14 - 6
*/
package pooja;

public class Assignment20_Program_1 {
	
	int evenSum, oddSum, sumDiff;
	
	void sumOfDigitsInString(String input) {
		
		for(int index=0; index<input.length(); index++) {
		char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				digitSum(ch);
			}
		}
		if (evenSum > oddSum)
			sumDiff = evenSum - oddSum;
		else
			sumDiff = oddSum - evenSum;
		System.out.println("Difference of sum of even digits and sum of odd digits in string '" + input + "' is : " + sumDiff);
	}
	
	int digitSum(char ch) {
		int num = Character.getNumericValue(ch);
		if(num%2 == 0)
			return evenSum = evenSum + num;
		else 
			return oddSum = oddSum + num;
	}
	
	public static void main(String[] args) {
		new Assignment20_Program_1().sumOfDigitsInString("Te4ch1noc5re7dit2s");
		new Assignment20_Program_1().sumOfDigitsInString("Te4ch1noc5re8dit2s");
	}
}
