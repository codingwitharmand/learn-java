package com.cwa.advanced.parameterizedtests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserTest {

    @ParameterizedTest
    @EnumSource(Role.class)
    @DisplayName("SHOULD TEST HAS PERMISSION")
    void testHasPermission(Role role) {
        var user = User.builder()
                .role(role)
                .build();

        switch (role) {
            case ADMIN:
                assertTrue(user.hasPermission("DELETE"), "Admins should have DELETE permission");
                assertTrue(user.hasPermission("READ"), "Admins should have DELETE permission");
                break;
            case USER:
                assertTrue(user.hasPermission("READ"), "Users should have READ permission");
                assertFalse(user.hasPermission("DELETE"), "Users should have DELETE permission");
                break;
            case GUEST:
                assertTrue(user.hasPermission("READ"), "Guests should have READ permission");
                assertFalse(user.hasPermission("DELETE"), "Guests should have DELETE permission");
                break;
        }
    }
}