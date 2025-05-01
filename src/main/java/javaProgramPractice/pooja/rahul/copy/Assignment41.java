/*Assigment-41 : 25th Jun'2023
Remove all occurance of given number from ArrayList.
input : [3,4,7,2,3,3,77,45,67,3]
        remove 3 
output : 4,7,2,77,45,67
Hint : use RemoveAll*/

package javaProgramPractice.pooja.rahul.copy;

import java.util.Arrays;
import java.util.ArrayList;

public class Assignment41 {

	public static void main(String[] args) {
		Integer[] num = { 3, 4, 7, 2, 3, 3, 77, 45, 67, 3 };
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(num));
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(3);
		al.removeAll(number);
		System.out.println(al);
	}
}