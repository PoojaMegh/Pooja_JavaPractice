/*
Prime Number is a number that can be divided exactly only by itself and 1.
*/

package practice.pooja;

public class PrimeNumber {
	
	static boolean  isPrimeNumber(int number) {
		boolean primeFlag = true;
		for(int i=2; i<=Math.sqrt(number); i++) {
			if(number%i==0) {
				primeFlag = false;
				break;
			}
		}
		return primeFlag;
	}
}
