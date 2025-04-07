/* Prime number can be divided exactly only by itself and 1, for example 7, 17 and 41

Create a class to satisfy below requirements. 
  a) Print Number is prime if Given number is prime. (parameterized method)
  b) Print all the prime numbers between range 100->120. (parameterized method)
  c) Print total count of prime numbers between 100->120.
  d) Find sum of all prime numbers between 100->120
  e) Find avg of prime numbers between 100->120
*/

package practice.ImportantPrograms;

import java.util.ArrayList;

public class PrimeNumber {
	
	int pCount, sum, avg;
	
	//Print Number is prime if Given number is prime. (parameterized method)
	void isPrimeNumber(int number) {
		boolean primeFlag = true;
		
		for(int i=2; i<=Math.sqrt(number); i++) {
			if(number%i==0) {
				primeFlag = false;
				break;
			}
		}
		if(primeFlag) {
			pCount++;
			sum = sum + number;
			System.out.println(number + " is a Prime Number.");
		}
	}
	
	
	//Print all the prime numbers between range 100->120. (parameterized method)
	void primeNoInRange(int strtNm, int endNm) {
		if(strtNm < endNm) {
			System.out.println("\nAll the prime numbers between given range " +strtNm+ " --> " +endNm+ " : ");
			for(int i=strtNm; i<=endNm; i++) {
				isPrimeNumber(i);
			}
			avg = (sum/pCount);
		} else
			System.out.println("Enter valid range, start range should be smaller than end range.");
	}
	
	/*
	 * Print total count of prime numbers between 100->120.
	 * Find sum of all prime numbers between 100->120
	 * Find avg of prime numbers between 100->120
	 */
	void display() {
		System.out.println("\nTotal number of prime numbers between given range : " + pCount);
		System.out.println("Sum of all prime numbers between given range : " + sum);
		System.out.println("Average of all prime numbers between given range : " + avg);
	}

	//add num to prime num array if it is a prime number
	static void isNumPrimeArray(){
		int strtNm = 100;
		int endNm = 120;

		ArrayList<Integer> primeNumList = new ArrayList<>();

		for (int num=strtNm; num<=endNm; num++) {
			boolean flag = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				primeNumList.add(num);
			}
		}

		System.out.println("List of Prime Numbers : " + primeNumList);
	}
	
	//Main Method
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		PrimeNumber primeNumberInRange = new PrimeNumber();
		
		primeNumber.isPrimeNumber(29);
		primeNumberInRange.primeNoInRange(100, 120);
		primeNumberInRange.display();
	}
}
