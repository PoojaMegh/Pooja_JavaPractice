/*WAP to return reverse number.
input : 2531
output : 1352
*/

package javaProgramPractice.pooja;

public class Assignment25_Program_1 {
		
	void revNumber(int number) {
		int digit = GetNumDigit.getDigitCount(number);
		double revNumber = 0;
		
		while(number>0) {
			int temp = number % 10;
			revNumber = revNumber + temp*Math.pow(10, --digit); 
			number = number/10;
		}
		System.out.println("Reverse number of given number is : " + (int)revNumber);
	}
	
	public static void main(String[] args) {
		new Assignment25_Program_1().revNumber(2531);
	}
}
