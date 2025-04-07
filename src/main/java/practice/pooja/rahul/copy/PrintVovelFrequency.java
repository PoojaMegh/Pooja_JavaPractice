/*Program 2: Print freq of all vowels in the given String. 
input = "technocredits"
   output : e -> 2
            o -> 1
			e -> 2
            i -> 1		*/

package practice.pooja.rahul.copy;

public class PrintVovelFrequency {

	void checkVovelsWithFrequency(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int count = 0;
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				for (int j = 0; j < str.length(); j++) {
					if (ch == str.charAt(j))
						count++;
				}
				System.out.println(ch + "-->" + count);
			}
		}
	}

	public static void main(String[] args) {
		new PrintVovelFrequency().checkVovelsWithFrequency("technocredits");
	}
}
