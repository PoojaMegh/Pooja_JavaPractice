/*Program 1:  
Find the frequency of each character using single while loop logic.
hint : originalLength - newLength*/

package pooja.rahul;

public class CharFrequencySingleLoop {

	void checkFrequency(String str) {

		while (str.length() > 0) {
			char ch = str.charAt(0);
			int originalLength = str.length();
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();
			System.out.println(ch + "-->" + (originalLength - newLength));
		}
	}

	public static void main(String[] args) {
		new CharFrequencySingleLoop().checkFrequency("technocredits");
	}
}