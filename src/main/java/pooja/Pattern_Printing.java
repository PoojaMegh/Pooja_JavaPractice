package pooja;

public class Pattern_Printing {

/*
1
12
123
1234
12345
*/
	
	void pattern1() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
/*
12345
1234
123
12
1
*/
		
	void pattern2() {
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
				System.out.println();
		}
	}	

/*
1 
23 
456 
78910
*/
	
	void pattern3() {
		int count = 1;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}

/*
1
22
333
4444
55555	
*/
	
	void pattern4() {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

/*
111
222
333
444
555	
 */
	
	void pattern5() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=3; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
/*	
4321
321
21
1
*/
	
	void pattern6() {
		for (int i=4; i>=1; i--) {
			int count = i;
			for(int j=1; j<=i; j++) {
				System.out.print(count);
				count--;
			}
			System.out.println();
		}
	}
	
/*	
12345
54321
12345
54321
12345
*/
	
	void pattern7() {
		for(int i=1; i<=5; i++) {
			if(i%2 == 0) {
				System.out.println("54321");
			}else 
				System.out.println("12345");
		}
	}
	
/*
#
**
###
****
#####	
*/
	
	void pattern8() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				if(i%2 == 0) {
					System.out.print("*");
				}else 
					System.out.print("#");
			}
			System.out.println();
		}
	}	
		
	public static void main(String[] args) {
		Pattern_Printing pattern = new Pattern_Printing();
		pattern.pattern1();
		System.out.println("-------------------");
		pattern.pattern2();
		System.out.println("-------------------");
		pattern.pattern3();
		System.out.println("-------------------");
		pattern.pattern4();
		System.out.println("-------------------");
		pattern.pattern5();
		System.out.println("-------------------");
		pattern.pattern6();
		System.out.println("-------------------");
		pattern.pattern7();
		System.out.println("-------------------");
		pattern.pattern8();
	}
}
