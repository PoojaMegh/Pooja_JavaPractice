/* WAP to return all non vowels character from given string and print output in main method.
   input = "technocredits"
   output : tchncrdts
   
   String processData(String input){
		}
*/

package javaProgramPractice.pooja;

public class Assignment16_Program_3 {
	
	boolean checkVowel(char ch) {
		ch = Character.toLowerCase(ch);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		} else
			return false;
	}
	
	void printVowelInString(String input) {
		System.out.println("Consonants in given string '" + input + "' are : ");
		
		for(int index=0; index<input.length(); index++) {
			char ch=input.charAt(index);
				if (!checkVowel(ch))
				System.out.print(ch + " ");			
		}
	}
	
	public static void main(String[] args) {
		new Assignment16_Program_3().printVowelInString("technocredits");
	}
}
