/*Assignment - 13 : 6th May'2023

Please create different java file for each program, name of the java file can be Assignment13_Program1,Assignment13_Program2.

Push all java file in single branch called "Maulik_Assignment13" (Please use your name instead of Maulik).

Program 1:  
Write a method to print how many upper and lowercase given string contains.
String str = "TechNOCreditS";
output : 5 - uppercase letters
         8 - lowercase letters

Hint: 
char ch = str.charAt(0);
if(Character.isLowerCase(ch))
	lCount++;
else
	uCount++;

--------------------------
Program 2:  
Write a method to print how many digits given string contains.

String str = "Techn3ocr4edi5ts";
output : 3
hint:  isDigit(ch)

-----------------------------
Program 3:  
Write a method to print how many letters & digits given string contains.

String str = "Techn3ocr4ed-i5.ts"
output : Letters - 13
         Digits - 3
Hint: 
if(Character.isDigit())
	dCount++;
else if(Character.isLetter())
    lCount++;

----------------------------------
Program 4:  
Write a method to print how many letters,uppercase, lowercase, digits given string contains.

String str = "Techn3oCr4edi5ts"
output : Letters - 13
         UpperCase - 2
		 LowerCase - 11
         Digits - 3
		 
Hint: 		 
		 if(Character.isLetter()){
			tCount++;
			if(Character.isUpperCase())
				uCount++;
			else
				lCount++;
		 }else if(Character.isDigit())
			dCount++;
----------------------------------
Program 5:  
Write a method to print how many digits given string contains.

String str = "Te#ch_n3o.Cr4e-di5ts"
output : Special character - 4

Hint:  
if(Character.isDigit(ch)){

}else if(Charater.isLetter(ch)){

}else{
	sCount+;
}


if(Character.isDigit(ch)==false && Character.isLetter(ch)==false){
	sCount++;
}*/

package pooja.rahul;

public class StringAndCharFunctions {

	void checkUpperAndLowerCount(String str) { // Program1
		int lcount = 0;
		int ucount = 0;
		for (int index = 1; index < str.length(); index++) {
			if (Character.isLowerCase(str.charAt(index))) {
				lcount++;
			} else if (Character.isUpperCase(str.charAt(index))) {
				ucount++;
			}
		}
		System.out.println("LowerCase : " + lcount);
		System.out.println("UpperCase : " + ucount);
	}

	void checkDigit(String str) { // Program2
		int dcount = 0;
		for (int index = 1; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				dcount++;
			}
		}
		System.out.println("Total Digits : " + dcount);
	}

	void checkLetterAndDigit(String str) { // Program3
		int lcount = 0;
		int dcount = 0;
		for (int index = 1; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				dcount++;
			} else if (Character.isLetter(str.charAt(index))) {
				lcount++;
			}
		}
		System.out.println("Total Digits : " + dcount);
		System.out.println("Total Letters : " + lcount);
	}

	void checkLetterUpperLowerAndDigits(String str) { // Program4
		int letterCount = 0;
		int dcount = 0;
		int ucount = 0;
		int lcount = 0;
		for (int index = 1; index < str.length(); index++) {
			if (Character.isLetter(str.charAt(index))) {
				letterCount++;
				if (Character.isLowerCase(str.charAt(index))) {
					lcount++;
				} else if (Character.isUpperCase(str.charAt(index))) {
					ucount++;
				}
			} else if (Character.isDigit(str.charAt(index))) {
				dcount++;
			}
		}
		System.out.println("Total Letters : " + letterCount);
		System.out.println("Upper Case : " + ucount);
		System.out.println("Lower Case : " + lcount);
		System.out.println("Total Digits : " + dcount);
	}

	void checkSpecialChar(String str) { // Program 5
		int letterCount = 0;
		int dcount = 0;
		int scount = 0;
		for (int index = 1; index < str.length(); index++) {
			if (Character.isLetter(str.charAt(index))) {
				letterCount++;
			} else if (Character.isDigit(str.charAt(index))) {
				dcount++;
			}

			if (!Character.isLetter(str.charAt(index)) && !Character.isDigit(str.charAt(index))) {
				scount++;
			}
		}
		System.out.println("Total Letters : " + letterCount);
		System.out.println("Total Digits : " + dcount);
		System.out.println("Special characters : " + scount);
	}

	public static void main(String[] args) {
		StringAndCharFunctions stringAndCharFunctions = new StringAndCharFunctions();
		System.out.println("================Program1==================");
		stringAndCharFunctions.checkUpperAndLowerCount("TechNOCreDiTs");
		System.out.println("================Program2==================");
		stringAndCharFunctions.checkDigit("Sting5599hshu55589sggu");
		System.out.println("================Program3==================");
		stringAndCharFunctions.checkLetterAndDigit("String74889and-/*Baron66lhs");
		System.out.println("================Program4==================");
		stringAndCharFunctions.checkLetterUpperLowerAndDigits("BDyygfihSBGihj98555sbyhi-/*/vshs");
		System.out.println("================Program5==================");
		stringAndCharFunctions.checkSpecialChar("BDyygfihSBGihj98555sbyhi-/*/vshs");
	}
}
