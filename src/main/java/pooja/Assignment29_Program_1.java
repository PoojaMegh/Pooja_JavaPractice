/*Write a program having following method. 
a) Swap 2 numbers using temp variable.
b) Swap 2 numbers without using 3rd variable. 
c) Swap 2 strings using temp variable
d) Swap 2 String without using temp variable.
*/

package pooja;

public class Assignment29_Program_1 {
	
	void swapNmWithTemp(int x,int y) {
		System.out.println("Before swapping numbers: " + "\nNumber1 = " + x + "\tNumber2 = " + y );
		int temp=0;
		temp=x;
		x=y;		
		y=temp;
		System.out.println("After swapping numbers with Temp variable : " + "\nNumber1 = " + x + "\tNumber2 = " + y );	
	}

	void swapNmWithoutTemp(int x,int y) {
		System.out.println("\nBefore swapping numbers: " + "\nNumber1 = " + x + "\tNumber2 = " + y );
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping numbers without Temp variable : " + "\nNumber1 = " + x + "\tNumber2 = " + y );		
	}

	void swapStringWithTemp(String x,String y) {
		System.out.println("\nBefore swapping strings: " + "\nString1 = " + x + "\t\tString2 = " + y );
		String temp;
		temp=x;
		x=y;		
		y=temp;
		System.out.println("After swapping strings with Temp variable : " + "\nString1 = " + x + "\tString2 = " + y );	
	} 

	void swapStringWithoutThirdVariable(String x,String y) {
		System.out.println("\nBefore swapping strings: " + "\nString1 = " + x + "\tString2 = " + y );
		x=x+y;		
		y = x.substring(0,x.length()-y.length());
		x=x.substring(y.length());
		System.out.println("After swapping strings without Temp variable : " + "\nString1 = " + x + "\tString2 = " + y );
	} 


	public static void main(String[] args) {
		Assignment29_Program_1 swap = new Assignment29_Program_1();
		swap.swapNmWithTemp(11, 22);
		swap.swapNmWithoutTemp(23, 41);
		swap.swapStringWithTemp("Pooja", "Sharma");
		swap.swapStringWithoutThirdVariable("Techno", "Credits");
	}

}
