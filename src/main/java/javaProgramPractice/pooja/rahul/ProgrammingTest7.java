/*@all PROGRAMMING TEST 7
Write a method that returns a word with the maximum sum digit.
String str = "H2i H2el4lo T5aru6n G4lob4ant I3n4di8a P1une"
output : I3n4di8a
outputwithout digit : India*/

package javaProgramPractice.pooja.rahul;

public class ProgrammingTest7 {

	String wordMaxSumDigit(String[] str) {
		String maxSumDigitWord = "";
		int sum = 0;
		for (int index = 0; index < str.length; index++) {
			int wordSum = 0;
			String word = str[index];
			for (int j = 0; j < word.length(); j++) {
				if (Character.isDigit(word.charAt(j))) {
					wordSum = wordSum + Character.valueOf(word.charAt(j));
				}
			}
			if (wordSum > sum) {
				sum = wordSum;
				maxSumDigitWord = word;
			}
		}
		return maxSumDigitWord;
	}

	void withoutDigit(String str) {
		char[] ch = str.toCharArray();
		String word = "";
		for (char character : ch) {
			if (!Character.isDigit(character)) {
				word += character;
			}
		}
		System.out.println(word);
	}

	public static void main(String[] args) {
		String str = "H2i H2el4lo T5aru6n G4lob4ant I3n4di8a P1une";
		String[] input = str.split(" ");
		ProgrammingTest7 pr7 = new ProgrammingTest7();
		String output = pr7.wordMaxSumDigit(input);
		System.out.println(output);
		pr7.withoutDigit(output);
	}
}
