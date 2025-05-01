/*
Find Frequency of each word from given String
input : hi techno hello techno hi techno gm
output : hi -> 2
         techno -> 3
         hello -> 1
         gm -> 1
*/

package javaProgramPractice.pooja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Assignment42_Program_2 {

//Using Array---------------------------------------------------

	void frequencyUsingArray(String inputstr) {
		String[] input = inputstr.split(" ");
		System.out.println("\n---------- Occurence of each word using Array -----------\n");
		for (int i = 0; i < input.length; i++) {
			String word = input[i];
			int count = 0;
			for (int j = 0; j < input.length; j++) {
				if (word.equals(input[j])) {
					count++;
					input[j] = "0";
				}
			}
			if (!word.equals("0")) {
				System.out.println("Frequency of '" + word + "' : " + count);
			}
		}
	}

//Using Array List--------------------------------------------------	

	void frequencyUsingArrayList(String input) {
		List<String> inputList = new ArrayList<>(Arrays.asList(input.split(" ")));
		System.out.println("\n---------- Occurence of each word using Array List -----------\n");

		while (inputList.size() > 0) {
			String word = inputList.get(0);
			int count = 0;
			while (inputList.contains(word)) {
				inputList.remove(word);
				count++;
			}
			System.out.println("Frequency of '" + word + "' : " + count);
		}
	}

//Using Hash Map---------------------------------------------------

	void frequencyUsingHMap(String input) {
		String[] inputArr = input.split(" ");
		Map<String, Integer> inputHMap = new LinkedHashMap<String, Integer>();
		System.out.println("\n---------- Occurence of each word using Hash Map -----------\n");

		for (String word : inputArr) {
			if (inputHMap.containsKey(word)) {
				int count = inputHMap.get(word);
				inputHMap.put(word, count + 1);
			} else {
				inputHMap.put(word, 1);
			}
		}
		for (String key : inputHMap.keySet()) {
			System.out.println("Frequency of '" + key + "' : " + inputHMap.get(key));
		}
	}

//Input From User---------------------------------------------------

	String input() {
		System.out.println("Enter input string : ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		return input;
	}

//Main Method ------------------------------------------------------------

	public static void main(String[] args) {
		Assignment42_Program_2 word = new Assignment42_Program_2();
		String input = word.input();
		word.frequencyUsingArray(input);
		word.frequencyUsingArrayList(input);
		word.frequencyUsingHMap(input);
	}

}
