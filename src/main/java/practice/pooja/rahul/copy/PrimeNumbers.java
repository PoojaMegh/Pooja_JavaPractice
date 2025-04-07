/*Assignment - 15 : 8th May'2023 [new branch please]

Create a class to satisfy below requirements. 
    a) Print Number is prime if Given number is prime. (parameterized method)
    b) Print all the prime numbers between range 100->120. (parameterized method)
    c) Print total count of prime numbers between 100->120.
    d) Find sum of all prime numbers between 100->120
    e) Find avg of prime numbers between 100->120*/

package practice.pooja.rahul.copy;

public class PrimeNumbers {
	
	boolean checkPrime(int num) {
		int flag = 0;
		for (int index = 2; index <= Math.sqrt(num); index++) {
			if (num % index == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(num);
			return true;
		}
		return false;
	}

	void primeInRange(int startRange, int endRange) {
		int sum = 0;
		int count = 0;
		System.out.println("The prime numbers between " + startRange + " and " + endRange + " are ");
		for (int index = startRange; index <= endRange; index++) {
			if (index <= 1)
				continue;
			if (checkPrime(index) == true) {
				count++;
				sum = sum + index;
			}
		}
		System.out.println("Total count of prime numbers between " + startRange + " and " + endRange + " is " + count);
		System.out.println("The sum of all the prime numbers between " + startRange + " and " + endRange + " is " + sum);
		System.out.println("The average of all the prime numbers between " + startRange + " and " + endRange + " is " + (sum / count));
	}

	public static void main(String[] args) {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		primeNumbers.primeInRange(1, 100);
	}
}
