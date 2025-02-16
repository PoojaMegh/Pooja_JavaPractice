/*Assigment-33 : [Exception handling] Program 1:  
String str = I have total 12 years and 5 months of experience
output : 17
*/

package string;

public class ExceptionHandling_Eg1 {

	public static void main(String[] args) {

		String input = "I have total 12.5 years and 5.2 months of experience";
		String[] inputArr = input.split(" ");
		double sum =0;
		
		for (int index=0; index<inputArr.length; index++) {
			try {
				double num = Double.parseDouble(inputArr[index]);
				sum = sum + num;
			}
			catch(NumberFormatException ne){
				
			}
		}
		System.out.println(sum);

	}

}
