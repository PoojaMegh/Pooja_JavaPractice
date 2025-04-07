package practice.collectionPrograms.arrayList;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		//Virtual Capacity by default = 10
		//Physical Capacity/size by default = 0
		
		System.out.println(ar.size());//PC=0, VC=10
		
		//When value/objects are added PC increases and VC decreases
		ar.add(100);
		
		System.out.println(ar.size());//PC=1; VC=9
		
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size());//PC=4; VC=6
		
		//Increase VC of array list
		ArrayList<Object> ar1 = new ArrayList<Object>(30);
		
		ar1.add(1000);
		System.out.println(ar1.size());//PC=1; VC=19
				
	}
}
