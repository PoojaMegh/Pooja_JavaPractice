package pooja.rahul;

public class ReverseString {
	
	void stringReverse(String str) {
		for(int index = str.length() -1 ; index >= 0; index --) {
			System.out.print(str.charAt(index));
		}
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		reverseString.stringReverse("TechnoCredits");

	}
}
