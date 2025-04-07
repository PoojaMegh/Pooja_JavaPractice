/*return the first prime numbers in given array, if no prime number found, print No prime numbers in given range..
input : {10,13,17,22,23,28}
output : 13 
*/

package practice.pooja;

public class Assignment22_Program_4 {
	
	void firstPrimeNumbers(int[] input){
		int count =0;
		for(int index=0;index<input.length;index++){
			if(PrimeNumber.isPrimeNumber(input[index])) {
				count++;
				System.out.println("First prime number in the given list is : " + input[index]);
				break;
			}
		}
		if(count==0)
			System.out.println("There is no prime number in the given list.");
		System.out.println("---------------------------------------------------");
	}
	
	public static void main(String[] args) {
		int[] input = {10,13,17,22,23,28};
		int[] input1 = {10,14,18,22,26,28};
		Assignment22_Program_4 primenumber = new Assignment22_Program_4();
		primenumber.firstPrimeNumbers(input);
		primenumber.firstPrimeNumbers(input1);
	}
}
