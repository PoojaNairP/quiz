package com.example.review.Administrator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin(allowedHeaders = "*")
@RequestMapping("/administrator") 
public class Administrator_Controller {
    
    @Autowired
    Administrator_Service service;
    
    @PostMapping("/create")
    public String createAdministrator(@RequestBody Administrator_Dto dto) {
        return service.createAdministrator(dto);
    }
    
    @GetMapping("/get/{id}")
    public Administrator_Dto getAdministratorData(@PathVariable Long id) {
        return service.getAdministratorData(id);
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteAdministratorData(@PathVariable Long id) {
        return service.deleteAdministratorData(id);
    }
    
    @PutMapping("/update/{id}")
    public String updateAdministratorData(@PathVariable Long id, @RequestBody Administrator_Dto dto) {
        return service.updateAdministratorData(id, dto);
    }
}
