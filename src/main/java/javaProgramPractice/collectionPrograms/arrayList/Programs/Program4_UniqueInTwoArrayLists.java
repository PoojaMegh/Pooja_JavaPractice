/*Return Unique List of elements from 2 ArrayList.
	arr1 = [10,12,4,7,11,34];
	arr2 = [44,10,34,54,99,4];
	
	output : [10,12,4,7,11,34,44,54,99]
hint : use removeAll and addAll method.
 */

package javaProgramPractice.collectionPrograms.arrayList.Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class Program4_UniqueInTwoArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,12,4,7,11,34));
		System.out.println("First list : \t" + list1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(44,10,34,54,99,4));
		System.out.println("Second list : \t" + list2);

		list2.removeAll(list1);
		list1.addAll(list2);
		
		System.out.println("\nUnique list of elements from both input lists : \n" + list1);
	}

}
