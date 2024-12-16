package com.cwa.advanced.parameterizedtests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private String username;
    private String email;
    private String password;
    private int age;
    private Role role;

    public boolean hasPermission(String permission) {
        return switch (role) {
            case ADMIN -> true;
            case USER -> !permission.equals("DELETE");
            case GUEST -> permission.equals("READ");
        };
    }
}
