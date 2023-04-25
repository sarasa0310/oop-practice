package org.example.password;

import org.example.password.PasswordGenerator;

public class FixedPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "12345678";
    }
}
