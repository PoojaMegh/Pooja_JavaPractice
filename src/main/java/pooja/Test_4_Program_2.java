/*WAP a program to return String in expected format.

String str = "Techn3ocr4eDi5Ts"
output : TDT12echnocreis

Expected format : All UpperCase + sum of all the digits + lowercase
*/

package pooja;

public class Test_4_Program_2 {

	String uCStr="", lCStr="";
	int dSum;
	
	void stringInExpectedFormat(String input) {
				
		for (int index=0; index<input.length(); index++) {
			char ch=input.charAt(index);
			if(Character.isUpperCase(ch)) {
				uCStr = uCStr + ch ;
			}
			if (Character.isDigit(ch)) {
				dSum = dSum + Character.getNumericValue(ch) ;
			}
			if (Character.isLowerCase(ch)) {
				lCStr = lCStr + ch;
			}
		}
		System.out.println("Output for given string '" + input + "' in expected format is : " + uCStr + dSum + lCStr );
	}
	
	public static void main(String[] args) {
		new Test_4_Program_2().stringInExpectedFormat("Techn3ocr4eDi5Ts");
	}
}
