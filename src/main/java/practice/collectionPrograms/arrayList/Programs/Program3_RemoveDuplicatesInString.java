/*
Remove duplicate, it should have only one occurrence per word.
String str = "hi hello pooja how are you how are your partner how hi is your mother";
output -> hello pooja you are partner how hi is your mother
*/

package practice.collectionPrograms.arrayList.Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Program3_RemoveDuplicatesInString {

	public static void main(String[] args) {
		String input = "hi hello pooja how are you how are your partner how hi is your mother";
		String[] inputArr = input.split(" ");
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(inputArr));
		System.out.println(inputList);
		
		LinkedHashSet<String> inputSet = new LinkedHashSet<String>(inputList);
		ArrayList<String> inputUniqueList = new ArrayList<String>(inputSet);
		System.out.println(inputUniqueList);
		for (String word : inputUniqueList) {
			System.out.println(word);
		}
	}
}
