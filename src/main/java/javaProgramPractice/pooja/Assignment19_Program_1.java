/*Find the frequency of each character using single while loop logic.
hint : originalLength - newLength*/

package javaProgramPractice.pooja;

public class Assignment19_Program_1 {
	
	void freqOfSingleChar(String input, char ch) {
		System.out.println("Frequency of '" + ch + "' in given string '" + input + "' is --> ");
		
		while(input.length()>0) {
				char ch1 = input.charAt(0);
				int originalLength = input.length();
				input = input.replace(String.valueOf(ch1), "");
				int newLength = input.length();
				int charFreq = originalLength - newLength;
				if(ch1==ch) {
					System.out.println(charFreq);
				}
			}
		}
	
	public static void main(String[] args) {
		new Assignment19_Program_1().freqOfSingleChar("technocredits", 's');
		new Assignment19_Program_1().freqOfSingleChar("javaProgramPractice/pooja", 'o');
	}
}
