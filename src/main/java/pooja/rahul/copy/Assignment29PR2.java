/*Assigment-29 : 31st May'2023
Program 2 : WAP to fulfill follwoing requirement.
a) method to print ascii of given character.
input : 67
output : C

b) method to print character associated with given ascii.
input : 50
output : 2
input : 99
output : c

c) write a method to print ascii for all upper case character
d) write a method to print ascii for all lowercases characters.*/

package pooja.rahul.copy;

import java.util.Scanner;

public class Assignment29PR2 {

	int getAscii(char ch) {
		int value = ch;
		return value;
	}

	char getCharFromAscii(int ascii) {
		char ch = (char) ascii;
		return ch;
	}

	void printUpperCaseCharAscii() {
		System.out.println("Upper Case Ascii values are as below");
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int asciiValue = ch;
			System.out.println(ch + " ==> " + asciiValue);
		}
	}

	void printLowerCaseCharAscii() {
		System.out.println("Lower Case Ascii values are as below");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int asciiValue = ch;
			System.out.println(ch + " ==> " + asciiValue);
		}
	}

	public static void main(String[] args) {
		Assignment29PR2 assignment29pr2 = new Assignment29PR2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the character below to get ascii value of");
		char ch = scanner.next().charAt(0);
		int asciiValue = assignment29pr2.getAscii(ch);
		System.out.println("Ascii value of " + ch + " is " + asciiValue);
		System.out.println("===================================================");
		System.out.println("Enter the ascii value below to get character value of");
		int ascii = scanner.nextInt();
		char c = assignment29pr2.getCharFromAscii(ascii);
		System.out.println("The character of ascii value " + ascii + " is " + c);
		System.out.println("===================================================");
		assignment29pr2.printUpperCaseCharAscii();
		System.out.println("===================================================");
		assignment29pr2.printLowerCaseCharAscii();
		scanner.close();
	}
}