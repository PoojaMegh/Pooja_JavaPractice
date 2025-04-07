package practice.pooja;

public class Thread1 extends Thread{
	
	@Override
	public void run() {
		displayNum1();
	}

	void displayNum1() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}
}
