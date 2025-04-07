package practice.pooja.rahul.copy;

public class CharFrequencyWithNonRepetation {
	void allCharFrequency(String str) {
		while (str.length() > 0) {
			char ch = str.charAt(0);
			for (int index = 0; index < str.length(); index++) {// 0//1//2
				ch = str.charAt(0);
				givenCharFrequency(str, ch);
				str = str.replaceAll(String.valueOf(ch), "");
			}
		}
	}

	void givenCharFrequency(String str, char ch) {
		int count = 0;
		for (int j = 0; j < str.length(); j++) {
			if (ch == str.charAt(j)) {
				count++;
			}
		}
		System.out.println(ch + "-" + count);
	}

	public static void main(String[] args) {
		new CharFrequencyWithNonRepetation().allCharFrequency("technocredits");
	}
}
