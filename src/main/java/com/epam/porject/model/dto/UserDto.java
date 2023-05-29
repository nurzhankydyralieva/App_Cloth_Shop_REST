package com.epam.porject.model.dto;

import com.epam.porject.model.enums.Role;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private Role role;
}
