package pooja.rahul.copy;

public class CharAndStringFunctions {
	
	void charFunction(String str) {
		for(int index =0; index < str.length(); index ++) {
			System.out.println(str.charAt(index));
		}
	}

	void frequency(String str) {
		int count = 0;
		for(int index =0; index < str.length(); index ++) {
			if(str.charAt(index) == 't'){
				count++;
			}
		}
		System.out.println("The specified character occured " +count+ " times in String " +str);
	}
	
	public static void main(String[] args) {
		CharAndStringFunctions charAndStringFunctions = new CharAndStringFunctions();
		charAndStringFunctions.charFunction("TechnoCredits");
		charAndStringFunctions.frequency("technocredits");
	}
}
