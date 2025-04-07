package practice.collectionPrograms.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("Ruby");
		ar1.add("Javascript");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Testing");
		ar2.add("DevOps");
		
		//1-To combine to lists = addAll//
		
		//ar1.addAll(ar2);
//		System.out.println(ar1);
//		
//		ar1.addAll(2, ar2);
//		System.out.println(ar1);
		
		//2-To empty the list = clear//
		
//		ar1.clear();
//		System.out.println(ar1);
		
		//3-copy/clone existing list = clone//
		
//		ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
//		System.out.println(cloneList);
		
		//4- contains(returns boolean)//
		
		System.out.println(ar1.contains("Python"));
		System.out.println(ar1.contains("VB Script"));
		
		//5- indexOf(returns integer/index of object)//
		
		System.out.println(ar1.indexOf("Ruby"));
		
		//6- lastIndexOf (returns last index of object)//
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Pooja", "Priyanka", "Pooja", "Praveen", "Palak", "Pooja"));
		System.out.println(list1);
		
		System.out.println(list1.lastIndexOf("Pooja"));
		
		//7- remove(returns the object removed/boolean if object passed)//
		System.out.println(list1.remove(0));
		System.out.println(list1.remove("Palak"));
		System.out.println(list1);
		
		//8- removeIf(returns true if removed)
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num -> num%2 == 0);
		System.out.println("Odd numbers in the list " + numbers);
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers1.removeIf(num -> num%2 != 0);
		System.out.println("Even numbers in the list " + numbers1);
		
		//9- retainAll
		ArrayList<String> namesList1 = new ArrayList<String>(Arrays.asList("Pooja", "Priyanka", "Praveen", "Palak", "Pooja"));
		System.out.println(namesList1);
		
		namesList1.retainAll(Collections.singleton("Pooja"));
		System.out.println(namesList1);
		
		//10- sublist
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));

		ArrayList<Integer> subList = new ArrayList<Integer>(numbers2.subList(2, 6));
		System.out.println(subList);
		
		//11- convert to array = toArray//
		ArrayList<String> namesList2 = new ArrayList<String>(Arrays.asList("Pooja", "Priyanka", "Praveen", "Palak", "Pooja"));
		Object[] arr=namesList2.toArray();
		
		for(Object o : arr) {
			System.out.println((String)o);
		}
	}
}
