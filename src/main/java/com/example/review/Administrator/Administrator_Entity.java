package com.example.review.Administrator;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Administrator")
public class Administrator_Entity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Admin_Id")
    private Long adminId;
    
    @Column(name = "Username", nullable = false)
    private String username;
    
    @Column(name = "Password", columnDefinition = "TEXT", nullable = false)
    private String password;
    
    @Column(name = "Email", nullable = false, unique = true)
    private String email;


}