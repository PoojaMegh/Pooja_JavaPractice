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
package javaProgramPractice.pooja;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment37_Program_1 {
	
	void freqOfElement(ArrayList<String> input) {
		String element = input.get(0);
		int count = 0;
		while(input.contains(element)) {
			input.remove(element);
			count++;
		}
		System.out.println("Frequency of " + element + " : " + count);
	}
	
	void freqOfAllElements(String input) {
		String[] inputArr = input.split(" ");
		ArrayList<String> inputList = new ArrayList<>(Arrays.asList(inputArr));
		while(inputList.size()>0) {
			freqOfElement(inputList);
		}
	}
	

	public static void main(String[] args) {
		Assignment37_Program_1 collection = new Assignment37_Program_1();
		String input = "hi hello how are you how are your partner how hi is your mother";
		collection.freqOfAllElements(input);
	}
}
