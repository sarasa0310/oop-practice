package org.example.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChefTest { // 요리사

    @DisplayName("메뉴에 해당하는 음식 조리")
    @Test
    void cookTest() {
        Chef chef = new Chef();

        MenuItem menuItem = new MenuItem("돈까스", 5000);

        Dish dish = chef.cook(menuItem);

        assertThat(dish).isEqualTo(new Dish("돈까스", 5000));
    }

}
