package com.cwa.advanced.parameterizedtests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class UserValidationServiceTest {

    private final UserValidationService validationService = new UserValidationService();

    @ParameterizedTest(name = "{index}: {0} should return true")
    @ValueSource(strings = {"Levi", "Robert", "Alex"})
    void validateUserShouldReturnTrue(String username) {
        assertTrue(validationService.validateUsername(username));
    }

    @ParameterizedTest(name = "{index}: {0} should return false")
    @ValueSource(strings = {" ", "@", "sdjhfozshdfiouhefriougzefigizeuhdfizueghfdizegfiuzefgdiuzfgd"})
    void validateUserShouldReturnFalse(String username) {
        assertFalse(validationService.validateUsername(username));
        assertFalse(validationService.validateUsername(username));
    }

    @ParameterizedTest(name = "{index}: {0} should return {1}")
    @CsvSource({
            "valid@email.com,true",
            "invalid.email,false",
            "user@domain.co.uk,true",
            "'',false",
            "missing@domain,false"
    })
    void validateEmailShouldReturnExpected(String email, boolean expected) {
        assertEquals(expected, validationService.validateEmail(email));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/password.csv", numLinesToSkip = 1)
    void validatePasswordShouldReturnExpected(String password, boolean expected) {
        assertEquals(expected, validationService.validatePassword(password));
    }

    static List<Integer> ages = List.of(19, 34, 67, 54);

    @ParameterizedTest(name = "{index}: {0} should return true")
    @FieldSource("ages")
    void validateAgeShouldReturnTrue(int age) {
        assertTrue(validationService.validateAge(age));
    }

    @ParameterizedTest(name = "{index}: {0} should return {1}")
    @MethodSource("userProvider")
    void registerUserShouldReturnExpected(User user, boolean expected) {
        assertEquals(expected, validationService.registerUser(user));
    }

    static Stream<Arguments> userProvider() {
        return Stream.of(
                arguments(new User("Levi", "levi@gmail.com", "StrongPass123", 25, Role.USER), true),
                arguments(new User("Invalid User", "levigmail.com", "weak", 10, Role.GUEST), false),
                arguments(new User("", "", "", 0, Role.GUEST), false)



        );
    }
}