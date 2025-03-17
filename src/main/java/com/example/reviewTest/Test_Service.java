package com.example.reviewTest;

import java.util.List;

public interface Test_Service
{
	String createTest(Test_Dto dto);
    Test_Dto getTestById(Long id);
    List<Test_Dto> getAllTests();
    String deleteTest(Long id);
    String updateTest(Long id, Test_Dto dto);
}
