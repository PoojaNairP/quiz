package com.example.review.StudentResponse;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
class StudentResponse_ServiceImpl implements StudentResponse_Service
{
    @Autowired
    private StudentResponse_Jpa repository;

    public String createStudentResponse(StudentResponse_Dto dto) {
        StudentResponse_Entity entity = new StudentResponse_Entity();
        entity.setResponse(dto.getResponse());
        entity.setStudentId(dto.getStudentId());
        entity.setQuestionId(dto.getQuestionId());
        repository.save(entity);
        return "Student Response Created Successfully";
    }

    @Override
    public StudentResponse_Dto getStudentResponseById(Long id) {
        return repository.findById(id).map(entity -> {
            StudentResponse_Dto dto = new StudentResponse_Dto();
            dto.setId(entity.getId());
            dto.setResponse(entity.getResponse());
            dto.setStudentId(entity.getStudentId());
            dto.setQuestionId(entity.getQuestionId());
            return dto;
        }).orElse(null);
    }

    @Override
    public List<StudentResponse_Dto> getAllStudentResponses(int page) {
        Pageable pageRequest = PageRequest.of(page-1, 5);
        return repository.findAll(pageRequest).stream().map(entity -> {
            StudentResponse_Dto dto = new StudentResponse_Dto();
            dto.setId(entity.getId());
            dto.setResponse(entity.getResponse());
            dto.setStudentId(entity.getStudentId());
            dto.setQuestionId(entity.getQuestionId());
            return dto;
        }).toList();
    }

    public String deleteStudentResponse(Long id) {
        repository.deleteById(id);
        return "Student Response Deleted Successfully";
    }

    @Override
    public String updateStudentResponse(Long id, StudentResponse_Dto dto) {
        return repository.findById(id).map(entity -> {
            entity.setResponse(dto.getResponse());
            entity.setStudentId(dto.getStudentId());
            entity.setQuestionId(dto.getQuestionId());
            repository.save(entity);
            return "Student Response Updated Successfully";
        }).orElse("Student Response Not Found");
    }

	@Override
	public String createStudentResponse1(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createStudentResponse11(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createStudentResponse(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createStudentResponse1(StudentResponse_Dto dto) {
		// TODO Auto-generated method stub
		return null;
	}
}
