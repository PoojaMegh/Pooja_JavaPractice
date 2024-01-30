package pooja;

public class Assignment13_Program_4 {
	void printUcaseLcaselettersDigitsCount(String input) {
		int uCount=0, lCount=0, tCount=0, dCount=0;
		for(int index=0; index<input.length(); index++) {
			char ch=input.charAt(index);
			if(Character.isLetter(ch)) {
				tCount++;
				if(Character.isLowerCase(ch))
					lCount++;
				else
					uCount++;
			}else if(Character.isDigit(ch))
				dCount++;
		}
		System.out.println(input + " contains " + tCount + " letters and " + dCount + " digits. Where " + lCount + " are lower case letters and " + uCount + " are upper case letters.");
	}
	
	public static void main(String[] args) {
		Assignment13_Program_4 upperLowerLetterDigitCount = new Assignment13_Program_4();
		upperLowerLetterDigitCount.printUcaseLcaselettersDigitsCount("Techn3oCr4edi5ts");
	}
}
