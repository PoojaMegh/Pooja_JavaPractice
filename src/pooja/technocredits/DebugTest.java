package pooja.technocredits;

public class DebugTest {
	
	void processData(int iteration) {
		int sum = 0;
		for(int index=1;index<=iteration;index++) {
			sum = sum+index;
			if(sum + index > 13)
				break;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		System.out.println("Techno");
		DebugTest debugTest = new DebugTest();
		debugTest.processData(5);
	}
}
