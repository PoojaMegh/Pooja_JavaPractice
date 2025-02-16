/*WAP a program to return String in expected format.

String str = "Techn3ocr4eDi5Ts"
output : TDT345echnocreis

Expected format : All UpperCase + digits + lowercase
*/

package pooja;

public class Test_4_Program_1 {

	String uCStr="", lCStr="", dStr="";
	
	void stringInExpectedFormat(String input) {
				
		for (int index=0; index<input.length(); index++) {
			char ch=input.charAt(index);
			if(Character.isUpperCase(ch)) {
				uCStr = uCStr + ch ;
			}
			if (Character.isDigit(ch)) {
				dStr = dStr + ch ;
			}
			if (Character.isLowerCase(ch)) {
				lCStr = lCStr + ch;
			}
		}
		System.out.println("Output for given string '" + input + "' in expected format is : " + uCStr + dStr + lCStr );
	}
	
	public static void main(String[] args) {
		new Test_4_Program_1().stringInExpectedFormat("Techn3ocr4eDi5Ts");
	}
}
