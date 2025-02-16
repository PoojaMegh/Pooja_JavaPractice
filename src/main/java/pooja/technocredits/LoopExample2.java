package pooja.technocredits;

public class LoopExample2 {
	char ch = '-';
	
	void findFreqOfAllChar(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			int count = 0;
			for(int i=0;i<input.length();i++) {
				if(ch == input.charAt(i))
					count++;
			}
			System.out.println(ch + "-->" + count);
		}
	}
	
	public static void main(String[] args) {
		new LoopExample2().findFreqOfAllChar("technoctreditsttt");
	}
	
}
