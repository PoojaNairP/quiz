package com.example.review.Student;

public interface Student_Service 
{
	
	    String createStudent(Student_Dto dto);
	    Student_Dto getStudentData(Long id);
	    String deleteStudentData(Long id);
	    String updateStudentData(Long id, Student_Dto dto);
}



