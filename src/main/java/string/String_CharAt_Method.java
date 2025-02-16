/*Program 1: Write a program to print all characters of given name in different line.
	
input : technocredits
output : 
	t
	e
	c
	h
	n
	o
	c
	r
	e
	d
	i
	t
	s
	
Program 2: write another method, which will print frequency of character 't' in given name.
	
input : technocredits
output : 2

Program 3:  Write program for Reverse string name

	Input  : Pooja @ technocredits
 	Output : stiderconhcet @ ajooP
*/

package string;

public class String_CharAt_Method {
	
	//Method to print all characters of given name in different line
	void printChar(String input) {
		for(int index=0; index<input.length(); index++) {
			System.out.println(input.charAt(index));
		}
	}
	
	//Method to print frequency of given character in given string
	void charFrequency(String input, char ch) {
		int count =0;
		for(int index=0; index<input.length(); index++) {
			if(ch == input.charAt(index)) {
				count++;
			}
		}
		System.out.println("Count of t character in given String is : " + count);
		System.out.println("--------------------------------------");
	}
	
	//Method to reverse the string
	void reverseString(String input) {
		char ch;
		String output = "";
		System.out.println("Original String : " + input);
		
		for(int index=0; index<input.length(); index++) {
			ch = input.charAt(index);
			output = ch+output;
		}
		System.out.println("Reversed String : " + output);
	}
	
	public static void main(String[] args) {
		String_CharAt_Method charat = new String_CharAt_Method();
	//	charat.charFrequency("technocredits", 't');
	//	charat.printChar("technocredits");
		charat.reverseString("Pooja @ Technocredits");
	}

}
