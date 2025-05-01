package javaProgramPractice.collectionPrograms.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashDemo {

	public static void main(String[] args) {

		HashMap<String, String> map1 = new HashMap<String, String>();
		
		map1.put("A", "X");
		map1.put("B", "Y");
		map1.put("C", "Z");

		Iterator<String> itr1 = map1.keySet().iterator();
		while (itr1.hasNext()) {
			String key = itr1.next();
			String value = map1.get(key);
			System.out.println("Key = " + key + "\tValue = " + value);
		}
		System.out.println("-------------------");
		Iterator<Entry<String, String>> itr2 = map1.entrySet().iterator();
		while(itr2.hasNext()) {
			Entry<String, String> entry = itr2.next();
			System.out.println("Key = " + entry.getKey() + "\tValue = " + entry.getValue());
		}

		System.out.println("-------------------");
		map1.forEach((k,v) -> System.out.println("Key = " + k + "\tValue = " + v));
	}

}
