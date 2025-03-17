package com.example.review.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Student_ServiceImpl 
{
    @Autowired
    Student_Jpa jpa;
    
    public String createStudent(Student_Dto dto) 
    {
        Student_Entity student = new Student_Entity();
        student.setUsername(dto.getUsername());
        student.setEmail(dto.getEmail());
        student.setPassword(dto.getPassword());
        jpa.save(student);
        return "Student created successfully";
    }

    public String updateStudentData(Long id, Student_Dto dto) {
        Student_Entity student = new Student_Entity();
        student.setUsername(dto.getUsername());
        student.setEmail(dto.getEmail());
        student.setPassword(dto.getPassword());
        jpa.save(student);
        return "Updated";
    }

    public Optional<Student_Entity> getStudentData(Long id) {
        return jpa.findById(id);
    }

    public String deleteStudentData(Long id) {
        jpa.deleteById(id);
        return "Deleted";
    }
}
