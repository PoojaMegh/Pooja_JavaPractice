package practice.pooja;

public class Assignment13_Program_3 {
	void printLetterDigitCount(String input) {
		int dCount=0, lCount=0;
		for(int index=0; index<input.length(); index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch))
				dCount++;
			else if(Character.isLetter(ch))
				lCount++;
		}
		System.out.println(input + " contains " + lCount + " letters and " + dCount + " digits.");
	}
	
	public static void main(String[] args) {
		Assignment13_Program_3 letterDigitCount = new Assignment13_Program_3();
		letterDigitCount.printLetterDigitCount("Techn3ocr4ed-i5.ts");
	}
}
