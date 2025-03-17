package com.example.reviewTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Test_ServiceImpl 
{
	@Autowired
    private Test_Jpa repository;

    public String createTest(Test_Dto dto)
    {
        Test_Entity entity = new Test_Entity();
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        repository.save(entity);
        return "Test Created Successfully";

}
}
