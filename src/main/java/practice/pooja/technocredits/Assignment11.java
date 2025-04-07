package practice.pooja.technocredits;

public class Assignment11 {
	
	void findCharFreq(String input) {
		int count = 0;
		char ch = 'p';
		boolean f1 = false;
		boolean f2 = true;
		
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index) == 't' || input.charAt(index) == 'T') {
				count++;
				System.out.println("Found t at index -->" + index + ", now total t is "+ count);
			}
			//System.out.println(count);
		}
		System.out.println("Finally we have total, " + count);
	}
	
	
	public static void main(String[] args) {
		String str = "TechnocrteTditst";
		Assignment11 assignment11 = new Assignment11();
		assignment11.findCharFreq(str);
	}
}
