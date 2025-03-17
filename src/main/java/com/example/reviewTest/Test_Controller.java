package com.example.reviewTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Controller
@RestController
@CrossOrigin(allowedHeaders = "*")
@RequestMapping("/test")

public class Test_Controller 
{
	 @Autowired
	    private Test_Service service;
	    
	    @PostMapping("/create")
	    public String createTest(@RequestBody Test_Dto dto) {
	        return service.createTest(dto);
	    }
	    
	    @GetMapping("/get/{id}")
	    public Test_Dto getTestById(@PathVariable Long id) {
	        return service.getTestById(id);
	    }
	    
	    @GetMapping("/all")
	    public List<Test_Dto> getAllTests() {
	        return service.getAllTests();
	    }
	    
	    @DeleteMapping("/delete/{id}")
	    public String deleteTest(@PathVariable Long id) {
	        return service.deleteTest(id);
	    }
	    
	    @PutMapping("/update/{id}")
	    public String updateTest(@PathVariable Long id, @RequestBody Test_Dto dto) {
	        return service.updateTest(id, dto);
	    }
}
