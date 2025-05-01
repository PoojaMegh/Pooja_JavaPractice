/*Programming Test - 4: [30 mins]
a) WAP a program to return String in expected format.

String str = "Techn3ocr4eDi5Ts"
output : TDT345echnocreis

Expected format : All UpperCase + digits + lowercase*/

package javaProgramPractice.pooja.rahul.copy;

public class ProgrammingTest4A {

	String arrangeStringOrder(String str) {
		String upperCaseLetters = "";
		String digits = "";
		String lowerCaseLetters = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isUpperCase(str.charAt(index))) {
				upperCaseLetters = upperCaseLetters + str.charAt(index);
			} else if (Character.isDigit(str.charAt(index))) {
				digits = digits + str.charAt(index);
			} else if (Character.isLowerCase(str.charAt(index))) {
				lowerCaseLetters = lowerCaseLetters + str.charAt(index);
			}
		}
		return (upperCaseLetters + digits + lowerCaseLetters);
	}

	public static void main(String[] args) {
		ProgrammingTest4A programmingTest4A = new ProgrammingTest4A();
		String arrangedOrder = programmingTest4A.arrangeStringOrder("Techno15HC69credits");
		System.out.println(arrangedOrder);
	}
}
