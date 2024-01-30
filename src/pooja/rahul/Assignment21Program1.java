/*Assignment - 21 : 14th May'2023 [ETA : EOD 16th May]

Program 1:  
From the given Array, print all the name which start with vowel.

input = {"Tirth","Aashvi","Harsh","Janvi","Isha","Rahay"}
output : Aashvi
         Isha*/

package pooja.rahul;

public class Assignment21Program1 {

	boolean checkVovel(String name) {
		name = name.toUpperCase();
		if (name.charAt(0) == 'A' || name.charAt(0) == 'E' || name.charAt(0) == 'I' || name.charAt(0) == 'O'
				|| name.charAt(0) == 'U') {
			return true;
		} else
			return false;
	}

	void printNamesStartingWithVovels(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (checkVovel(arr[index])) {
				System.out.println(arr[index]);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "Amit", "Sumit", "Lalit", "Umeet", "Sanmeet" };
		new Assignment21Program1().printNamesStartingWithVovels(names);
	}
}