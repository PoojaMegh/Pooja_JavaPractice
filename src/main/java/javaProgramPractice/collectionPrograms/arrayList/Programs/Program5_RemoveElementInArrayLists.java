/*Remove all occurrence of given number from ArrayList.
	
	input : [3,4,7,2,3,3,77,45,67,3]
	        remove 3 
	output : 4,7,2,77,45,67
	
Hint : use RemoveAll
*/

package javaProgramPractice.collectionPrograms.arrayList.Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program5_RemoveElementInArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,4,7,2,3,3,77,45,67,3));
		System.out.println("Input array list : " + input);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to be removed : ");
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(scanner.nextInt()));
		
		input.removeAll(num);
		System.out.println("Input array list after removing all occurence of " + num.get(0) + " :\n " + input);
		scanner.close();

	}

}
