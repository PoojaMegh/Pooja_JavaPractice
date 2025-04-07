/*Take 3 numbers from user, considering user can give any other input apart from number. At that time notify user by saying "Given input is not a number".
input : 10
        Techno
        12Credits
        5
        true
        Hello
        7

output : Array -> [10,5,7]   		
NOTE : write a code in main method.
*/

package practice.string;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_Eg2 {

	public static void main(String[] args) {
		int count = 0;
		int[] input = new int[3];
		
		while(count<3) {
			try {
				System.out.println("Enter a number : ");
				Scanner scanner = new Scanner(System.in);
				input[count] = scanner.nextInt();
				count++;
			}catch(InputMismatchException ime) {
				System.out.println("Given input is not a number");
			}
		}
		
		System.out.println("Output : " + Arrays.toString(input));
	}

}
