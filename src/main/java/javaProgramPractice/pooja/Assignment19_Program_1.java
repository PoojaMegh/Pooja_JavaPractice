/*Find the frequency of each character using single while loop logic.
hint : originalLength - newLength*/

package javaProgramPractice.pooja;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment19_Program_1 {
	
	void freqOfSingleChar(String input, char ch) {
		System.out.println("Frequency of '" + ch + "' in given string '" + input + "' is --> ");
		
		while(input.length()>0) {
				char ch1 = input.charAt(0);
				int originalLength = input.length();
				input = input.replace(String.valueOf(ch1), "");
				int newLength = input.length();
				int charFreq = originalLength - newLength;
				if(ch1==ch) {
					System.out.println(charFreq);
				}
			}
		}

	//Using Map
	static void freqUsingMap(String input){
		Map<Character, Integer> freqMap = new LinkedHashMap<>();

		int i=0;
		while (i < input.length()){
			char ch = input.charAt(i);
			freqMap.put(ch, freqMap.getOrDefault(ch,0)+1);
			i++;
		}

		for(Map.Entry<Character,Integer> entry : freqMap.entrySet()){
			System.out.println("Frequency of character '" + entry.getKey() + "' ==> " + entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		new Assignment19_Program_1().freqOfSingleChar("technocredits", 's');
		new Assignment19_Program_1().freqOfSingleChar("javaProgramPractice/pooja", 'o');
		freqUsingMap("technocredits");
	}
}
