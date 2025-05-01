/*Program 1: Print all the vowels in the given String.
   input = "technocredits"
   output : eoei
*/

package javaProgramPractice.pooja.rahul.copy;

public class PrintVovels {

	void checkVovels(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch);
			}
		}

	}

	public static void main(String[] args) {
		new PrintVovels().checkVovels("technocredits");
	}

}
