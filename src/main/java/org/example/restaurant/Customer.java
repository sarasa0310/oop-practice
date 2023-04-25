package org.example.restaurant;

public class Customer {
    public Dish order(String dishName, Menu menu, Chef chef) {
        MenuItem menuItem = menu.choose(dishName);

        return chef.cook(menuItem);
    }
}
