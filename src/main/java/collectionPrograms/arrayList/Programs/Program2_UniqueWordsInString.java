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
package collectionPrograms.arrayList.Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class Program2_UniqueWordsInString {

	void uniqueElement(ArrayList<String> input) {
		for(String word : input) {
			if(input.indexOf(word) == input.lastIndexOf(word)) {
				System.out.println(word);
			}
		}
	}
	
	void allUniqueElements(String input) {
		String[] inputArr = input.split(" ");
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(inputArr));
		uniqueElement(inputList);
	}
	
	
	public static void main(String[] args) {
		String input = "hi hello pooja how are you how are your partner how hi is you mother";
		Program2_UniqueWordsInString uniqueWords = new Program2_UniqueWordsInString();
		uniqueWords.allUniqueElements(input);
		
	}

}
