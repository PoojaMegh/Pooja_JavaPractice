/*	Write a class Student with attribute name, rno, age, city.
Write different comparator to sort students on name, rno, age and city.
*/

package javaProgramPractice.pooja;

public class Assignment46_Student {
	
	String name;
	Integer rno;
	Integer age;
	String city;
	
	public Assignment46_Student(Integer rno, Integer age, String name, String city) {
		super();
		this.name = name;
		this.rno = rno;
		this.age = age;
		this.city = city;
	}

	@Override
	public String toString() {
		return "\nName=" + name + ",\t RollNm=" + rno + ",\t Age=" + age + ",\t City=" + city;
	}
	
	
}
