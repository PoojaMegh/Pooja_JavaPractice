package practice.pooja;

public class Assignment11 {
	void printChar(String input) {
		for(int index=0; index<input.length(); index++) {
			System.out.println(input.charAt(index));
		}
	}
	
	void findCharFreq(String input) {
		int count = 0;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index) == 't') {
				count++;
			}
		}
		System.out.println("Count of t character in given String is : " + count);
		System.out.println("--------------------------------------");
	}
	
	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		String str = "technocredits";
		assignment11.findCharFreq(str);
		assignment11.printChar(str);
	}
}
