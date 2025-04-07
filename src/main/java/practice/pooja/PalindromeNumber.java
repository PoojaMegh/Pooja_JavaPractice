package practice.pooja;

import java.util.Scanner;

public class PalindromeNumber {

	static boolean isNumPalindrome(int number) {
		int digit = GetNumDigit.getDigitCount(number);
		int orgNumber = number;
		double revNumber = 0;
		
		while(number>0) {
			int temp = number % 10;
			revNumber = revNumber + temp*Math.pow(10, --digit); 
			number = number/10;
		}
		
		if(revNumber == orgNumber)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = scanner.nextInt();

		if(num<0){
			return;
		}
		int original = num;
		int reversed = 0;

		while(num != 0){
			int digit = num%10;
			reversed = reversed*10 + digit;
			num = num/10;
		}

		if(original == reversed){
			System.out.println("Number is palindrome.");
		} else {
			System.out.println("Number is not palindrome.");
		}
	}
}
