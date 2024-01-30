/*Create a class to satisfy below requirements. 
    a) Print Number is prime if Given number is prime. (parameterized method)
    b) Print all the prime numbers between range 100->120. (parameterized method)
    c) Print total count of prime numbers between 100->120.
    d) Find sum of all prime numbers between 100->120
    e) Find avg of prime numbers between 100->120*/

package pooja;

public class Assignment15 {
	 
	int pCount, sum, avg;
		
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
	
	void primeNoInRange(int strtNm, int endNm) {
		if(endNm > strtNm) {
			System.out.println("All prime numbers between given range " + strtNm + " -> " + endNm + " : ");
			for(int i=strtNm; i<=endNm; i++) {
				isPrimeNumber(i);
			}
			avg = (sum/pCount);
		} else
			System.out.println("Enter valis range, start range should be smaller than end range.");
	}
	
	void display() {
		System.out.println("Total number of prime numbers between given range : " + pCount);
		System.out.println("Sum of all prime numbers between given range : " + sum);
		System.out.println("Average of all prime numbers between given range : " + avg);
	}

	public static void main(String[] args) {
		Assignment15 primeNumber = new Assignment15();
		//primeNumber.isPrimeNumber(25);
		primeNumber.primeNoInRange(100, 120);
		primeNumber.display();
	}
}
