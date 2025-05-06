/*Print all the characters which are non repetative using (originalLength - newLength) logic. 
input : "technocredits";
output : hnordis
*/

package javaProgramPractice.pooja;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment19_Program_2 {
	
	void freqOfSingleChar(String input) {
		System.out.println("Non repetative characters in given string '" + input + "' are --> ");
		
		while(input.length()>0) {
				char ch = input.charAt(0);
				int originalLength = input.length();
				input = input.replace(String.valueOf(ch), "");
				int newLength = input.length();
				int charFreq = originalLength - newLength;
				if(charFreq == 1) {
					System.out.print(ch);
				}
			}
		}

	// Using Map
	static void freqUsingMap(String  input){
		Map<Character,Integer> freqMap = new LinkedHashMap<>();
		int i=0;
		while(i<input.length()){
			char ch = input.charAt(i);
			freqMap.put(ch, freqMap.getOrDefault(ch,0)+1);
			i++;
		}
		for (Map.Entry<Character,Integer> entry : freqMap.entrySet()){
			if(entry.getValue()==1){
				System.out.print(entry.getKey());
			}
		}
	}
	public static void main(String[] args) {
		new Assignment19_Program_2().freqOfSingleChar("technocredits");
		System.out.println();
		freqUsingMap("technocredits");
	}
}
