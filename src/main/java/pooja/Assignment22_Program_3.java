/*return sum of all the prime numbers in given array.
input : {10,13,17,22,23,28}
output : 53 
*/

package pooja;

public class Assignment22_Program_3 {
	
	void sumOfPrimeNumbers(int[] input){
		int primeSum =0;
		System.out.println("All the prime numbers in given list are : ");
		for(int index=0;index<input.length;index++){
			if(PrimeNumber.isPrimeNumber(input[index])) {
				primeSum = primeSum + input[index];
				System.out.println(input[index]);
			}
		}
		System.out.println("Sum of all prime numbers from given list is : " + primeSum);
	}
	
	public static void main(String[] args) {
		int[] input = {10,13,17,22,23,28};
		new Assignment22_Program_3().sumOfPrimeNumbers(input);
	}
}
