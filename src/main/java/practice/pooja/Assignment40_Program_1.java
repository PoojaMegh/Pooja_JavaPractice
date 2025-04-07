/*Return Unique List of elements from 2 ArrayList.
	arr1 = [10,12,4,7,11,34];
	arr2 = [44,10,34,54,99,4];
	
	output : [10,12,4,7,11,34,44,54,99]
hint : use removeAll and addAll method.
 */

package practice.pooja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment40_Program_1 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(10,12,4,7,11,34));
	  
		List<Integer> list2 = new ArrayList<>(Arrays.asList(44,10,34,54,99,4));
		list2.removeAll(list1);
		list1.addAll(list2);

	    System.out.println("Unique list of elements from both input lists : \n" + list1);
	}
}
