/*Assignment22 - Program 2 : 
print all the prime numbers in given array.
input : {10,13,17,22,23,28}
output : 13
         17
		 23 

boolean isNumberPrime(int number){

}

void findPrimeNumbers(int[] arr){
	for(int index=0;index<arr.length;index++){
		boolean isPrimeFlag = isNumberPrime(arr[index]);
		if(isPrimeFlag)
			sop(arr[index] + " is a prime number");
	}
}*/

package pooja.rahul;

public class PrimeNumber {

	 boolean isNumberPrime(int num) {
		boolean flag = true;
		for (int index = 2; index <= Math.sqrt(num); index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			return true;
		else
			return false;
	}

	void findPrimeNumbers(int[] num) {
		System.out.println("The prime numbers from given array are as below :");
		for (int index = 0; index < num.length; index++) {
			if (isNumberPrime(num[index]))
				System.out.println(num[index]);
		}
	}

	public static void main(String[] args) {
		int[] input = { 11, 15, 20, 23, 19, 33, 39, 47, 49 };
		new PrimeNumber().findPrimeNumbers(input);
	}
}