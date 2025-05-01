import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hi...There...");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String : ");
		String input1 = scanner.nextLine();
		System.out.println("Enter Second String : ");
		String input2 = scanner.nextLine();

		input1 = input1.replace(" ", "").toLowerCase();
		input2 = input2.replace(" ", "").toLowerCase();

		char[] arr1 = input1.toCharArray();
		char[] arr2 = input2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (Arrays.equals(arr1,arr2)){
			System.out.println("Given Strings are anagram");
		} else {
			System.out.println("Given Strings are not anagram");
		}

	}
}