/*
Remove duplicate, it should have only one occurrence per word.
String str = "hi hello pooja how are you how are your partner how hi is your mother";
output -> hello pooja you are partner how hi is your mother
*/

package pooja;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment39_Program_1 {
	
	void removeDuplicateElement(ArrayList<String> input) {
		int index = 0;
		while(index<input.size()) {
			String element = input.get(index);
			if(input.indexOf(element) == input.lastIndexOf(element)) {
				System.out.println(element);
				index++;
			} else {
				input.remove(index);
			}
		}
	}
	
	void removeDuplicateAllElements(String input) {
		String[] inputArr = input.split(" ");
		ArrayList<String> inputList = new ArrayList<>(Arrays.asList(inputArr));
		removeDuplicateElement(inputList);
	}

	public static void main(String[] args) {
		Assignment39_Program_1 collection = new Assignment39_Program_1();
		String input = "hi hello pooja how are you how are your partner how hi is your mother";
		collection.removeDuplicateAllElements(input);
	}

}
