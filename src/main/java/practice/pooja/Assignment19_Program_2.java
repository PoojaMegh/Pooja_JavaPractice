/*Print all the characters which are non repetative using (originalLength - newLength) logic. 
input : "technocredits";
output : hnordis
*/

package practice.pooja;

public class Assignment19_Program_2 {
	
	void freqOfSingleChar(String input) {
		System.out.println("Non repetative characters in given string '" + input + "' are --> ");
		
		while(input.length()>0) {
				char ch = input.charAt(0);
				int originalLength = input.length();
				input = input.replace(String.valueOf(ch), "");
				int newLength = input.length();
				int charFreq = originalLength - newLength;
				if(charFreq == 1) {
					System.out.print(ch);
				}
			}
		}
	
	public static void main(String[] args) {
		new Assignment19_Program_2().freqOfSingleChar("technocredits");
	}
}
