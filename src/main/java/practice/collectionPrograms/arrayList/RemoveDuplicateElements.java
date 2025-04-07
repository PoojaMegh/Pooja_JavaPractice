package practice.collectionPrograms.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		//1. linkedHashSet
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));
		System.out.println(numbers);
				
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> numbersNoDuplicate = new ArrayList<Integer>(linkedHashSet);
		System.out.println(numbersNoDuplicate);
		
		System.out.println("------------------\n");

		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Pooja", "Priyanka", "Pooja", "Praveen", "Palak", "Pooja"));
		System.out.println(names);
		
		LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<String>(names);
		ArrayList<String> namesNoDuplicate = new ArrayList<String>(linkedHashSet1);
		System.out.println(namesNoDuplicate);
		
		System.out.println("------------------\n");
		
		//2. JDK-8 - Stream
		
		ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));
		System.out.println(marks);
		List<Integer> marksUnique = marks.stream().distinct().collect(Collectors.toList());
		System.out.println(marksUnique);
		
		System.out.println("------------------\n");
		
		ArrayList<String> students = new ArrayList<String>(Arrays.asList("Pooja", "Priyanka", "Pooja", "Praveen", "Palak", "Pooja"));
		System.out.println(students);
		List<String> studentsUnique = students.stream().distinct().collect(Collectors.toList());
		System.out.println(studentsUnique);
		
	}

}
