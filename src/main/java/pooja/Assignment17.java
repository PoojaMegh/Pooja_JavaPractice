/*Print freq of all characters in given String 
[Modular code : 2 methods, 1 is to find freq of a given char, second to iterate all characters and call first method for each character].*/

package pooja;

public class Assignment17 {
	
	void printCharInString(String input, char ch) {	
		int count=0;
		for(int index=0; index<input.length(); index++) {
				if(ch==input.charAt(index))
				count++;	
		}
		System.out.println(ch + " --> " + count);
	}
		
	void freqOfChar(String input) {
		System.out.println("Frequency of all characters in given string '" + input + "' are : ");
		while(input.length()>0) {
			char ch=input.charAt(0);
			printCharInString(input, ch);
			input = input.replace(String.valueOf(ch), "");
		}
	}
	
	public static void main(String[] args) {
		new Assignment17().freqOfChar("technocredits");
	}
}
