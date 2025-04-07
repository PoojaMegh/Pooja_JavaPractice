/*Program-1.Create a method to print all characters of given input in reverse order.
input : techno
output : o
              n
	      h
	      c
	      e
	      t
Hint:
void reversePrint(String input){

}*/

package practice.string;

public class StringReverse {

	void reversePrint(String str) {
		for (int index = str.length()-1; index >= 0; index--) {
			System.out.println(str.charAt(index));
		}
	}

	public static void main(String[] args) {
		StringReverse stringReverse = new StringReverse();
		stringReverse.reversePrint("techno");
	}
}
