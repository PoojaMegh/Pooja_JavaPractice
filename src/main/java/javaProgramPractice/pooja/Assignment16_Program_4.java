// Print freq of all characters in given String [Loop inside loop]

package javaProgramPractice.pooja;

public class Assignment16_Program_4 {
	void printFreqOfCharInString(String input) {	
		System.out.println("Frequency of all characters in given string '" + input + "' are : ");
		
		for(int index=0; index<input.length(); index++) {
			int count=0;
			char ch=input.charAt(index);
			for (int i=0; i<input.length(); i++) {
				if(ch==input.charAt(i))
					count++;	
			}
			System.out.println(ch + " --> " + count);
		}
	}
	
	public static void main(String[] args) {
		new Assignment16_Program_4().printFreqOfCharInString("technocredits");
	}
}
