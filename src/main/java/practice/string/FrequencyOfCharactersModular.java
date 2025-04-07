/*Program 5: Print freq of all characters in given String 
[Modular code : 2 methods, 1 is to find freq of a given char, second to iterate all characters and call first method for each character].*/

package practice.string;

public class FrequencyOfCharactersModular {

	void checkFrequencyOfCharacter(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (ch == str.charAt(index))
				count++;
		}
		System.out.println(ch + "-->" + count);
	}

	void printFrequencyOfAllCharacters(String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			checkFrequencyOfCharacter(str, ch);
		}
	}

	public static void main(String[] args) {
		new FrequencyOfCharactersModular().printFrequencyOfAllCharacters("technocredits");
	}
}
