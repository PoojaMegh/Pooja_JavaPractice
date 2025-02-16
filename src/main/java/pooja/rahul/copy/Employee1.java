package pooja.rahul.copy;

public class Employee1 extends Thread {

	@Override
	public void run() {
		m1();
	}

	public void m1() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}
