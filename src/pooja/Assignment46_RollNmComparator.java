package pooja;

import java.util.Comparator;

public class Assignment46_RollNmComparator implements Comparator<Assignment46_Student>{

	@Override
	public int compare(Assignment46_Student std1, Assignment46_Student std2) {
		return std1.rno.compareTo(std2.rno);			
	}
}
