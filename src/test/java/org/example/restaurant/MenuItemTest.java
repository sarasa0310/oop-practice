package org.example.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuItemTest {

    @DisplayName("메뉴 항목 생성")
    @Test
    void createTest() {
        assertThatCode(() -> new MenuItem("냉면", 8000))
                .doesNotThrowAnyException();
    }
}
