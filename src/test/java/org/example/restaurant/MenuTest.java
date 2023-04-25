package org.example.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuTest {

    @DisplayName("메뉴판에서 메뉴 이름에 해당하는 메뉴 반환")
    @Test
    void chooseTest() {
        Menu menu = new Menu(
                List.of(
                        new MenuItem("돈까스", 5000),
                        new MenuItem("냉면", 6000),
                        new MenuItem("라면", 7000)
                )
        );

        MenuItem menuItem = menu.choose("냉면");

        assertThat(menuItem).isEqualTo(new MenuItem("냉면", 6000));
    }

    @DisplayName("메뉴판에 없는 메뉴를 선택할 시 예외 반환")
    @Test
    void chooseTest2() {
        Menu menu = new Menu(
                List.of(
                        new MenuItem("돈까스", 5000),
                        new MenuItem("냉면", 6000),
                        new MenuItem("라면", 7000)
                )
        );

        assertThatCode(() -> menu.choose("국밥"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("존재하지 않는 메뉴입니다");
    }
}
