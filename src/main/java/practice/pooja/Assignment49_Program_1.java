/*
Write a program to Find Frequency of given word from given file (Sample.text)
input file : Sample.text
Word : techno
Output : 
3 : Hi Hello Techno Hi Techno Hello Techno
6: Hi Hello Techno Hi Techno Hello Techno Techno Techno Techno
4 : Hi Hello Techno Hi Techno Hello Techno Techno
Total frequency of word "techno" in given file : 13
*/

package practice.pooja;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment49_Program_1 {
	static int totalCount = 0;
	
	static void freqOfWord(String input) {
		String word = "techno";
		String[] inputArr = input.split(" ");
		int count = 0;
		for(String str : inputArr) {
			str = str.toLowerCase();
			if (str.equals(word)) {
				count++;
				totalCount++;
			}
		}
		if(count>0)
			System.out.println("Frequency of word '" + word + "' = " + count + " : " + input);
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File(".//Sample.txt");
		Scanner scanner = new Scanner(file);
		while(scanner.hasNext()) {
			freqOfWord(scanner.nextLine());
		}
		System.out.println("Total frequency of word 'techno' in given file : " + totalCount);
		scanner.close();
	}
}
