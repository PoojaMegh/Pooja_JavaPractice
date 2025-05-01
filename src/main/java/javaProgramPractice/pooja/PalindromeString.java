package javaProgramPractice.pooja;

public class PalindromeString {
	
	static String revString(String input) {
		String revStr = "";
		for(int index=input.length()-1; index>=0; index--) {
			revStr = revStr + input.charAt(index);
		}
		return revStr;
	}
	
	static boolean isStringPalindrome(String input) {
		String revStr = revString(input);
		String orgStr = input;
		
		if(orgStr.equalsIgnoreCase(revStr))
			return true;
		else 
			return false;
	}
}
