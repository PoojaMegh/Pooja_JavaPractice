package practice.pooja;

public class Assignment18_Program_2 {
	
	void evenCharPrint(String input) {
		System.out.println("Even characters of given input string '" + input + "' are : ");
		for(int index=1; index<input.length(); index +=2) {
			char ch = input.charAt(index);
			System.out.println(ch);
		}
	}
	
	public static void main(String[] args) {
		new Assignment18_Program_2().evenCharPrint("technocredits");
	}
}
