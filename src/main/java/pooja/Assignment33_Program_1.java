/*Assigment-33 : [Exception handling] Program 1:  
String str = I have total 12 years and 5 months of experience. 
output : 17
*/

package pooja;

public class Assignment33_Program_1 {

	int getSumOfNumInString(String input) {
		int sum = 0;
		
		String[] inputArr = input.split(" ");
		for(int index=0; index<inputArr.length; index++) {
			try {
				int numArr = Integer.parseInt(inputArr[index]);
				sum = sum + numArr;
			}catch(NumberFormatException ne) {
				
			}
		}
		return sum;
	}
	
	void display(String input) {
		System.out.println(input);
		System.out.println("Sum of numbers in input string : " + getSumOfNumInString(input));
	}
	
	public static void main(String[] args) {
		String input = "I have total 12 years and 5 months of experience.";
		new Assignment33_Program_1().display(input);
	}
}
