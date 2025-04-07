package practice.pooja.technocredits;

public class StaticExample1 {
	
	static int num;
	int num1;
	
	void processData(int randomNumber) {
		num1 = num;
		num = num + randomNumber;
	}

	void display() {
		System.out.println(num1);
	}
}
