package practice.collectionPrograms.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		// no order - no indexing
		// stores values - Key-Value Pair <k,v>
		// key can't be duplicate
		// can store n number of null values but only one null key
		// hashmap is not thread-safe - unsynchronized
		
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London11"); // Overrides previous value
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "LA");
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);
		capitalMap.remove("France");

		System.out.println(capitalMap.get("USA"));		// Washington DC
		System.out.println(capitalMap.get("Germany")); // null
		System.out.println(capitalMap.get("UK"));		 // London11 (Stores latest value)

		System.out.println(capitalMap.get(null));		// LA
		System.out.println(capitalMap.get("France"));	// null

		//iterator : Over the keys : by using keySet() method
		System.out.println("\n----- Using Iterator : KeySet -----\n");
		Iterator<String> itr = capitalMap.keySet().iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			String value = capitalMap.get(key);
			System.out.println("Key = " + key + "\tValue = " + value);
		}
		
		//iterator : Over the set (Pair) : by using entrySet() method
		System.out.println("\n----- Using Iterator : EntrySet -----\n");
		Iterator<Entry<String, String>> itr1 = capitalMap.entrySet().iterator();
		
		while(itr1.hasNext()) {
			Entry<String, String> entry = itr1.next();
			System.out.println("Key = " + entry.getKey() + "\tValue = " + entry.getValue());
		}
		
		//iterate hashmap using java8 for each and lambda :
		System.out.println("\n----- Using Iterator : Lambda Function -----\n");
		capitalMap.forEach((k,v) -> System.out.println("Key = " + k + "\tValue = " + v));
		
	}

}
