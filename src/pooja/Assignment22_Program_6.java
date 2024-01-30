/*return the sum of first and last prime number, if no prime number found, print No prime numbers in given range..
input : {20,22,23,17,19,45}
output : 42 
*/

package pooja;

public class Assignment22_Program_6 {
	
	void sumPrimeNumbers(int[] input){
		int firstPrime =0, lastPrime =0;
		
		for(int index=0;index<input.length;index++){
			if(PrimeNumber.isPrimeNumber(input[index])) {
				if (firstPrime == 0)
					firstPrime = input[index];
				lastPrime = input[index];
			}
		}
		if (firstPrime == 0)
			System.out.println("There is no prime number in the given list.");
		else
			System.out.println("Sum of first prime number " + firstPrime + " and last prime number " +lastPrime + " in the given list is : " + (firstPrime+lastPrime));
		System.out.println("---------------------------------------------------");
	}
	
	public static void main(String[] args) {
		int[] input = {20,22,23,17,19,45};
		int[] input1 = {10,14,18,22,26,28};
		Assignment22_Program_6 primenumber = new Assignment22_Program_6();
		primenumber.sumPrimeNumbers(input);
		primenumber.sumPrimeNumbers(input1);
	}
}
