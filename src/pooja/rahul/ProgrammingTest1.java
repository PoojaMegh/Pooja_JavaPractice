package pooja.rahul;

public class ProgrammingTest1 {
	
	void getSumOfDigits(String str) { // Program2
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				int num1 = Character.getNumericValue(str.charAt(index));
				sum = sum+num1;
			}
		}
		System.out.println("Sum of all digits in Sting '"+str+ "' is : " + sum);
	}
	
	public static void main(String[] args) {
		new ProgrammingTest1().getSumOfDigits("1Techno5Cred7its");
	}
}
