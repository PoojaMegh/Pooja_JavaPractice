/*Program 3: WAP to return all non vowels character from given string and print output in main method.
   input = "technocredits"
   output : tchncrdts
   
   String processData(String input){
		
   }*/

package javaProgramPractice.pooja.rahul;

public class PrintNonVovelCharacters {

	void printOnlyNonVovelCharachters(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			} else {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		new PrintNonVovelCharacters().printOnlyNonVovelCharachters("technocredits");
	}
}