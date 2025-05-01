/*2.Print all characters at an even position from the given string.
input : technocredits
output : ehordt

Note: Position and index is 2 different thing. Here we are talking about even position characters in String.
*/

package javaProgramPractice.pooja.rahul;

public class EvenPositionCharactersInString {
	
	void evenPositionCharacters(String str) {
		for(int index = 1;  index <str.length();) {
			System.out.println(str.charAt(index));
			index = index+2;
		}
	}

	public static void main(String[] args) {
		new EvenPositionCharactersInString().evenPositionCharacters("Technocredits");
	}
}