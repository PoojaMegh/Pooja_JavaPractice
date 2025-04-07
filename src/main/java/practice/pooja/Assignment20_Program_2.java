/*Return difference of sum of even and odd numbers from given String.
input1 = "Te4ch1noc5re7dit2s";
output : 7
hint : sum of even digits - sum of odd digits (make sure you return positive difference only)
hint : 13 - 6

input2 = "Te4ch1noc5re8dit2s"
output : 8
hint : 14 - 6
*/
package practice.pooja;
import java.util.Scanner;

public class Assignment20_Program_2 {
	
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
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first input string : ");
		String input = scanner.next();
		System.out.println("Enter second input string : ");
		String input1 = scanner.next();
		new Assignment20_Program_2().sumOfDigitsInString(input);
		new Assignment20_Program_2().sumOfDigitsInString(input1);
		scanner.close();
	}
}
