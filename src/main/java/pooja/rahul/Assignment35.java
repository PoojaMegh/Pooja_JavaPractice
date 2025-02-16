/*Pattern Printing:
 * 1
12
123
1234
12345  --done

1
23
456
78910  --done

1
22
333
4444
55555  --done

111
222
333
444
555  --done

#
**
###
****
#####  --done

1234
123
12
1      --done

12345
54321
12345
54321
12345  --done
	*/

package pooja.rahul;

public class Assignment35 {

	void pattern1() {
		for (int index = 1; index <= 5; index++) {
			for (int j = 1; j < index + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	void pattern2() {
		int count = 1;
		for (int index = 1; index <= 4; index++) {
			for (int j = 1; j < index + 1; j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}

	void pattern3() {
		for (int index = 1; index <= 5; index++) {
			for (int j = 1; j < index + 1; j++) {
				System.out.print(index);
			}
			System.out.println();
		}
	}

	void pattern4() {
		for (int index = 1; index <= 5; index++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(index);
			}
			System.out.println();
		}
	}

	void pattern5() {
		for (int index = 1; index <= 5; index++) {
			for (int j = 0; j < index; j++) {
				if (index % 2 == 0)
					System.out.print("*");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}

	void pattern6() {
		for (int index = 1; index <= 4; index++) {// 1
			int count = 1;
			for (int j = 4; j >= index; j--) {// 4321
				System.out.print(count);// 1234
				count++;
			}
			System.out.println();
		}
	}

	void pattern7() {
		for (int index = 1; index <= 5; index++) {
			if (index % 2 == 0)
				System.out.println(54321);
			else
				System.out.println(12345);
		}
	}

	public static void main(String[] args) {
		Assignment35 pattern = new Assignment35();
		System.out.println("==========Pattern1============");
		pattern.pattern1();
		System.out.println();
		System.out.println("==========Pattern2============");
		pattern.pattern2();
		System.out.println();
		System.out.println("==========Pattern3============");
		pattern.pattern3();
		System.out.println();
		System.out.println("==========Pattern4============");
		pattern.pattern4();
		System.out.println();
		System.out.println("==========Pattern5============");
		pattern.pattern5();
		System.out.println();
		System.out.println("==========Pattern6============");
		pattern.pattern6();
		System.out.println();
		System.out.println("==========Pattern7============");
		pattern.pattern7();
	}
}
