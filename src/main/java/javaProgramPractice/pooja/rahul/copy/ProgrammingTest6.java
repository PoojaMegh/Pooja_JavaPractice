/*Programming Test - 6 : 15th Jun'2023
Replace character by next character in sequence. 
String str = "t1zecHnZo";
output : u1zfdIoZp

String getProcessedInput(String input){

}
Note : digits & Z and z should not be replaced by any other character, */

package javaProgramPractice.pooja.rahul.copy;

public class ProgrammingTest6 {

	String getProcessedString(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.charAt(index) != 'Z' && str.charAt(index) != 'z' && Character.isDigit(str.charAt(index)) == false) {
				ch++;
				output = output + Character.valueOf(ch);
			} else {
				output = output + Character.valueOf(ch);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "t1zecHnZo";
		String processed = new ProgrammingTest6().getProcessedString(str);
		System.out.println(processed);
	}
}