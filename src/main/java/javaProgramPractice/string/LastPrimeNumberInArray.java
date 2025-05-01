/* Assignment22 - Program 5: 
return the last prime numbers in given array, if no prime number found, print No prime numbers in given range..
input : {10,13,17,22,23,28}
output : 23

boolean isNumberPrime(int number){

}

void findPrimeNumbers(int[] arr){
	int count = 0;
	int primeNumber = 0;
	
	for(int index=0;index<arr.length;index++){
		boolean isPrimeFlag = isNumberPrime(arr[index]);
		if(isPrimeFlag){
			primeNumber = arr[index];
			count++;
		}
	}
	if(count == 0)
		sop("NO prime numbers in given range");
	else
		sop(primeNumber + " is the last prime number in a given range");
} */

package javaProgramPractice.string;

public class LastPrimeNumberInArray {

	void lastPrimeNumber(int[] num) {
		PrimeNumber primeNumber = new PrimeNumber();
		boolean flag = false;
		for (int index = num.length - 1; index >= 0; index--) {
			if (primeNumber.isNumberPrime(num[index])) {
				System.out.println("The last prime number in given array is : " + num[index]);
				flag = true;
				break;
			}
		}
		if (flag == false)
			System.out.println("No prime number in given array");
	}

	public static void main(String[] args) {
		int[] input = { 4, 22, 23, 27, 29, 33, 37, 39, 45 };
		new LastPrimeNumberInArray().lastPrimeNumber(input);
	}
}