package practice.collectionPrograms.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {

		//1: Collections.synchronizedList
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		
		namesList.add("Java");
		namesList.add("Python");
		namesList.add("Ruby");
		
		//for add, remove operations - we don't need explicit synchronization
		
		//to retrieve/fetch/traverse the values from the list - we have to use explicit synchronization
		
		synchronized (namesList) {
			Iterator<String> itr = namesList.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		
		//2. copyOnWriteArrayList --- its a class
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Tanmay");
		empList.add("Ekansh");
		empList.add("Pooja");
		
		//we don't need explicit synchronization for any operations : add/remove/traverse
		
		Iterator<String> itr1 = empList.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
	}

}
