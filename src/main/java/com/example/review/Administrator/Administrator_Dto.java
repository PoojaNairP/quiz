package com.example.review.Administrator;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class Administrator_Dto {
    // TODO Auto-generated method stub

    private Long adminId;
    private String username;
    private String password;
    private String email;

}
