package practice.collectionPrograms.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> studentList = new ArrayList<String>();
		
		studentList.add("Pooja");//0
		studentList.add("Priyanka");//1
		studentList.add("Praveen");//2
		studentList.add("Palak");//3

		//1-typical for loop :
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		
		System.out.println("----------");
		
		//2-for each loop :
		for(String s : studentList) {
			System.out.println(s);
		}
		
		System.out.println("----------");
		
		//3-stream with Lambda function :
		studentList.stream().forEach(std -> System.out.println(std));
		
		System.out.println("----------");
		
		//4-Iterator :
		Iterator<String> itr = studentList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
