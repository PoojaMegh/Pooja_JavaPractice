/*Write a method that returns a word with the maximum sum digit.
	String str = "H2i H2el4lo T5aru6n G4lob4ant I3n4di8a P1une"
	output : I3n4di8a
*/

package practice.pooja;

public class MaxDigitSumWord {
	String maxDigitSumWord(String[] input) {
		int maxSum = 0;
		String output = "";
		for (int index = 0; index < input.length; index++) {
			String word = input[index];
			int dSum = digitSum(word);

			if (dSum > maxSum) {
				maxSum = dSum;
				output = replaceDigit(word);
			}
		}
		return output;
	}

	int digitSum(String input) {
		int dSum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				dSum = dSum + Character.getNumericValue(ch);
			}
		}
		return dSum;
	}

	String replaceDigit(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				input = input.replace(Character.toString(ch), "");
			}
		}
		return input;
	}

	public static void main(String[] args) {
		String input = "H2i H2el4lo T5aru6n G4lob4ant I3n4di8a P1une";
		String[] inputArr = input.split(" ");
		System.out.println(new MaxDigitSumWord().maxDigitSumWord(inputArr));
	}
}
