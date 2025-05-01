/*
WAP to Return list of prime numbers from given array.
input = {10,13,15,17,22,23,28}
output = {13, 17, 23}
*/

package javaProgramPractice.collectionPrograms.arrayList.Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class Program6_PrimeNumbersInList {

	public static void main(String[] args) {
		ArrayList<Integer> inputList = new ArrayList<Integer>(Arrays.asList(10,13,15,17,22,23,28));
		System.out.println("Input List : " + inputList);
		
		ArrayList<Integer> primeNumList = new ArrayList<Integer>();
		
		for(int num : inputList) {
			boolean flag = true;
			for(int i=2; i<=Math.sqrt(num); i++) {
				if(num%i ==0) {
					flag = false;
					break;
				} 
				}
			if(flag) {
				primeNumList.add(num);
			}
		}
		System.out.println("List of Prime Numbers in given list : " + primeNumList);

	}

}
