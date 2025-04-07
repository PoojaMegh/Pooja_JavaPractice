/*Assigment-37 : 22nd Jun'2023
Find frequency of each word using ArrayList.
String str = "hi hello how are you how are your partner how hi is your mother";
output : hi -> 2
         hello -> 1
         how -> 3
         are -> 2
         your -> 2 
		 partner -> 1
		 is -> 1
		 mother -> 1*/

package practice.pooja.rahul.copy;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment37 {

	public static void main(String[] args) {
		String str = "hi hello how are you how are your partner how hi is your mother";
		String[] strArray = str.split(" ");
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(strArray));
		System.out.println(al);
		while (al.size() > 0) {
			String temp = al.get(0);
			int initialSize = al.size();
			if (al.contains(temp)) {
				al.removeAll(Arrays.asList(temp));
			}
			System.out.println(temp + "  :  " + (initialSize - al.size()));
		}
	}
}
