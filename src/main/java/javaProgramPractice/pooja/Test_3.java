/*Return sum of all the digits from given String.

String str = "Tech1noc5re7dits";
output : 13

int getSumOfDigits(String input){

}*/
package javaProgramPractice.pooja;

public class Test_3 {

	boolean isCharDigit(char ch) {
		if(Character.isDigit(ch))
			return true;
		else 
			return false;
	}
	
	void sumOfDigitsInString(String input) {
		int sum = 0;
		for(int index=0; index<input.length(); index++) {
		char ch = input.charAt(index);
			if (isCharDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of digits in string '" + input + "' is : " + sum);
	}
	
	public static void main(String[] args) {
		new Test_3().sumOfDigitsInString("Tech1noc5re7dits");
	}
}
