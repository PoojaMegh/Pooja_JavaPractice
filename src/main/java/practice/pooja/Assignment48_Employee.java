/*
Write a class Employee with attribute name, empid, deptid.
Uniqueness : all attributes
Write a method to return unique set of Employees.
	
NOTE : override hashcode and equals method.
*/

package practice.pooja;

public class Assignment48_Employee {

	String name;
	int empId;
	String deptId;

	Assignment48_Employee(String name, int empId, String deptId) {
		this.name = name;
		this.empId = empId;
		this.deptId = deptId;
	}
	
	@Override
	public int hashCode() {
		return empId;
	}
	
	@Override
	public boolean equals(Object obj) {
		Assignment48_Employee emp = (Assignment48_Employee)obj;
		return emp.name.equals(this.name) && emp.empId == this.empId && emp.deptId.equals(this.deptId);
	}

	@Override
	public String toString() {
		return "\nEmployee ID = " + empId + ",\t Department ID = " + deptId + ",\t Name = " + name;
	}
}
