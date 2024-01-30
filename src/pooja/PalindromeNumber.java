package pooja;

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
}
