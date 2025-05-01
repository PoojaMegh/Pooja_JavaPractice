package javaProgramPractice.pooja.technocredits;

public class FindAllCharFreq {

	void printFreqOfChar(String str, char ch) {
		int count=0;
		for(int index=0;index<str.length();index++){
			if(ch == str.charAt((index)))
				count++;
		}
		System.out.println(ch + "->" + count);
	}
	
	void displayFreqOfAllChar(String abc) {
		while(abc.length()>0){
			char ch = abc.charAt(0);
			printFreqOfChar(abc,ch);
			abc = abc.replace(String.valueOf(ch),"");
		}
	}
	
	void printFreqOfAllChar(String str) {
		while(str.length()>0){
			char ch = str.charAt(0);
			int count=0;
			for(int index=0;index<str.length();index++){
				if(ch == str.charAt((index)))
					count++;
			}
			System.out.println(ch + "->" + count);
			str = str.replace(String.valueOf(ch),"");
		}
	}
	
	public static void main(String[] a) {
		String input = "technttttttocredits";
		FindAllCharFreq findAllCharFreq = new FindAllCharFreq();
		findAllCharFreq.printFreqOfChar(input,'t');
		findAllCharFreq.displayFreqOfAllChar(input);
		findAllCharFreq.printFreqOfAllChar(input);
	}
}
