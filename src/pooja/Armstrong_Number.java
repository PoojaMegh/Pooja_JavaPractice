/*Print if the number is Armstrong.
input : 153 
output : 153 is Armstrong number.

input : 123
output : 123 is not Armstrong number.         
*/
package pooja;

public class Armstrong_Number {
	
	static int getDigitCount(int number) {
		int digitCount = 0;
		while(number>0) {
			number = number/10;
			digitCount++;
		}
		return digitCount;
	}

	static boolean isNumArmstrong(int number) {
		int totalDigits = getDigitCount(number);
		int orgNumber = number;
		double newNumber = 0;
		int digit = 0;
		
		while (number>0) {
			digit = number%10;
			newNumber = newNumber + Math.pow(digit, totalDigits);
			number = number/10;
		}
		return orgNumber == newNumber;
	}
}
