/*Print freq of all vowels in the given String. 
	input = "technocredits"
	output : e -> 2
			 o -> 1
			 e -> 2
             i -> 1*/

package javaProgramPractice.pooja;

public class Assignment16_Program_2 {
	
	boolean checkVowel(char ch) {
		ch = Character.toLowerCase(ch);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		} else
			return false;
	}
	
	void printVowelInString(String input, char ch) {	
		int vCount=0;
		if (checkVowel(ch)) {
			for(int index=0; index<input.length(); index++) {
				if(ch==input.charAt(index))
				vCount++;	
			}
				System.out.println(ch + " --> " + vCount);
		}
	}
		
	void freqOfChar(String input) {
		System.out.println("Frequency of all vowels in given string '" + input + "' are : ");
		for (int i=0; i<input.length(); i++) {
			char ch=input.charAt(i);
			printVowelInString(input, ch);
		}		
	}
	
	public static void main(String[] args) {
		new Assignment16_Program_2().freqOfChar("technocredits");
	}
}
