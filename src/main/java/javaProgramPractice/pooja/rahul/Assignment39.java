/*Assigment-39 : 22nd Jun'23

Remove duplicate, it should have only one occurrence per word.
String str = "hi hello how are you how are your partner how hi is your mother";
output -> hello you are partner how hi is your mother*/

package javaProgramPractice.pooja.rahul;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment39 {

	public static void main(String[] args) {
		String str = "hi hello how are you how are your partner how hi is your mother";
		String[] strArray = str.split(" ");
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(strArray));

		for (int index = 0; index < al.size(); index++) {
			if (al.indexOf(al.get(index)) != al.lastIndexOf(al.get(index))) {
				al.remove(al.lastIndexOf(al.get(index)));
			}
		}
		System.out.println(al);
	}
}
