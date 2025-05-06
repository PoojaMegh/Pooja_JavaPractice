/*
WAP to print a single occurrence element from the array in Java?
i/p  : {5,8,1,2,4,3,2,1}
o/p : {5,8,4,3}
*/

package javaProgramPractice.arrayMethods;

import java.util.*;

public class SingleOccuranceElementInArray {

    public static void printSingleOccurenceElements(int[] input){
        Map<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> output = new LinkedList<>();
        for(int n : input){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                output.add(entry.getKey());
            }
        }
        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Output : " + output);
    }

    public static void main(String[] args) {
        int[] input = {5, 8, 1, 2, 4, 3, 2, 1};
        printSingleOccurenceElements(input);
    }
}
