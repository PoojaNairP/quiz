package com.example.review.StudentResponse;

import java.util.List;

public interface StudentResponse_Service {

	String createStudentResponse1(Long id);

	StudentResponse_Dto getStudentResponseById(Long id);

	List<StudentResponse_Dto> getAllStudentResponses(int page);

	String updateStudentResponse(Long id, StudentResponse_Dto dto);

	String createStudentResponse11(Long id);

	String createStudentResponse1(StudentResponse_Dto dto);

	String createStudentResponse(StudentResponse_Dto dto);

	String deleteStudentResponse(Long id);

	String createStudentResponse(Long id);

}
