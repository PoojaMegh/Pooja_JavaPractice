package javaProgramPractice.pooja;


public class Thread3 {

	public static void main(String[] args) {
		System.out.println("Start");
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		thread1.start();
		thread2.start();
		System.out.println("End");
	}
}
