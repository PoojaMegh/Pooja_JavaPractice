/*Program 2:  
Print all the characters which are non repetative using (originalLength - newLength) logic. 
input : "technocredits";
output : hnordis

Program 3:  
Print all the characters which are non repetative using (indexOf() and lastIndexOf()) logic. 
input : "technocredits";
output : hnordis
*/

package practice.pooja.rahul;

public class NonRepetativeCharachters {

	void printNonRepetativeUsingOrgIndexNewIndex(String str) {

		while (str.length() > 0) {
			char ch = str.charAt(0);
			int originalLength = str.length();
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();
			if ((originalLength - newLength) == 1) {
				System.out.println(ch);
			}
		}
	}

	void printNonRepetativeUsingIndexOfAndLastIndexOf(String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int num1 = str.indexOf(ch);
			int num2 = str.lastIndexOf(ch);
			if (num1 == num2) {
				System.out.println(ch);
			}
		}
	}

	public static void main(String[] args) {
		NonRepetativeCharachters nonRepetativeCharachters = new NonRepetativeCharachters();
		System.out.println("===================Program1========================");
		nonRepetativeCharachters.printNonRepetativeUsingOrgIndexNewIndex("technocredits");
		System.out.println("===================Program2========================");
		nonRepetativeCharachters.printNonRepetativeUsingIndexOfAndLastIndexOf("technocredits");
	}
}