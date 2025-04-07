/*
WAP to Return list of prime numbers from given array.
*/

package practice.pooja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Assignment43_Program_1 {

//Using Array---------------------------------------------------
		
	int primeNumbersInArray(int[] input){	
		int outputArrLength=0;
		for(int index=0; index<input.length; index++){
			if(PrimeNumber.isPrimeNumber(input[index])) {
				outputArrLength++;
			}
		}
		return outputArrLength;
	}
	
	int[] primeNumberUsingArray(int[] input) {
		System.out.println("\n---------- List of prime numbers using Array -----------\n");
		int outputArrLength = primeNumbersInArray(input);
		int[] outputArr = new int[outputArrLength];
		int i = 0;
		for(int index=0; index<input.length; index++){
			if(PrimeNumber.isPrimeNumber(input[index])) {
				outputArr[i] = input[index];
				i++;
			}	
		}
		return outputArr;
	}
	
//Using Array List---------------------------------------------------
	
	List<Integer> primeNumberUsingArrayList(int[] arr) {
		System.out.println("\n---------- List of prime numbers using Array List-----------\n");
		List<Integer> ListofNum = new ArrayList<Integer>();
		for (int input : arr) {
			boolean flag = PrimeNumber.isPrimeNumber(input);
			if (flag) {
				ListofNum.add(input);
			}
		}
		return ListofNum;
	}

	
//Using Array Map---------------------------------------------------
	
	void primeNumberUsingHMap(int[] input) { 
	    HashMap<Integer,Integer> inputHMap = new HashMap<>();
	    System.out.println("\n---------- List of prime numbers using Hash Map -----------\n");
	    Integer count = 1;
	    for(int i= 0 ; i< input.length ; i++) {
	         if(PrimeNumber.isPrimeNumber(input[i])) {
	            inputHMap.put(count, input[i]);
	            count++;
	         } 
	      }
	    System.out.println("Prime Numbers : " + inputHMap);
	 }

	public static void main(String[] args) {
		int[] input = {10,13,15,17,22,23,28};
		System.out.println("Input list of Numbers : " + Arrays.toString(input));
		System.out.println("Prime Numbers : " + Arrays.toString(new Assignment43_Program_1().primeNumberUsingArray(input)));
		System.out.println("Prime Numbers : " + (new Assignment43_Program_1().primeNumberUsingArrayList(input)));
		new Assignment43_Program_1().primeNumberUsingHMap(input);
	}

}
