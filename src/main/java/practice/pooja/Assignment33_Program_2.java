/*Assigment-33 : [Exception handling] Program 2:  
String str = I have total 12.2 years and 5.7 months of experience. 
output : 17.9
*/

package practice.pooja;

public class Assignment33_Program_2 {

	double getSumOfNumInString(String input) {
		double sum = 0;
		
		String[] inputArr = input.split(" ");
		for(int index=0; index<inputArr.length; index++) {
			try {
				double numArr = Double.parseDouble(inputArr[index]);
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
		String input = "I have total 12.2 years and 5.7 months of experience.";
		new Assignment33_Program_2().display(input);
	}
}
