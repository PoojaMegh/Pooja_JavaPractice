/*Program 2: Print freq of all vowels in the given String. 
input = "technocredits"
   output : e -> 2
            o -> 1
			e -> 2
            i -> 1*/	

package javaProgramPractice.pooja.technocredits;

public class Assignment16_Program2 {
	
	private void printCharFreq(String input, char ch) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			if(ch == input.charAt(index))
				count++;
		}
		System.out.println(ch + "->" + count);
	}
	
	private boolean isCharVowel(char ch) {
		ch = Character.toLowerCase(ch);
		if(ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u') 
			return true;
		else
			return false;
	}
	
	private void printFreqOfVowelChar(String input, char ch) {
		if(isCharVowel(ch)) {
			printCharFreq(input, ch);
		}
	}
	
	void processData(String str) {
		for(int index=0;index<str.length();index++) {			
			printFreqOfVowelChar(str,str.charAt(index));
		}
	}
	
	String getNonVowelChar(String input) {
		String output = "";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(!isCharVowel(ch))
				//System.out.println(ch);
				output = output + ch;
		}
		return output;
	}
	
	public static void main(String[] args) {
		String input = "technocredits";
		new Assignment16_Program2().processData(input);
		String answer = new Assignment16_Program2().getNonVowelChar(input);
		System.out.println(answer);
	}
}























