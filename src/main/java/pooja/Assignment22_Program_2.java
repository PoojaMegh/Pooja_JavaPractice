/*print all the prime numbers in given array.
input : {10,13,17,22,23,28}
output : 13
         17
		 23 
*/

package pooja;

public class Assignment22_Program_2 {
	
	void findPrimeNumbers(int[] input){
		System.out.println("All the prime numbers in given list are : ");
		for(int index=0;index<input.length;index++){
			if(PrimeNumber.isPrimeNumber(input[index]))
				System.out.println(input[index]);
		}
	}
	
	public static void main(String[] args) {
		int[] input = {10,13,17,22,23,28};
		new Assignment22_Program_2().findPrimeNumbers(input);
	}
}
