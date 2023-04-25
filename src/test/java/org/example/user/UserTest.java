package org.example.user;

import org.example.user.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @DisplayName("패스워드 초기화 테스트")
    @Test
    void initPasswordTest() {
        // given
        User user = new User();

        // when
//        user.initPassword(new FixedPasswordGenerator());
        user.initPassword(() -> "123456789");

        // then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("잘못된 패스워드 초기화 테스트")
    @Test
    void initPasswordTest2() {
        // given
        User user = new User();

        // when
//        user.initPassword(new WrongPasswordGenerator());
        user.initPassword(() -> "1234567");

        // then
        assertThat(user.getPassword()).isNull();
    }
}