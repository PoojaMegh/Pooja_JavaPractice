/*Assignment 22 - Program 6:
return the sum of first and last prime number.
input : {55,44,11,13,98,76}
output : 24
 
boolean isPrimeNumber(int num){

}
 
int getFirstPrimeNumber(int[] arr){

}

int getLastPrimeNumber(int[] arr){
	for(){
		
	}
}

void printSumOfGivenPrimeNumbers(int[] arr){
	int num1 = getFirstPrimeNumber(arr);
	int num2 = getLastPrimeNumber(arr);
	sop(num1+num2);
}*/

package string;

public class SumOfFirstAndLastPrimeNumberInArray {

	int firstPrimeNumber(int[] num) {
		PrimeNumber primeNumber = new PrimeNumber();
		int firstPrimeNumber = 0;
		for (int index = 0; index < num.length; index++) {
			if (primeNumber.isNumberPrime(num[index])) {
				firstPrimeNumber = num[index];
				break;
			}
		}
		return firstPrimeNumber;
	}

	int lastPrimeNumber(int[] num) {
		PrimeNumber primeNumber = new PrimeNumber();
		int lastPrimeNumber = 0;
		for (int index = num.length - 1; index >= 0; index--) {
			if (primeNumber.isNumberPrime(num[index])) {
				lastPrimeNumber = num[index];
				break;
			}
		}
		return lastPrimeNumber;
	}

	int sumFirstAndLastPrimeNumber(int[] num) {
		int firstPrimeNumber = firstPrimeNumber(num);
		int lastPrimeNumber = lastPrimeNumber(num);
		return (firstPrimeNumber + lastPrimeNumber);
	}

	public static void main(String[] args) {
		int[] input = { 4, 22, 23, 27, 29, 33, 37, 39, 45 };
		int sum = new SumOfFirstAndLastPrimeNumberInArray().sumFirstAndLastPrimeNumber(input);
		System.out.println("The sum of first and last Prime Number in given array is " + sum);
	}
}