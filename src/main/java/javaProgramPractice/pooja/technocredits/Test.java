package javaProgramPractice.pooja.technocredits;

public class Test {

	int getFreqOfChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Test test = new Test();
		String input = "technocredits";
		char ch = 'e';
		int freqOfChar = test.getFreqOfChar(input, ch);
		System.out.println(input + " having freq of char " + ch + " = " + freqOfChar);
	}
}
