package pooja.technocredits;

public class StaticExample2 {
	
	public static void main(String[] args) {
		StaticExample1 staticExample1 = new StaticExample1();
		StaticExample1.num = 1000;
		staticExample1.processData(10);
		System.out.println(StaticExample1.num); 
		System.out.println(staticExample1.num);
		System.out.println(staticExample1.num1);
		staticExample1.display();
		
		StaticExample1 staticExample2 = staticExample1;
		staticExample2.display(); // 
	}
}
