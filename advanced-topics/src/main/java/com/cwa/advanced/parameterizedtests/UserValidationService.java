package com.cwa.advanced.parameterizedtests;

import java.util.Objects;
import java.util.regex.Pattern;

public class UserValidationService {

    private static final int MIN_LENGTH = 3;
    private static final int MAX_LENGTH = 20;
    private static final int MIN_AGE = 13;
    private static final int MAX_AGE = 120;

    public boolean validateUsername(String username) {
        if (Objects.isNull(username)) return false;
        return username.length() >= MIN_LENGTH &&
                username.length() <= MAX_LENGTH &&
                Pattern.matches("^[a-zA-Z0-9_-]+$", username);
    }

    public boolean validateEmail(String email) {
        if (email == null) return false;
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(emailRegex, email);
    }

    public boolean validatePassword(String password) {
        if (Objects.isNull(password)) return false;
        return password.length() >= 8 &&
                Pattern.matches(".*[A-Z].*", password) &&
                Pattern.matches(".*[a-z].*", password) &&
                Pattern.matches(".*\\d.*", password);
    }

    public boolean validateAge(int age) {
        return age >= MIN_AGE && age <= MAX_AGE;
    }

    public boolean registerUser(User user) {
        return validateUsername(user.getUsername()) &&
                validateEmail(user.getEmail()) &&
                validatePassword(user.getPassword()) &&
                validateAge(user.getAge());
    }
}
