/*
Write a program that finds maximum repeating character from the string
	i/p  : globant india
	o/p : i
	
	i/p  : xoriant pune
	o/p : 
*/

package practice.pooja;

public class ProgrammingExam_Program1 {
	
	void maxChar(String input) {
		char maxChr = input.charAt(0);
		int maxCnt = 0;
		int count = 0;
		
		for(int i=0; i<input.length(); i++) {
			char chr = input.charAt(i);
			count = charFreq(input, chr);
			if(maxCnt < count) {
				maxChr = chr;
				maxCnt = count;
			}
		}
		System.out.println("\nMaximum repeating character from the string '" + input + "' is : '" + maxChr + "' with frequency : " + maxCnt);
	}
	
	int charFreq(String input, char ch) {
		int charFreq = 0;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index)==ch)
				charFreq++;
		}
		return charFreq;
	}

	public static void main(String[] args) {
		ProgrammingExam_Program1 max = new ProgrammingExam_Program1();
		
		max.maxChar("globant india");
		max.maxChar("globant is in india");
		max.maxChar("xoriant pune");
		max.maxChar("technocreditst");

	}

}
