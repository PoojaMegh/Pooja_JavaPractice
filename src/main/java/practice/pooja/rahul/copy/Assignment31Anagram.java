/*Assignment - 31 : 7th Jun'2023
WAP to verify given string is anagram or not.
input : LISTEN
        SILENT
output : Given String is anagram.
input : HEERT
        EARTH
output : not an anagram String.*/

package practice.pooja.rahul.copy;

public class Assignment31Anagram {

	boolean isAnagram(String str1, String str2) {
		boolean flag = true;
		if (str1.length() != str2.length()) {
			flag = false;
			return flag;
		} else {
			while (str1.length() > 0) {
				char ch = str1.charAt(0);
				str1 = str1.replaceAll(Character.toString(ch), "");
				str2 = str2.replaceAll(Character.toString(ch), "");
				if (str1.length() != str2.length()) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		String str1 = "RATAN", str2 = "AATNR";
		boolean flag = new Assignment31Anagram().isAnagram(str1, str2);
		if (flag)
			System.out.println("Is anagram");
		else
			System.out.println("Is not anagram");
	}
}