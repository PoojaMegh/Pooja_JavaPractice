/*Assigment-23 : 18th May'2023

Program 1 : WAP to return a name from given array having maximum occurance of given character.
input : {"aashvi", "aakanksha", "arpita", "natwar" ,"anirudhha","aaditya"}, 'a'
output : aakanksha -> 4*/

package practice.pooja.rahul;

public class MaximumCharacterOccurance {

	void maxCharOccurance(String[] name, char ch) {
		int charFrequency = 0;
		String maxFrequencyName = "";
		for (int index = 0; index < name.length; index++) {
			int frequency = getCharFrquency(name[index], ch);
			if (frequency > charFrequency) {
				charFrequency = frequency;
				maxFrequencyName = name[index];
			}
		}
		System.out.println("Name with max char :" + maxFrequencyName + " and count of charachter '" + ch + "' is : "
				+ charFrequency);
	}

	int getCharFrquency(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (ch == str.charAt(index)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String[] input = { "aashvi", "aakanksha", "arpita", "natwar", "anirudhha", "aaditya" };
		new MaximumCharacterOccurance().maxCharOccurance(input, 'a');
	}
}