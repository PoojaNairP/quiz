package com.example.review.StudentResponse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(allowedHeaders = "*")
@RequestMapping("/student-response")
public class StudentResponse_Controller {
    
    @Autowired
    StudentResponse_Service service;
    
    @PostMapping("/create")
    public String createStudentResponse(@RequestBody StudentResponse_Dto dto) {
        return service.createStudentResponse(dto);
    }
    
    @GetMapping("/get/{id}")
    public StudentResponse_Dto getStudentResponseById(@PathVariable Long id) {
        return service.getStudentResponseById(id);
    }
    
    @GetMapping("/all")
    public List<StudentResponse_Dto> getAllStudentResponses(@RequestParam int page) {
        return service.getAllStudentResponses(page);
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteStudentResponse(@PathVariable Long id) {
        return service.createStudentResponse1(id);
    }
    
    @PutMapping("/update/{id}")
    public String updateStudentResponse(@PathVariable Long id, @RequestBody StudentResponse_Dto dto) {
        return service.updateStudentResponse(id, dto);
    }
}
