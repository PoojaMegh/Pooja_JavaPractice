/*a. create a method to return first occurrence of given character from given string.
b. create a method to return last occurrence of given character from given string.
c. create a method to return true if given character is found from given string else
	return false and print return value in main method.
*/

package javaProgramPractice.pooja;

public class Assignment18_Program_3 {
	
	static boolean isCharPresent;

	int firstOccurance(String input, char ch) {
		int i = 0;
		while (i <= input.length()) {
			if (ch == input.charAt(i)) {
				break;
			}
			i++;
		}
		return i + 1;
	}

	int lastOccurance(String input, char ch) {
		int count = 1;
		int i = input.length() - 1;
		while (i >= 0) {
			if (ch == input.charAt(i)) {
				break;
			}
			i--;
			count++;
		}
		return count;
	}
	
	Boolean isCharPresentIn(String input, char chr) {

		int i = 0;
		while (i < input.length() - 1) {
			if (chr == input.charAt(i)) {
				isCharPresent = true;
				break;
			}
			i++;
		}
		return isCharPresent;
	}

	public static void main(String[] args) {
		Assignment18_Program_3 CharPresent = new Assignment18_Program_3();
		String input = "tecno";
		char ch = 'c';
		int place = CharPresent.firstOccurance("techno" , 'e');
		System.out.println("Character " + ch + " is found at place " + place + " in string ->" + input);
		System.out.println("Character " + ch + " is found at place " + CharPresent.lastOccurance(input, ch)
				+ " from last in string-> " + input);
		boolean Flagfound = CharPresent.isCharPresentIn(input, ch);
		if (Flagfound == true)
			System.out.println("Character " + ch + " is found in string -> " + input);
		else
			System.out.println("Character " + ch + " is not found in string-> " + input);
	}
}
