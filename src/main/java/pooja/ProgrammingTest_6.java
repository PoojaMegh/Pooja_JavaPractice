/*Programming Test - 6 : 15th Jun'2023
Replace character by next character in sequence. 
String str = "t1zecHnZo";
output : u1zfdIoZp

String getProcessedInput(String input){

}
Note : digits & Z and z should not be replaced by any other character,  
*/
package pooja;

public class ProgrammingTest_6 {
	
	String getProcessedInput(String input){
		String output= "";
		
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(input.charAt(index)) == false && input.charAt(index)!= 'Z' && input.charAt(index)!= 'z') {
				ch++;
				output = output+Character.valueOf(ch);
			}
			else {
				output = output+Character.valueOf(ch);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "t1zecHnZo";
		System.out.println(new ProgrammingTest_6().getProcessedInput(input));
	}
}
