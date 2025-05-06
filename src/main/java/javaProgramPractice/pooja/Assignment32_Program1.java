/*WAP to return an array of unique elements from a given input, each element only once. 
One method to take int array & return int array, another method which takes string array and return string array.
Input    : {19, 8, 0, 8, 60, 56, 97, 0,97, 33,19, 60, 0}
Output : {19, 8, 0, 60, 56, 97, 33}

Input    : {"Techno", "Credits", "Techno", "TechnoCredits", "Hi", "Credits", "TechnoCredits"}
Output : {"Techno", "Credits", "TechnoCredits","Hi"}
*/
package javaProgramPractice.pooja;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment32_Program1 {
		
	int[] getUniqueElementArrayNum(int[] input){
		int[] temp = new int[input.length];
		int index = 0;
		for(int i = 0 ; i < input.length ; i++) {
			boolean isUniqueNum = true;
			for(int j = 0 ; j < index ; j++) {
				if(input[i] == temp[j]) {
					isUniqueNum = false;
					break;
				}
			}
			if(isUniqueNum) {
				temp[index++] = input[i];
			}
		}
		int[] output = new int[index];
		for(int i = 0 ; i < output.length ; i++) {
			output[i] = temp[i];
		}
		return output;
	}
	
	String[] getUniqueElementArrayString(String[] input) {
		String[] temp = new String[input.length];
		int index = 0;
		for(int i = 0 ; i < input.length ; i++) {
			boolean isUniqueNum = true;
			for(int j = 0 ; j < index ; j++) {
				if(input[i].equals(temp[j])) {
					isUniqueNum = false;
					break;
				}
			}
			if(isUniqueNum) {
				temp[index++] = input[i];
			}
		}
		String[] output = new String[index];
		for(int i = 0 ; i < output.length ; i++) {
			output[i] = temp[i];
		}
		return output;
	}



	// Method for int array
	public  int[] getUniqueIntArray(int[] input) {
		Set<Integer> uniqueSet = new LinkedHashSet<>();
		for (int num : input) {
			uniqueSet.add(num);
		}

		// Convert Set<Integer> to int[]
		int[] result = new int[uniqueSet.size()];
		int i = 0;
		for (int num : uniqueSet) {
			result[i++] = num;
		}
		return result;
	}

	// Method for String array
	public String[] getUniqueStringArray(String[] input) {
		Set<String> uniqueSet = new LinkedHashSet<>(Arrays.asList(input));
		return uniqueSet.toArray(new String[0]);
	}

	public static void main(String[] args) {
		Assignment32_Program1 assignment32 = new Assignment32_Program1();
		int[] input = {19,8,0,8,60,56,97,0,97,33,19,60,0};
		System.out.println("Array : " + Arrays.toString(input));
		System.out.println("Unique Array : " + Arrays.toString(assignment32.getUniqueElementArrayNum(input)));
		String[] input1 = {"Techno", "Credits", "Techno", "TechnoCredits", "Hi", "Credits", "TechnoCredits"};
		System.out.println("Array : " + Arrays.toString(input1));
		System.out.println("Unique Array : " + Arrays.toString(assignment32.getUniqueElementArrayString(input1)));

		// Test int array
		int[] intInput = {19, 8, 0, 8, 60, 56, 97, 0, 97, 33, 19, 60, 0};
		int[] uniqueInts = new Assignment32_Program1().getUniqueIntArray(intInput);
		System.out.println("Unique Integers: " + Arrays.toString(uniqueInts));

		// Test String array
		String[] strInput = {"Techno", "Credits", "Techno", "TechnoCredits", "Hi", "Credits", "TechnoCredits"};
		String[] uniqueStrings = new Assignment32_Program1().getUniqueStringArray(strInput);
		System.out.println("Unique Strings: " + Arrays.toString(uniqueStrings));
	}
}
