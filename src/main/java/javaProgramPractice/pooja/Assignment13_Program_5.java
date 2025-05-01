package javaProgramPractice.pooja;

public class Assignment13_Program_5 {
	void printSpecialCharCount(String input) {
		int sCount=0;
		for(int index=0; index<input.length(); index++) {
			char ch=input.charAt(index);
			if(!Character.isLetter(ch) && !Character.isDigit(ch))
				sCount++;
		}
		System.out.println(input + " contains " + sCount + " special characters.");
	}
	
	public static void main(String[] args) {
		Assignment13_Program_5 specialCharCount = new Assignment13_Program_5();
		specialCharCount.printSpecialCharCount("Te#ch_n3o.Cr4e-di5ts");
	}
}
