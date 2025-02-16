/*Find frequency of each word using ArrayList.
String str = "hi hello how are you how are your partner how hi is your mother";
output : hi -> 2
         hello -> 1
         how -> 3
         are -> 2
         your -> 2 
		 partner -> 1
		 is -> 1
 mother -> 1
*/

package collectionPrograms.arrayList.Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class Program1_FrequencyOfWordsInString {

	//Method1
	void freqOfElement(ArrayList<String> input) {
		String element = input.get(0);
		int count = 0;
		while (input.contains(element)) {
			input.remove(element);
			count++;
		}
		System.out.println("Frequency of " + element + " \t: " + count);
	}

	void freqOfAllElements(String input) {
		String[] inputArr = input.split(" ");
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(inputArr));
		while (inputList.size() > 0) {
			freqOfElement(inputList);
		}
	}

	public static void main(String[] args) {
		String input = "hi hello how are you how are your partner how hi is your mother";
		Program1_FrequencyOfWordsInString freqOfWords = new Program1_FrequencyOfWordsInString();
		freqOfWords.freqOfAllElements(input);
		System.out.println("--------------------\n");
		freqOfWords.freqUsingRemoveAll(input);
	}

	//Method2
	void freqUsingRemoveAll(String input) {
		String[] strArray = input.split(" ");
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(strArray));
		System.out.println(al);
		while (al.size() > 0) {
			String temp = al.get(0);
			int initialSize = al.size();
			if (al.contains(temp)) {
				al.removeAll(Arrays.asList(temp));
			}
			System.out.println("Frequency of " + temp + " \t: " + (initialSize - al.size()));
		}
	}

}
