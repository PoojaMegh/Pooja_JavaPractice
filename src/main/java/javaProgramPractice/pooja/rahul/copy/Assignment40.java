/*Assigment-40 : 23rd Jun'2023

Return Unique List of elements from 2 ArrayList.
arr1 = [10,12,4,7,11,34];
arr2 = [44,10,34,54,99,4];

output : [10,12,4,7,11,34,44,54,99]
hint : use removeAll and addAll method.*/

package javaProgramPractice.pooja.rahul.copy;

import java.util.Arrays;
import java.util.ArrayList;

public class Assignment40 {

	public static void main(String[] args) {
		Integer[] arr1 = { 10, 12, 4, 7, 11, 34 };
		Integer[] arr2 = { 44, 10, 34, 54, 99, 4 };
		ArrayList<Integer> al1 = new ArrayList<Integer>(Arrays.asList(arr1));
		ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(arr2));
		al2.removeAll(al1);
		al1.addAll(al2);
		System.out.println(al1);
	}
}
