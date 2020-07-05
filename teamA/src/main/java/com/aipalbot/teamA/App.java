package com.aipalbot.teamA;

import java.util.Scanner;

import com.aipalbot.teamA.model.Student;
import com.aipalbot.teamA.services.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Student First Name");
        String studentFirstName = input.nextLine();
        
        Scanner input1 = new Scanner(System.in);
        
        
        System.out.println("Enter Student Last Name");
        String studentLastName = input1.nextLine();
        
        System.out.println("Enter Student Id No");
        String studentId= input.nextLine();
        
        System.out.println("Enter Student Level");
        String studentLevel = input.nextLine();
        
        System.out.println("Enter Student Department");
        String studentDepartment = input.nextLine();
        
        System.out.println("Enter Student Course");
        String studentCourse = input.nextLine();
        
        
        StudentService studentService = new StudentService();
        
        Student newStudent = studentService.registrationStudent(studentFirstName, studentLastName, studentId, studentDepartment, studentLevel, studentCourse);
        
       System.out.println(studentService.learn(newStudent));
        
        
        
        
        
    	}
}