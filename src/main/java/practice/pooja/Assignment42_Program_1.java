/*
Find Frequency of each character from given String.
input : technocredits
output : t -> 2
         e -> 2
*/

package practice.pooja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Assignment42_Program_1 {
	
//Using String--------------------------------------------------
	
	void frequencyUsingString(String input) {
		System.out.println("\n---------- Occurence of each character using String Methods -----------\n");
		while (input.length() > 0) {
			char ch = input.charAt(0);
			int count = 0;
			for (int index = 0; index < input.length(); index++) {
				if (ch == input.charAt(index))
					count++;
			}
			System.out.println("Frequency of '" + ch + "' : " + count);
			input = input.replace(String.valueOf(ch), "");
		}
	}
	
//Using Array---------------------------------------------------
	
	void frequencyUsingArray(String input) {
		System.out.println("\n---------- Occurence of each character using Array -----------\n");
		char[] inputArr = input.toCharArray();
		for(int i=0; i<inputArr.length; i++) {
			char ch = inputArr[i];
			int count = 0;
			for(int j=0; j<inputArr.length; j++) {
				if(ch == inputArr[j]) {
					count++;
					inputArr[j] = '0';
				}
			}
			if(ch != '0') {
				System.out.println("Frequency of '" + ch + "' : " + count);
			}
		}
	}
	
//Using Array List--------------------------------------------------	
	
	void frequencyUsingArrayList(String input) {
		List<String> inputList = new ArrayList<>(Arrays.asList(input.split("")));
		System.out.println("\n---------- Occurence of each character using Array List -----------\n");
		
		while(inputList.size()>0) {
			String word = inputList.get(0);
			int count = 0;
			while(inputList.contains(word)) {
				inputList.remove(word);
				count++;
			}
			System.out.println("Frequency of '" + word + "' : " + count);
		}
	}
	
//Using Hash Map---------------------------------------------------
	
	void frequencyUsingHMap(String input) { 
		String[] inputArr = input.split("");
	    HashMap<String,Integer> inputHMap = new HashMap<>();
	    System.out.println("\n---------- Occurence of each character using Hash Map -----------\n");
	    
	    for(int i= 0 ; i< inputArr.length ; i++) {
	         if(inputHMap.containsKey(inputArr[i])) {
	            int count = inputHMap.get(inputArr[i]);
	            inputHMap.put(inputArr[i],count+1);
	         } else {
	        	 inputHMap.put(inputArr[i],1);
	         }
	      }
	    for (String key: inputHMap.keySet()){
            System.out.println("Frequency of '" + key + "' : " + inputHMap.get(key));
        }
	 }

//Input From User---------------------------------------------------
	
		String input() {
			System.out.println("Enter input string : ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			scanner.close();
			return input;
		}

//Main Method ------------------------------------------------------------

	public static void main(String[] args) {
		Assignment42_Program_1 word = new Assignment42_Program_1();
		String input = word.input();
		word.frequencyUsingString(input);
		word.frequencyUsingArray(input);
		word.frequencyUsingArrayList(input);
		word.frequencyUsingHMap(input);
	}

}
