/*Assignment 25 :Program 3 : WAP to verify whether given String is palindrom.

input : Naman
output : naman is a palindrom string.

input : madam
output : madam is a palindrom string.

input : technot
output : technot is not a palindrom string.


String getReverseString(int input){

}


main(){
	String input = "Naman";
	String reverseName = new Test().getReverseString(input);
	if(input.equalsIgnoreCase(reverseName))
		sout("Palindraom");
}*/

package practice.pooja.rahul;

public class Assignment25PaliondromeString {
	
	String getReverseString(String str) {
		String revString = "";
		for(int index = str.length() - 1; index >=0 ; index--) {
			revString = revString + str.charAt(index);
		}
		return revString;
	}

	public static void main(String[] args) {
		String input = "Madam";
		String reverseName = new Assignment25PaliondromeString().getReverseString(input);
		if(input.equalsIgnoreCase(reverseName))
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not palindrome");
	}
}
