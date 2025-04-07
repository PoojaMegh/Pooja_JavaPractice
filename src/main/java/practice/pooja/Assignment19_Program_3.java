/*Print all the characters which are non repetative using (indexOf() and lastIndexOf()) logic. 
input : "technocredits";
output : hnordis
*/

package practice.pooja;

public class Assignment19_Program_3 {
	
	void freqOfSingleChar(String input) {
		System.out.println("Non repetative characters in given string '" + input + "' are --> ");
		
		while(input.length()>0) {
				char ch = input.charAt(0);
				int first = input.indexOf(ch);
				int last = input.lastIndexOf(ch);
				input = input.replace(String.valueOf(ch), "");
				if(last == first) {
					System.out.print(ch);
				}
			}
		}
	
	public static void main(String[] args) {
		new Assignment19_Program_3().freqOfSingleChar("technocredits");
	}
}
