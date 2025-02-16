/*return the last prime numbers in given array, if no prime number found, print No prime numbers in given range..
input : {10,13,17,22,23,28}
output : 23 
*/

package pooja;

public class Assignment22_Program_5 {
	
	void lastPrimeNumbers(int[] input){
		int count =0, tempPrime =0;
		
		for(int index=0;index<input.length;index++){
			if(PrimeNumber.isPrimeNumber(input[index])) {
				count++;
				tempPrime = input[index];
			}
		}
		if(count==0)
			System.out.println("There is no prime number in the given list.");
		else
			System.out.println("First prime number in the given list is : " + tempPrime);
		System.out.println("---------------------------------------------------");
	}
	
	public static void main(String[] args) {
		int[] input = {10,13,17,22,23,28};
		int[] input1 = {10,14,18,22,26,28};
		Assignment22_Program_5 primenumber = new Assignment22_Program_5();
		primenumber.lastPrimeNumbers(input);
		primenumber.lastPrimeNumbers(input1);
	}
}
