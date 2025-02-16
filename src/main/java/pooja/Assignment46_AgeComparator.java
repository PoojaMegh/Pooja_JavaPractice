package pooja;

import java.util.Comparator;

public class Assignment46_AgeComparator implements Comparator<Assignment46_Student>{

	@Override
	public int compare(Assignment46_Student std1, Assignment46_Student std2) {
		return std1.age.compareTo(std2.age);			
	}

}
