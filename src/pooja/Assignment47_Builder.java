/*
Write a class Builder with attribute name, yearsOfExp, city.
Write a comparable login on Builder class, which sort data on yearsOfExp.
Print builder information on Asc and Desc order. 
	
NOTE : for Desc order, you can use Collections.sort(al, Collections.reverseOrder());
*/

package pooja;

public class Assignment47_Builder implements Comparable<Assignment47_Builder>{
	
	String name;
	Integer yearsOfExp;
	String city;

	public Assignment47_Builder(Integer yearsOfExp, String name, String city) {
		super();
		this.name = name;
		this.yearsOfExp = yearsOfExp;
		this.city = city;
	}

	@Override
	public String toString() {
		return "\nExperience = " + yearsOfExp + ",\t Name=" + name + ",\t City=" + city;
	}

	@Override
	public int compareTo (Assignment47_Builder bldr) {
		return this.yearsOfExp.compareTo(bldr.yearsOfExp);
	}
	

}
