package javaProgramPractice.pooja;

public class Assignment12 {
	void printRevString(String input) {
		String output = "";
		char ch;
		System.out.println("Original String is : " + input);
		
		for(int index=0; index<input.length(); index++) {
			ch = input.charAt(index);
			output = ch+output;
		}
		System.out.println("Reversed String is : " + output);
	}
	
	public static void main(String[] args) {
		Assignment12 assignment12 = new Assignment12();
		String str = "Pooja @ technocredits";
		assignment12.printRevString(str);
	}
}
