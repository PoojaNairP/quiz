package com.example.review.StudentResponse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentResponse_Jpa extends JpaRepository<StudentResponse_Entity, Long>
{

//	String createStudentResponse(StudentResponse_Dto dto);
	
	
	 

}
