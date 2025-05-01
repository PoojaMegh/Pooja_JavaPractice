/*
WAP to print a single occurrence element from the array in Java?
i/p  : {5,8,1,2,4,3,2,1}
o/p : {5,8,4,3}
*/

package javaProgramPractice.arrayMethods;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SingleOccuranceElementInArray {

    public static void printSingleOccurenceElements(int[] arr){
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();

        for(int n : arr){
            freqMap.put(n, freqMap.getOrDefault(n,0)+1);
        }

        System.out.print("{");
        boolean first = true;
        for (Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            if(entry.getValue() == 1){
                if(!first){
                    System.out.print(", ");
                }
                System.out.print(entry.getKey());
                first = false;
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] input = {5, 8, 1, 2, 4, 3, 2, 1};
        printSingleOccurenceElements(input);
    }
}
