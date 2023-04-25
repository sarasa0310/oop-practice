package org.example.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class DishTest {

    @DisplayName("요리 생성")
    @Test
    void createTest() {
        assertThatCode(() -> new Dish("만두", 5000))
                .doesNotThrowAnyException();
    }

}
