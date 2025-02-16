/*Assignment 22 - Program 4 : 
return the first prime numbers in given array, if no prime number found, print No prime numbers in given range..
input : {10,13,17,22,23,28}
output : 13

boolean isNumberPrime(int number){

}

void findPrimeNumbers(int[] arr){
	int count = 0;
	for(int index=0;index<arr.length;index++){
		boolean isPrimeFlag = isNumberPrime(arr[index]);
		if(isPrimeFlag){
			sop(arr[index] + " is a first prime number in given array");
			count++;
			break;
		}
	}
	if(count == 0)
		sop("NO prime numbers in given range");
}*/

package pooja.rahul;

public class FirstPrimeNumberInArray {

	void firstPrimeNumber(int[] num) {
		PrimeNumber primeNumber = new PrimeNumber();
		boolean flag = false;
		for (int index = 0; index < num.length; index++) {
			if (primeNumber.isNumberPrime(num[index])) {
				System.out.println("The first prime number in given array is : " + num[index]);
				flag = true;
				break;
			}
		}
		if (flag == false)
			System.out.println("No prime number in given array");
	}

	public static void main(String[] args) {
		int[] input = { 4, 22, 23, 27, 29, 33, 37, 39, 45 };
		new FirstPrimeNumberInArray().firstPrimeNumber(input);
	}
}