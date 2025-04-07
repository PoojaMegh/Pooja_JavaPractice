package practice.pooja.technocredits;

// Accepted : String , int, char, short, byte
// double, float, long, boolean

public class SwitchExample1 {

	void operation(String op) {

		/*
		 * if(op.toUpperCase().equals("CREDITS")) {
		 * 
		 * }else if(op.equalsIgnoreCase("DEBIT")) {
		 * 
		 * }else if(op.equalsIgnoreCase("PRINTBALANCE")) {
		 * 
		 * }else { System.out.println("Not a valid operation"); }
		 */

		op = op.toUpperCase();
		switch (op) {
		case "DEBIT":
			System.out.println("User wants to debit some amount");
			break;

		case "CREDIT":
			System.out.println("User wants to credit some amount");
			break;

		case "PRINT":
			System.out.println("User wants to print some amount");
			break;

		default:
			System.out.println("Not a valid operation");
			break;
		}
		System.out.println("end");
		long s = 10;
		char ch = 'a';

	}

	void countVowels(String str) { //technocredits
		int aCount = 0, eCount = 0, iCount = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			switch (ch) {
				case 'A':
				case 'a':
					aCount++;
					break;

				case 'E':
				case 'e':
					eCount++;
					break;
	
				case 'I':
				case 'i':
					iCount++;
					break;
			}
		}

	}

	public static void main(String[] args) {
		new SwitchExample1().operation("ABCD");
	}
}
// it finds the case and start execution from that case till break , if break is not there will execute till end