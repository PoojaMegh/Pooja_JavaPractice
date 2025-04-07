package practice.pooja;

public class GetMaxNumInArray {
	
	static int getMaxNm(int[] input) {
		int max = input[0];
		
		for(int index=0; index<input.length; index++) {
			if(input[index] > max) {
				max = input[index];
			}
		}
		return max;
	}
}
