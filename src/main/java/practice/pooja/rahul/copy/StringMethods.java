/*3. Write a program with following methods. 
a. create a method to return first occurrence of given character from given string.
b. create a method to return last occurrence of given character from given string.
c. create a method to return true if given character is found from given string else return false and print return value in main method.
*/

package practice.pooja.rahul.copy;

public class StringMethods {

	void firstOccurance(String str, char ch) {
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			if (ch == str.charAt(index)) {
				System.out.println("The first occurance of given word " + ch + " found at index " + index
						+ " in given String '" + str + "'");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("There is no match for given character " + ch + " in String '" + str + "'");
		}
	}

	void lastOccurance(String str, char ch) {
		boolean flag = false;
		for (int index = str.length() - 1; index >= 0; index--) {
			if (ch == str.charAt(index)) {
				System.out.println("The last occurance of given word " + ch + " found at index " + index
						+ " in given String '" + str + "'");
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("There is no match for given character " + ch + " in String '" + str + "'");
		}
	}

	boolean checkCharacter(String str, char ch) {
		for (int index = str.length() - 1; index >= 0; index--) {
			if (ch == str.charAt(index)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		StringMethods stringMethods = new StringMethods();
		stringMethods.firstOccurance("technocredits", 't');
		stringMethods.lastOccurance("technocredits", 't');
		boolean flag = stringMethods.checkCharacter("Rahul", 't');
		System.out.println(flag);
	}
}