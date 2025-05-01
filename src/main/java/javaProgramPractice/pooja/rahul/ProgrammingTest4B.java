/*Programming Test - 4: [30 mins]

b) WAP a program to return String in expected format.

String str = "Techn3ocr4eDi5Ts"
output : TDT12echnocreis

Expected format : All UpperCase + sum of all the digits + lowercase	*/

package javaProgramPractice.pooja.rahul;

public class ProgrammingTest4B {

	String arrangeStringOrder(String str) {
		String upperCaseLetters = "";
		int digitSum= 0;
		String lowerCaseLetters = "";
		for(int index = 0; index < str.length(); index++) {
			if(Character.isUpperCase(str.charAt(index))){
				upperCaseLetters = upperCaseLetters+str.charAt(index);
			}else if(Character.isDigit(str.charAt(index))){
				digitSum = digitSum + Character.getNumericValue(str.charAt(index));
			}else if(Character.isLowerCase(str.charAt(index))){
				lowerCaseLetters = lowerCaseLetters+str.charAt(index);
			}
	}
		return(upperCaseLetters+digitSum+lowerCaseLetters);
}
	
	public static void main(String[] args) {
		ProgrammingTest4B programmingTest4B = new  ProgrammingTest4B();
		String arrangedOrder =	programmingTest4B.arrangeStringOrder("Techno15HC69credits");
		System.out.println(arrangedOrder);

	}

}
