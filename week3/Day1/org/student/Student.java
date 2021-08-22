package week3.Day1.org.student;

import week3.Day1.org.department.Department;

public class Student extends Department{

	public void studenteName() {
		System.out.println(" Name of the Student ");
	}
	
	public void studentDept () {
		System.out.println(" Department of the Student  ");
	}
	
	public void studentId() {
		System.out.println(" ID of the Student ");
	}
	public static void main(String[] args) {
		
		Student obj1=new Student();
		//College
		obj1.collegeName();
		obj1.collegeCode();
		obj1.collegeRank();
		//Department
		obj1.departmentName();
		//Student
		obj1.studentId();
		obj1.studenteName();
		obj1.studentDept();
		
		
	}

}
