/*Assigment-29 : 31st May'2023
Program 1 : Write a program having following method. 
a) Swap 2 numbers using temp variable.
b) Swap 2 numbers without using 3rd variable. 
c) Swap 2 strings using temp variable
d) Swap 2 String without using temp variable. */

package javaProgramPractice.pooja.rahul.copy;

public class Assignment29PR1 {

	void swapNumbersUsingTemp(int num1, int num2) {
		System.out.println("Input Numbers ==> num1 : " + num1 + " & num2 : " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Output Numbers ==> num1 : " + num1 + " & num2 : " + num2);
	}

	void swapNumbersNotUsingTemp(int num1, int num2) { // 10 5
		System.out.println("Input Numbers ==> num1 : " + num1 + " & num2 : " + num2);
		num1 = num1 + num2; // 15
		num2 = num1 - num2; // 10
		num1 = num1 - num2;
		System.out.println("Output Numbers ==> num1 : " + num1 + " & num2 : " + num2);
	}

	void swapStringUsingTemp(String str1, String str2) {
		System.out.println("Input Strings");
		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2);
		String temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("Output Strings");
		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2);
	}

	void swapStringNotUsingTemp(String str1, String str2) {// Rahul Rohit
		System.out.println("Input Strings");
		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2);
		str1 = str1 + str2;// TechnoCredits
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("Output Strings");
		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2);
	}

	public static void main(String[] args) {
		Assignment29PR1 assignment29pr1 = new Assignment29PR1();
		assignment29pr1.swapNumbersUsingTemp(10, 20);
		System.out.println("==========================================================");
		assignment29pr1.swapStringUsingTemp("Rahul", "Rohit");
		System.out.println("==========================================================");
		assignment29pr1.swapNumbersNotUsingTemp(40, 60);
		System.out.println("==========================================================");
		assignment29pr1.swapStringNotUsingTemp("SnapOne", "GlobantOneGoal");
	}
}