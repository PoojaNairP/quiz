package com.example.review.Administrator;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Administartor_ServiceImpl implements Administrator_Service {
    
    @Autowired
    Administrator_Jpa jpa;
    
    @Override
    public String createAdministrator(Administrator_Dto dto) {
        Administrator_Entity admin = new Administrator_Entity();
        admin.setUsername(dto.getUsername());
        admin.setEmail(dto.getEmail());
        admin.setPassword(dto.getPassword());
        jpa.save(admin);
        return "Administrator created successfully";
    }

    @Override
    public Administrator_Dto getAdministratorData(Long id) {
        Optional<Administrator_Entity> adminEntity = jpa.findById(id);
        if (adminEntity.isPresent()) {
            Administrator_Entity admin = adminEntity.get();
            Administrator_Dto data = new Administrator_Dto();
            data.setAdminId(admin.getAdminId());
            data.setUsername(admin.getUsername());
            data.setEmail(admin.getEmail());
            data.setPassword(admin.getPassword());
            return data;
        }
        return null;
    }
        
    @Override
    public String deleteAdministratorData(Long id) {
        if (jpa.existsById(id)) {
            jpa.deleteById(id);
            return "Administrator deleted successfully";
        }
        return "Administrator not found";
    }

    @Override
    public String updateAdministratorData(Long id, Administrator_Dto dto) {
        Optional<Administrator_Entity> existingAdmin = jpa.findById(id);
        if (existingAdmin.isPresent()) {
            Administrator_Entity admin = existingAdmin.get();
            admin.setUsername(dto.getUsername());
            admin.setEmail(dto.getEmail());
            admin.setPassword(dto.getPassword());
            jpa.save(admin);
            return "Administrator updated successfully";
        }
        return "Administrator not found";
    }
}
