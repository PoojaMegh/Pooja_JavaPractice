package pooja.technocredits;

public class Assignment12 {

	String revStringPrint(String input) {
		String revString = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			revString = revString + input.charAt(index);
		}
		return revString;
	}

	public static void main(String[] args) {
		String input1 = "technocredits";
		Assignment12 assignment12 = new Assignment12();
		String output = assignment12.revStringPrint(input1);
		System.out.println("First char " + output.charAt(0));
		System.out.println("Reverse string of " + input1 + " is - " + output);
	}
}
