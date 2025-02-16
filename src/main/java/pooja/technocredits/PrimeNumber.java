package pooja.technocredits;

public class PrimeNumber {
	int count = 0;
	
	void findIsNumberPrime(int num) {
		boolean primeFlag = true;
		for(int index=2;index<=Math.sqrt(num);index++) {
			if(num % index == 0) {
				primeFlag = false;
				//System.out.println(num + " is not prime");
				break;
			}
		}
		if(primeFlag) {
			System.out.println(num + " is prime");
			count++;
		}
	}
	
	void printPrimeNoInRange(int startR, int endR) {
		for(int num=startR;num<=endR;num++) {			
			findIsNumberPrime(num);
		}
		System.out.println("Total prime numbers in given range " + count);
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.printPrimeNoInRange(23, 50);
	}
}
