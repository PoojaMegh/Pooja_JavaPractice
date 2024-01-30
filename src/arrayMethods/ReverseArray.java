//input : India is my country
//output : country my is India

package arrayMethods;

import java.util.Arrays;

public class ReverseArray {

	String[] revArray(String[] input) {

		String[] output = new String[input.length];
		int outputIndex = 0;
		for (int inputIndex = input.length - 1; inputIndex >= 0; inputIndex--) {
			{
				output[outputIndex] = input[inputIndex];
				outputIndex++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "India", "is", "my", "country" };
		String output = Arrays.toString(new ReverseArray().revArray(input));
		output = output.replace("[", "").replace("]", "").replace(",", "");
		System.out.println("Output : " + output);
	}

}
