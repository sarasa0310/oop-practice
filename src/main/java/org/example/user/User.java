package org.example.user;

import org.example.password.PasswordGenerator;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        /* as-is 강한 결합
        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String randomPassword = randomPasswordGenerator.generatePassword();
         */

        // to-be 인터페이스를 활용한 느슨한 결합
        String randomPassword = passwordGenerator.generatePassword();

        if (randomPassword.length() >= 8) {
            this.password = randomPassword;
        }
    }

    public String getPassword() {
        return password;
    }
}
