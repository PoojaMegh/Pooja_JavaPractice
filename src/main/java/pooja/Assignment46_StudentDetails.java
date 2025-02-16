/*	Write a class Student with attribute name, rno, age, city.
Write different comparator to sort students on name, rno, age and city.
*/

package pooja;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment46_StudentDetails {
	
	
	public static void main(String[] args) {
		ArrayList<Assignment46_Student> listOfSTD = new ArrayList<Assignment46_Student>();
		
		listOfSTD.add(new Assignment46_Student(3, 28, "Pooja", "Pune"));
		listOfSTD.add(new Assignment46_Student(5, 30, "Megh", "Mumbai"));
		listOfSTD.add(new Assignment46_Student(1, 26, "Techno", "Delhi"));
		listOfSTD.add(new Assignment46_Student(2, 32, "Krishna", "Surat"));
		listOfSTD.add(new Assignment46_Student(4, 29, "Maulik", "AHM"));
		System.out.println("\n------------------ Input List before Sorting-----------------\n" + listOfSTD);
		
		Collections.sort(listOfSTD,new Assignment46_RollNmComparator());
		System.out.println("\n-------------------- Sorting by Roll No -------------------\n" + listOfSTD);
		
		Collections.sort(listOfSTD,new Assignment46_NameComparator());
		System.out.println("\n--------------------- Sorting by Name --------------------\n" + listOfSTD);
		
		Collections.sort(listOfSTD,new Assignment46_CityComparator());
		System.out.println("\n--------------------- Sorting by City --------------------\n" + listOfSTD);
		
		Collections.sort(listOfSTD,new Assignment46_AgeComparator());
		System.out.println("\n-------------------- Sorting by Age ---------------------\n" + listOfSTD);
	}
}
