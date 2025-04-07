package practice.pooja;

import java.util.HashSet;

public class Assignment48_EmployeeDetails {

	public static void main(String[] args) {
		HashSet<Assignment48_Employee> setOfEmployee = new HashSet<Assignment48_Employee>();

		setOfEmployee.add(new Assignment48_Employee("Pooja", 1007, "IT-001"));
		setOfEmployee.add(new Assignment48_Employee("Pooja", 1007, "IT-001"));
		setOfEmployee.add(new Assignment48_Employee("Megh", 1025, "IT-001"));
		setOfEmployee.add(new Assignment48_Employee("Techno", 1010, "FN-003"));
		setOfEmployee.add(new Assignment48_Employee("Krishna", 1015, "FN-003"));
		setOfEmployee.add(new Assignment48_Employee("Maulik",  1025, "HR-004"));
		setOfEmployee.add(new Assignment48_Employee("Maulik",  1025, "HR-004"));
		
		System.out.println(setOfEmployee);
		System.out.println("\nTotal No. of Emplyees : " + setOfEmployee.size());
	}
}
