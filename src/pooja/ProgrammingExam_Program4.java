/*
Write a program to return Union of two ArrayList without duplicates.
	i/p1: {‘A’, ‘M’, ‘B’, ‘K’, ‘A’} 
	i/p2: {‘A’, ‘H’, ‘T’, ‘K’, ‘S’}
	o/p : {‘A’, ‘M’, ‘B’, ‘K’, ‘H’, ‘T’, ‘S’}

*/

package pooja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProgrammingExam_Program4 {
	
	void unionList() {
		ArrayList<Character> list1 = new ArrayList<Character>(Arrays.asList('A', 'M', 'B', 'K', 'A'));
		ArrayList<Character> list2 = new ArrayList<Character>(Arrays.asList('A', 'H', 'T', 'K', 'S'));
		System.out.println("List1 : " + list1);
		System.out.println("List2 : " + list2);
		  
		list1.removeAll(list2);
		list1.addAll(list2);
		Collections.sort(list1);
	
	    System.out.println("\nUnion list of elements from both input lists : \n" + list1);
	}

	public static void main(String[] args) {
		new ProgrammingExam_Program4().unionList();
	}
	
}
