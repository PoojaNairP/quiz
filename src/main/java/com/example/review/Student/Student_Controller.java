package com.example.review.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class Student_Controller
{
	
	
	    
	    @Autowired
	    Student_ServiceImpl service;
	    
	    @PostMapping("/create")
	    public String createStudent(@RequestBody Student_Dto dto) {
	        return service.createStudent(dto);
	    }
	    
	    @GetMapping("/get/{id}")
	    public Optional<Student_Entity> getStudentData(@PathVariable Long id) {
	        return service.getStudentData(id);
	    }
	    
	    @DeleteMapping("/delete/{id}")
	    public String deleteStudentData(@PathVariable Long id) {
	        return service.deleteStudentData(id);
	    }
	    
	    @PutMapping("/update/{id}")
	    public String updateStudentData(@PathVariable Long id, @RequestBody Student_Dto dto) {
	        return service.updateStudentData(id, dto);
	    }
	}



