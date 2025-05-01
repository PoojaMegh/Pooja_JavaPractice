package javaProgramPractice.pooja;

import java.util.Comparator;

public class Assignment46_CityComparator implements Comparator<Assignment46_Student> {

	@Override
	public int compare(Assignment46_Student std1, Assignment46_Student std2) {
		return std1.city.compareTo(std2.city);
	}
}
