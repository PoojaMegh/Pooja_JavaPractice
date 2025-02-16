/*Program to demonstrate Multi Threading*/

package pooja.rahul.copy;

public class Assignment36MultiThreading {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Employee1 emp1 = new Employee1();
		Employee2 emp2 = new Employee2();
		Thread.currentThread().setName("Main Thread");
		emp1.start();
		emp2.start();
	}
}