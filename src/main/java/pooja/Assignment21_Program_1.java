/*From the given Array, print all the name which start with vowel.

input = {"Tirth","Aashvi","Harsh","Janvi","Isha","Rahay"}
output : Aashvi
         Isha
*/

package pooja;

public class Assignment21_Program_1 {
	
	boolean isNmSrtWithVowel(String input) {
		input = input.toLowerCase();
		char ch = input.charAt(0);
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			return true;
		else
			return false;
	}
	
	void namesSrtWithVowel(String[] input) {
		System.out.println("Names starting with vowel are : ");
		for(int index=0; index<input.length; index++) {
			String name = input[index];
			if(isNmSrtWithVowel(name)) {
				System.out.println(name);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] input = {"Tirth","Aashvi","Harsh","Janvi","Isha","Rahay"};
		new Assignment21_Program_1().namesSrtWithVowel(input);
	}
}
