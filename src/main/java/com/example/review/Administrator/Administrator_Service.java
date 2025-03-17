package com.example.review.Administrator;

public interface Administrator_Service {
    String createAdministrator(Administrator_Dto dto);
    Administrator_Dto getAdministratorData(Long id);
    String deleteAdministratorData(Long id);
    String updateAdministratorData(Long id, Administrator_Dto dto);
}