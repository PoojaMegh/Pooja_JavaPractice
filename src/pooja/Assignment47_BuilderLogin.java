/*	Write a class Student with attribute name, rno, age, city.
Write different comparator to sort students on name, rno, age and city.
*/

package pooja;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment47_BuilderLogin {
	
	
	public static void main(String[] args) {
		ArrayList<Assignment47_Builder> listOfBLD = new ArrayList<Assignment47_Builder>();
		
		listOfBLD.add(new Assignment47_Builder(18, "Pooja", "Pune"));
		listOfBLD.add(new Assignment47_Builder(20, "Megh", "Mumbai"));
		listOfBLD.add(new Assignment47_Builder(11, "Techno", "Delhi"));
		listOfBLD.add(new Assignment47_Builder(12, "Krishna", "Surat"));
		listOfBLD.add(new Assignment47_Builder(19, "Maulik", "AHM"));
		
		System.out.println("\n------------------ Input List before Sorting-----------------\n" +listOfBLD);
		Collections.sort(listOfBLD);
		System.out.println("\n---------------------- Sorting in Ascending Order ------------------\n" + listOfBLD);
		
		Collections.sort(listOfBLD,Collections.reverseOrder());
		System.out.println("\n---------------------- Sorting in Descending Order ------------------\n" + listOfBLD);
	}
}
