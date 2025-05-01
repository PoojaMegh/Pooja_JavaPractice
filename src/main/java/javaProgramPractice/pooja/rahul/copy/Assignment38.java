/*Assigment-38 : 22nd Jun'2023
Find the unique word from give String.
String str = "hi hello how are you how are your partner how hi is your mother";
Hint : indexOf and lastIndexOf method*/

package javaProgramPractice.pooja.rahul.copy;

import java.util.Arrays;
import java.util.ArrayList;

public class Assignment38 {

	public static void main(String[] args) {
		String str = "hello hi how are you how are your partner how hi is your mother";
		String[] strArray = str.split(" ");
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(strArray));
		int index = 1;
		while (index < al.size()) {
			if (al.indexOf(al.get(index)) == al.lastIndexOf(al.get(index))) {
				System.out.println(al.get(index));
				al.remove(index);
			} else {
				index++;
			}
		}
	}

}
