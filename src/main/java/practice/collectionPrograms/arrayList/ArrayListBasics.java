package practice.collectionPrograms.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListBasics {

	public static void main(String[] args) {
		//array list default class
		//dynamic array
		
		//default declaration
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);//0
		ar.add(200);//1
		ar.add("testing");//2
		ar.add('t');//3
		ar.add(12.33);//4
		ar.add(true);//5
		
		//maintains the indexing(insertion order)
		System.out.println(ar);
		
		System.out.println(ar.get(2));
		//System.out.println(ar.get(-1));//ArrayIndexOutOfBound
		
		//size
		System.out.println(ar.size());
		System.out.println("Lowest Index = " + 0);
		System.out.println("Highest Index = " + (ar.size()-1));
		
		ar.add(400);//6
		ar.add(500);//7
		
		System.out.println(ar.size());
		
		//List with other collection : 
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		
		System.out.println(numbers);
		
		
	}
	
}
