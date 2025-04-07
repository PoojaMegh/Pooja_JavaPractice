/*Program 4: Print freq of all characters in given String [Loop inside loop].*/

package practice.string;

public class FrequencyOfAllCharacters {
	
	void printFrequencyOfAllCharacters(String str) {
		
		for(int index = 0; index<str.length(); index++) {
			char ch = str.charAt(index);
			int count = 0;
			for(int j = 0; j<str.length(); j++) {
				if(ch == str.charAt(j))
					count++;
			}
			System.out.println(ch+ "-->" +count);
		}
	}

	public static void main(String[] args) {
		new FrequencyOfAllCharacters().printFrequencyOfAllCharacters("technocredits");
	}

}
