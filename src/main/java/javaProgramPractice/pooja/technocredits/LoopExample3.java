package javaProgramPractice.pooja.technocredits;

public class LoopExample3 {

	void findCharFreq(String input, char ch) {
		int count = 0;
		for(int index=0;index<input.length();index++) {
			if(ch == input.charAt(index))
				count++;
		}
		System.out.println(ch + "-->" + count);
	}
	
	void findAllCharFreq(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			findCharFreq(input, ch);
		}
	}
	
	public static void main(String[] args) {
		
	}
}
