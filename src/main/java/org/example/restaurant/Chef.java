package org.example.restaurant;

public class Chef {
    public Dish cook(MenuItem menuItem) {
        return new Dish(menuItem);
    }
}
