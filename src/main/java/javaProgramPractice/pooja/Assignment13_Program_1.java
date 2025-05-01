package javaProgramPractice.pooja;

public class Assignment13_Program_1 {
	
	void printUcaseLcaseCount(String input) {
		int uCount=0, lCount=0;
		for(int index=0; index<input.length(); index++) {
			char ch=input.charAt(index);
			if(Character.isLowerCase(ch))
				lCount++;
			else
				uCount++;
		}
		System.out.println(input + " contains " + lCount + " lower case letters and " + uCount + " upper case letters.");
	}
	
	public static void main(String[] args) {
		Assignment13_Program_1 uppernLowerLetterCount = new Assignment13_Program_1();
		uppernLowerLetterCount.printUcaseLcaseCount("TechNOCreditS");
	}
}
