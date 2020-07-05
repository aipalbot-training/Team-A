package com.aipalbot.teamA.services;

//student identification
import com.aipalbot.teamA.model.Student;
public class StudentService {
	
	public String learn(Student student) {
		
		String response ="My name is :"  +  student.getFirstName() + " " +   student.getLastName()  +   " I am in "  +  student.getLevel() + " "  +  " study "   +   student.getDepartment()   +   " my Id number is"  + " " +   student.getIdNumber()   +   " with my course code "   +  student.getCourses() ;
		
		return response;
		
	}
	
	public Student registrationStudent(String firstName, String lastName, String idNumber,String department, String level, String courses) {
	
		
		Student  student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setIdNumber(idNumber);
		student.setDepartment(department);
		student.setLevel(level);
		student.setCourses(courses);
		
		
return student;
	}

}
