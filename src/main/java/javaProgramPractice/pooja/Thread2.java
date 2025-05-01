package javaProgramPractice.pooja;

public class Thread2 extends Thread{
	
	@Override
	public void run() {
		displayNum2();
	}

	void displayNum2() {
		for (int i = 101; i <= 150; i++)
			System.out.println(i);
	}
}
