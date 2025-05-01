/*Assigment-33 : [Exception handling]

Program 1:  
String str = I have total 12 years and 5 months of experience. 
output : 17

try{
	int num = Integer.parseInt(arr[index]);
	sum = sum + num;
}


Program 2: 

String str = I have total 12.2 years and 5.7 months of experience. 
output : 17.9*/

package javaProgramPractice.pooja.rahul;

public class Assignment33PR1 {

	int getSumOfIntegerNumbersInString(String str) {
		int sum = 0;
		String[] stringArray = str.split(" ");
		for (int index = 0; index < stringArray.length; index++) {
			try {
				sum += Integer.parseInt(stringArray[index]);
			} catch (NumberFormatException ne) {
			}
		}
		return sum;
	}
	
	double getSumOfDecimalNumbersInString(String str) {
		double sum = 0;
		String[] stringArray = str.split(" ");
		for (int index = 0; index < stringArray.length; index++) {
			try {
				sum += Double.parseDouble(stringArray[index]);
			} catch (NumberFormatException ne) {
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		String str1 = "I am Rahul Daryanani with 9 years and 5 days of experience";
		String str2 = "I total 4.3 months days of experience in Automation and 4.5 months in Manual Testing";
		int output = new Assignment33PR1().getSumOfIntegerNumbersInString(str1);
		System.out.println(output);
		double procssedSum = new Assignment33PR1().getSumOfDecimalNumbersInString(str2);
		System.out.println(procssedSum);
	}
}