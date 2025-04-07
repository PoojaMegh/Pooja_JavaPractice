/*Assignment-24 : 19th May'23

Program 1 : Print all the Armstrong numbers from given array.
input : {10,123,153,125,371}
output : 153
         371*/

package practice.pooja.rahul;

public class ArmstrongNumbers {

	boolean isArmstrong(int num) {
		int sum = 0;
		String str = String.valueOf(num);
		for (int index = 0; index < str.length(); index++) {
			int i = Character.getNumericValue(str.charAt(index));
			if(str.length() == 3)
			  	sum = sum + (i * i * i);
			else if (str.length() == 4)
			  	sum = sum + (i * i * i * i);
			else if (str.length() == 5)
			sum = sum + (i * i * i * i* i);  	
		};
		if (sum == num)
			return true;
		else
			return false;
	}

	void printArmstrongNumbers(int[] num) {
		boolean flag = false;
		System.out.println("Below are the armstrong numbers from given array");
		for (int index = 0; index < num.length; index++) {
			flag = isArmstrong(num[index]);
			if (flag == true) {
				System.out.println(num[index]);
			}
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 123, 153, 125, 371, 1634 };
		new ArmstrongNumbers().printArmstrongNumbers(input);
	}
}
