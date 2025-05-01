/*Write a program that finds maximum repeating character from the string
i/p  : globant india
o/p : i

i/p  : xoriant pune
o/p : n
*/


package javaProgramPractice.string;

import java.util.HashMap;
import java.util.Map;

public class MaxRepeatingCharInString {

    public static char getMaxRepeatingChar(String str){
        Map<Character, Integer> freqMap = new HashMap<>();
        str.replace(" ", "");

        for (char c: str.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c,0)+1);
        }

        char maxChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()){
            if(entry.getValue() > maxCount){
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        String input1 = "globant india";
        String input2 = "xoriant pune";

        System.out.println("Input : " + input1 + "\nMaximum Repeating Character : " + getMaxRepeatingChar(input1));
        System.out.println("Input : " + input2 + "\nMaximum Repeating Character : " + getMaxRepeatingChar(input2));
    }

}
