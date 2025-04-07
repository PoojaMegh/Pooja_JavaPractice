/*Assigment-25 : 20th May'2023 [ETA : 21st May'2023]

Program 1 : WAP to return reverse number.
input : 2531
output : 1352*/

package practice.pooja.rahul.copy;

public class Assignment25ReverseNumber {

	int getDigitsCount(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	double getReverseNumber(int num) {
		int totalDigits = getDigitsCount(num) - 1;
		double reverseNum = 0;
		while (num > 0) {
			int digit = num % 10;
			reverseNum = reverseNum + digit * Math.pow(10, totalDigits--);
			num = num / 10;
		}
		return reverseNum;
	}

	public static void main(String[] args) {
		Assignment25ReverseNumber assignment25ReverseNumber = new Assignment25ReverseNumber();
		int number = (int) assignment25ReverseNumber.getReverseNumber(15488);
		System.out.println(number);
	}
}
