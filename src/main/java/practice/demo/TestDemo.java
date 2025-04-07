package practice.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class TestDemo {

	public static void main(String[] args) {

		int strtNm = 100;
		int endNm = 120;

		ArrayList<Integer> primeNumList = new ArrayList<>();

		for (int num=strtNm; num<=endNm; num++) {
			boolean flag = true;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				primeNumList.add(num);
			}
		}

		System.out.println("List of Prime Numbers : " + primeNumList);

	}

}
