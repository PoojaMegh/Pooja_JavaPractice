/*WAP to return a name from given array having maximum occurance of given character considering name should not start with vowel.
input : {"aashvi", "aakanksha", "arpita", "natwar" ,"anirudhha","aaditya"}, 'a'
output : natwar -> 2
*/
package pooja;

import java.util.Arrays;

public class Assignment23_Program_2 {
	
	boolean isFirstCharVowel(String input) {
		boolean flag= false;
		char ch = input.charAt(0);
		ch = Character.toLowerCase(ch);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			flag = true;
		return flag;
	}
	
	int getFreqOfChar(String input, char ch) {
		int fCount = 0;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index)==ch)
				fCount++;
		}
		return fCount;
	}
	
	void maxCharName(String[] input, char ch) {
		String outputName = "";
		int maxFreq = 0;
		
		for(int index=0; index<input.length; index++) {
			String name = input[index];
			if(!isFirstCharVowel(name)) {
				int fCount = getFreqOfChar(name, ch);
				if (maxFreq<fCount) {
					maxFreq = fCount;
					outputName = name;
				}
			}
		}	
		System.out.print("Name not starting with vowel from given list having maximum occurance of character '" + ch + "' is : \nName --> " + outputName + "\nFrequency --> " + maxFreq);
	}
	
	public static void main(String[] args) {
		String[] input = {"aashvi", "aakanksha", "arpita", "natwar" ,"anirudhha","aaditya"};
		char ch = 'a';
		System.out.println("Input name list : " + Arrays.toString(input));
		new Assignment23_Program_2().maxCharName(input, ch);
	}

}
