package org.example.restaurant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CustomerTest {

    @DisplayName("메뉴 이름에 해당하는 요리를 주문")
    @Test
    void orderTest() {
        Customer customer = new Customer();

        List<MenuItem> menuItems = List.of(
                new MenuItem("돈까스", 5000),
                new MenuItem("냉면", 6000),
                new MenuItem("라면", 7000)
        );

        Menu menu = new Menu(menuItems);

        Chef chef = new Chef();

        assertThatCode(() -> customer.order("돈까스", menu, chef))
                .doesNotThrowAnyException();
    }

}
