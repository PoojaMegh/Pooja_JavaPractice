/*Assignment 22 - Program 3 : 
return sum of all the prime numbers in given array.
input : {10,13,17,22,23,28}
output : 53

boolean isNumberPrime(int number){

}

void findPrimeNumbers(int[] arr){
	int sum = 0;
	int count = 0;
	for(int index=0;index<arr.length;index++){
		boolean isPrimeFlag = isNumberPrime(arr[index]);
		if(isPrimeFlag){
			sop(arr[index] + " is a prime number");
			sum = sum + arr[index];
			count++;
		}
	}
	sop("Sum of all prime numbers from given array is " + sum);
}*/

package practice.pooja.rahul;

public class SumOfPrimeNumberArray { 

	void sumOfPrimeNumbers(int[] num) {
		int sum = 0;
		PrimeNumber primeNumber = new PrimeNumber();
		for (int index = 0; index < num.length; index++) {
			if (primeNumber.isNumberPrime(num[index]))
				sum = sum + num[index];
		}
		System.out.println("The Sum of all the prime numbers from given array is : " + sum);
	}

	public static void main(String[] args) {
		int[] input = { 11, 15, 20, 23, 19, 33, 39, 47, 49 };
		new SumOfPrimeNumberArray().sumOfPrimeNumbers(input);
	}
}