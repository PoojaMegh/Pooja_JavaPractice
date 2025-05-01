/*WAP to return a name from given array having maximum occurance of given character.
input : {"aashvi", "aakanksha", "arpita", "natwar" ,"anirudhha","aaditya"}, 'a'
output : aakanksha -> 4
*/
package javaProgramPractice.pooja;

import java.util.Arrays;

public class Assignment23_Program_1 {
	
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
			int fCount = getFreqOfChar(name, ch);
			if (maxFreq<fCount) {
				maxFreq = fCount;
				outputName = name;
			}
		}	
		System.out.print("Name from given list having maximum occurance of character '" + ch + "' is : \nName --> " + outputName + "\nFrequency --> " + maxFreq);
	}
	
	public static void main(String[] args) {
		String[] input = {"aashvi", "aakanksha", "arpita", "natwar" ,"anirudhha","aaditya"};
		char ch = 'a';
		System.out.println("Input name list : " + Arrays.toString(input));
		new Assignment23_Program_1().maxCharName(input, ch);
	}

}
