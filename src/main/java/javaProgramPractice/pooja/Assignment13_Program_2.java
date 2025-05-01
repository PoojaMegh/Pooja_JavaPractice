package javaProgramPractice.pooja;

public class Assignment13_Program_2 {
	void printDigitCount(String input) {
		int dCount=0;
		
		for(int index=0; index<input.length(); index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch))
				dCount++;
		}
		System.out.println(input + " contains " + dCount + " digits.");
	}
	
	public static void main(String[] args) {
		Assignment13_Program_2 digitCount = new Assignment13_Program_2();
		digitCount.printDigitCount("Techn3ocr4edi5ts");
	}
}