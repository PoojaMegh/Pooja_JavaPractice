package practice.pooja;

public class GetNumDigit {

	static int getDigitCount (int number) {
		int digitCount = 0;
		
		while(number>0) {
			number = number/10;
			digitCount++;
		}
		return digitCount;
	}
}
