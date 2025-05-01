/*Assigment-32 : 11th Jun'2023 [Method Overloading]

WAP to return an array of unique elements from a given input, each element only once. 
One method to take int array & return int array, another method which takes string array and return string array.
Input    : {19, 8, 0, 8, 60, 56, 97, 0,97, 33,19, 60, 0}
Output : {19, 8, 0, 60, 56, 97, 33}

Input    : {"Techno", "Credits", "Techno", "TechnoCredits", "Hi", "Credits", "TechnoCredits"}
Output : {"Techno", "Credits", "TechnoCredits","Hi"}*/

package javaProgramPractice.pooja.rahul.copy;

public class Assignment32 {

	int getCount(int[] array) {
		int count = array.length;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					count--;
					break;
				}
			}
		}
		return count;
	}

	void printNonRepetativeIntegerArray(int[] array) {
		int[] output = new int[getCount(array)];
		int m = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j] && array[i] != -99) {
					array[j] = -99;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {

			if (array[i] != -99) {
				output[m] = array[i];
				m++;
			}
		}
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

	int getStringArrayCount(String[] str) {
		int count = str.length;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					count--;
					break;
				}
			}
		}
		return count;
	}

	void printNonRepetativeStringArray(String[] str) {
		String[] output = new String[getStringArrayCount(str)];
		int m = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j]) && str[i] != "-99") {
					str[j] = "-99";
				}
			}
		}
		for (int i = 0; i < str.length; i++) {

			if (str[i] != "-99") {
				output[m] = str[i];
				m++;
			}
		}
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

	public static void main(String[] args) {
		int[] input = { 19, 8, 0, 8, 60, 56, 97, 0, 97, 33, 19, 60, 0 };
		String[] str = { "Techno", "Credits", "Techno", "TechnoCredits", "Hi", "Credits", "TechnoCredits" };
		System.out.println("==============Non Repetative Integer Array==============");
		new Assignment32().printNonRepetativeIntegerArray(input);
		System.out.println("==============Non Repetative String Array==============");
		new Assignment32().printNonRepetativeStringArray(str);
	}
}