/*Programming test - 5 : 30th May

return count of visible tree in given array.

int[] arr = {3,5,4,9,7,8}
output : 3*/

package pooja.rahul;

public class ProgrammingTest5 {

	int treeVisibility(int[] i) {
		int count = 1;
		int maxHeightTree = i[0];
		for (int index = 0; index < i.length; index++) {
			if (i[index] > maxHeightTree) {
				count++;
				maxHeightTree = i[index];
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] input = { 3, 5, 4, 9, 7, 8 };
		ProgrammingTest5 tree = new ProgrammingTest5();
		int visibleTrees = tree.treeVisibility(input);
		System.out.println("Total visible trees are " + visibleTrees);
	}
}