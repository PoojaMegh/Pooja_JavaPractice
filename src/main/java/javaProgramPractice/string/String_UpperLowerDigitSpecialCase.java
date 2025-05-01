/*
	
	----------------------------------
	
	
}
*/

package javaProgramPractice.string;

public class String_UpperLowerDigitSpecialCase {
	
	/*
	 * Program 1: Write a method to print how many upper and lower case char given string contains. 
	 * String str = "TechNOCreditS"; 
	 * output : 5 - uppercase letters
	 * 			8 - lowercase letters
	 */
	void printUpperLowerCaseCount(String input) {
		int lCount=0;
		int uCount=0;
		
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isLowerCase(ch)) 
				lCount++;
			else
				uCount++;
		}
		System.out.println("String '" + input + "' contains " + lCount + " lower case letters and " + uCount + " upper case letters.");
		System.out.println("--------------------------------------------------\n");
	}

	/*
	 * Program 2: Write a method to print how many digits given string contains.
	 * String str = "Techn3ocr4edi5ts"; 
	 * output : 3
	 */
	void printDigitCount (String input) {
		int dCount=0;
		
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch))
				dCount++;
		}
		System.out.println("String '" + input + "' contains " + dCount + " digits.");
		System.out.println("--------------------------------------------------\n");
	}
	
	/*
	 * Program 3: Write a method to print how many letters & digits given string contains.
	 * String str = "Techn3ocr4ed-i5.ts" 
	 * output : Letters - 13 
	 * 			Digits - 3
	 */
	void printLetterDigitCount(String input) {
		int lCount = 0;
		int dCount = 0;
		
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				dCount++;
			} else if(Character.isLetter(ch)) {
				lCount++;
			}
		}
		System.out.println("String '" + input + "' contains " + dCount + " Digits and " + lCount + " Letters.");
		System.out.println("--------------------------------------------------\n");
	}
	
	/*
	 * Program 4: Write a method to print how many letters,uppercase, lowercase, digits given string contains.
	 * String str = "Techn3oCr4edi5ts" 
	 * output : Letters - 13 
	 * 			UpperCase - 2 
	 * 			LowerCase - 11 
	 * 			Digits - 3
	 */
	void printLetterUpperLowerDigitCount(String input) {
		int lCount=0, dCount=0, loCount=0, upCount=0;
		
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isLetter(ch)) {
				lCount++;
				if(Character.isUpperCase(ch))
					upCount++;
				else
					loCount++;
			} else if(Character.isDigit(ch))
				dCount++;
		}
		System.out.println("String '" + input + "' contains " + dCount + " Digits and " + lCount + " Letters Where " + loCount + " are lower case letters and " + upCount + " are upper case letters.");
		System.out.println("--------------------------------------------------\n");
	}
	
	/*
	 * Program 5: Write a method to print how many special characters given string contains.
	 * String str = "Te#ch_n3o.Cr4e-di5ts" 
	 * output : Special character - 4
	 */
	void printSpecialCharCount(String input) {
		int sCount = 0;
		
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(!(Character.isDigit(ch)) && !(Character.isLetter(ch)))
				sCount++;
		}
		System.out.println("String '" + input + "' contains " + sCount + " Special characters.");
	}
	
	//Main Method
	public static void main(String[] args) {
		String_UpperLowerDigitSpecialCase caseCount = new String_UpperLowerDigitSpecialCase();
		caseCount.printUpperLowerCaseCount("TechNOCreditS");
		caseCount.printDigitCount("Techn3ocr4edi5ts");
		caseCount.printLetterDigitCount("Techn3ocr4ed-i5.ts");
		caseCount.printLetterUpperLowerDigitCount("Techn3oCr4edi5ts");
		caseCount.printSpecialCharCount("Te#ch_n3o.Cr4e-di5ts");
	}
}
