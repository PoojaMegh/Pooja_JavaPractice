/*Print if the number is Armstrong.
input : 153 
output : 153 is Armstrong number.

input : 123
output : 123 is not Armstrong number.
An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

Example of Armstrong Number:
153 is an Armstrong number because:
It has 3 digits, and:
1*3 + 5*3 + 3*3 = 153
In the range of 1 to 999, the Armstrong numbers are 1, 153, 370, 371, and 407
*/
package practice.pooja;

import java.util.Scanner;

public class Armstrong_Number {

	static int getDigitCount(int number){
		int digitCount = 0;
		while (number > 0){
			number = number/10;
			digitCount++;
		}
		return digitCount;
	}

	static boolean isNumArmstrong(int number){
		int totalDigits = getDigitCount(number);
		int orgNumber = number;
		double newNumber = 0;
		int digit =0;

		while(number > 0){
			digit = number%10;
			newNumber = newNumber + Math.pow(digit, totalDigits);
			number = number/10;
		}
		return orgNumber == newNumber;
	}

	static void armstongNumsInRange(int strtNm, int endNm){
		if(strtNm < endNm){
			System.out.println("\nAll the armstrong numbers between given range " +strtNm+ " --> " +endNm+ " : ");
			for (int i=strtNm; i<=endNm; i++){
				if(isNumArmstrong(i)){
					System.out.println(i + " is an Armstrong Number.");
				}
			}
		} else
			System.out.println("Enter valid range, start range should be smaller than end range.");
	}
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the Number : ");
		int number = scanner.nextInt();

		if(isNumArmstrong(number)){
			System.out.println(number + " is an Armstrong Number.");
		} else {
			System.out.println(number + " is not an Armstrong Number.");
		}
		scanner.close();
		armstongNumsInRange(1,999);
	}
}
