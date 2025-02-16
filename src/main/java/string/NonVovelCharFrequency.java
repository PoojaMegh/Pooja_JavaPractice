/*Assigment-23 : 18th May'2023
 * Program 2 : WAP to return a name from given array having maximum occurance of given character considering name should not start with vowel.
input : {"aashvi", "aakanksha", "arpita", "natwar" ,"anirudhha","aaditya"}, 'a'
output : natwar -> 2*/

package string;

public class NonVovelCharFrequency {

	void nonVovelMaxCharOccurance(String[] name, char ch) {
		MaximumCharacterOccurance maxCharOccurance = new MaximumCharacterOccurance();

		int charFrequency = 0;
		String maxFrequencyName = "";
		for (int index = 0; index < name.length; index++) {
			if (name[index].charAt(0) != 'a' && name[index].charAt(0) != 'e' && name[index].charAt(0) != 'i'
					&& name[index].charAt(0) != 'o' && name[index].charAt(0) != 'u') {
				int frequency = maxCharOccurance.getCharFrquency(name[index], ch);
				if (frequency > charFrequency) {
					charFrequency = frequency;
					maxFrequencyName = name[index];
				}
			}
		}
		System.out.println("Name with max char :" + maxFrequencyName + " and count of charachter '" + ch + "' is : "
				+ charFrequency);
	}

	public static void main(String[] args) {
		String[] input = { "aashvi", "aakanksha", "arpita", "natwar", "anirudhha", "aaditya" };
		new NonVovelCharFrequency().nonVovelMaxCharOccurance(input, 'a');
	}
}