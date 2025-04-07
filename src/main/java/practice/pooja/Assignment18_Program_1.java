package practice.pooja;

public class Assignment18_Program_1 {
	
	void reversePrint(String input) {
		System.out.println("Reverse string of given input string '" + input + "' is : \n");
		for(int index = input.length()-1; index>=0; index--) {
			char ch = input.charAt(index);
			System.out.print( ch );
		}
	}
	
	public static void main(String[] args) {
		new Assignment18_Program_1().reversePrint("technocredits");
	}
}
