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
package javaProgramPractice.pooja;

import java.util.*;

public class Assignment34_Program_1 {

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		while(input.size() < 3)
		{
			System.out.println("Enter a number: ");
			String str = scanner.nextLine();
			try
			{
				int num = Integer.parseInt(str);
				input.add(num);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Given input is not a number.");
			}
		}
		System.out.println("Output : " + input);
		scanner.close();
	}
}
