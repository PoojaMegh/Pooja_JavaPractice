/*
Find the unique word from give String.
String str = "hi hello pooja how are your how are you partner how hi is you mother";
Output :
	hello
	pooja
	your
	partner
	is
	mother
Hint : indexOf and lastIndexOf method
*/
package javaProgramPractice.pooja;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment38_Program_1 {
	
	void uniqueElement(ArrayList<String> input) {
		
		for (int index = 0; index<input.size(); index++) {
			String element = input.get(index);
			if(input.indexOf(element) == input.lastIndexOf(element)) {
				System.out.println(element);
			} 
		}
	}
	
	void uniqueAllElements(String input) {
		String[] inputArr = input.split(" ");
		ArrayList<String> inputList = new ArrayList<>(Arrays.asList(inputArr));
		uniqueElement(inputList);
	}

	public static void main(String[] args) {
		Assignment38_Program_1 collection = new Assignment38_Program_1();
		String input = "hi hello pooja how are you how are your partner how hi is you mother";
		collection.uniqueAllElements(input);
	}
}
