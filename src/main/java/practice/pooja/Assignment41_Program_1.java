/*Remove all occurrence of given number from ArrayList.
	
	input : [3,4,7,2,3,3,77,45,67,3]
	        remove 3 
	output : 4,7,2,77,45,67
	
Hint : use RemoveAll
*/
package practice.pooja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Assignment41_Program_1 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(3,4,7,2,3,3,77,45,67,3));
		System.out.println("Input array list : " + list1);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to be removed : ");
		List<Integer> num = new ArrayList<>(Arrays.asList(scanner.nextInt()));
		
		list1.removeAll(num);
		
	    System.out.println("Input Array list after removing all occurence of " + num.get(0) + " : \n" + list1);
	    scanner.close();
	}

}
