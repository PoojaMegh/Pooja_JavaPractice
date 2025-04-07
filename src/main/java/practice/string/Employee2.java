package practice.string;

public class Employee2 extends Thread {

	@Override
	public void run() {
		m2();
	}

	public void m2() {
		for (int i = 101; i <= 200; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}
