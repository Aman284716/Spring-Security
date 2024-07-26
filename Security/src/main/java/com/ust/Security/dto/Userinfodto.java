package com.ust.Security.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Userinfodto {
    private String name;
    private String email;
    private String role;
    private String password;
}
