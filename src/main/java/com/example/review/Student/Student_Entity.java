package com.example.review.Student;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Student")
public class Student_Entity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Student_Id")
    private Long studentId;

    @Column(name = "Username", nullable = false)
    private String username;

    @Column(name = "Password", columnDefinition = "TEXT", nullable = false)
    private String password;

    @Column(name = "Email", nullable = false, unique = true)
    private String email;

}
