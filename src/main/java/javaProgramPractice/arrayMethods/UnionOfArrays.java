/*
Write a program to return Union of two ArrayList without duplicates.
i/p1: {‘A’, ‘M’, ‘B’, ‘K’, ‘A’}
i/p2: {‘A’, ‘H’, ‘T’, ‘K’, ‘S’}
o/p : {‘A’, ‘M’, ‘B’, ‘K’, ‘H’, ‘T’, ‘S’}
*/

package javaProgramPractice.arrayMethods;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.*;

public class UnionOfArrays {

    public static void main(String[] args) {
        List<Character> list1 = Arrays.asList('A','M','B','K','A');
        List<Character> list2 = Arrays.asList('A','H','T','K','S');

        Set<Character> unionSet = new LinkedHashSet<>();
        unionSet.addAll(list1);
        unionSet.addAll(list2);

        System.out.println("Union without duplicates : " + unionSet);
    }


}
