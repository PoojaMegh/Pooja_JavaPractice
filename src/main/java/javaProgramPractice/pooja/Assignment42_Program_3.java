/*
Find Frequency of each number from given array.
input : {10,12,10,12,13,14,18,13,12,12}
output : 10 -> 2
         12 -> 4
         13 -> 2
         14 -> 1
         18 -> 1
*/

package javaProgramPractice.pooja;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment42_Program_3 {

//Using Array---------------------------------------------------

	void frequencyUsingArray(int[] input) {
		// Integer[] input = inputInt;
		System.out.println("\n---------- Occurence of each number using Array -----------\n");
		for (int i = 0; i < input.length; i++) {
			int num = input[i];
			int count = 0;
			for (int j = 0; j < input.length; j++) {
				if (num == input[j]) {
					count++;
					input[j] = 0;
				}
			}
			if (num != 0) {
				System.out.println("Frequency of " + num + " : " + count);
			}
		}
	}

//Using Hash Map---------------------------------------------------

	void frequencyUsingHMap(int[] input) {
		// String[] inputArr = input.split(" ");
		Map<Integer, Integer> inputHMap = new LinkedHashMap<Integer, Integer>();
		System.out.println("\n---------- Occurence of each number using Hash Map -----------\n");

		for (Integer num : input) {
			if (inputHMap.containsKey(num)) {
				int count = inputHMap.get(num);
				inputHMap.put(num, count + 1);
			} else {
				inputHMap.put(num, 1);
			}
		}
		for (Integer key : inputHMap.keySet()) {
			System.out.println("Frequency of '" + key + "' : " + inputHMap.get(key));
		}
	}

//Main Method ------------------------------------------------------------

	public static void main(String[] args) {
		int[] input = { 10, 12, 10, 12, 13, 14, 18, 13, 12, 12 };
		new Assignment42_Program_3().frequencyUsingArray(input);
		int[] input2 = { 10, 12, 10, 12, 13, 14, 18, 13, 12, 12 };
		new Assignment42_Program_3().frequencyUsingHMap(input2);
	}

}
