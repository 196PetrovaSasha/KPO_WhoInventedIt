package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Dish> dishes;
    private List<Drink> drinks;

    public Order() {
        dishes = new ArrayList<>();
        drinks = new ArrayList<>();
    }

    // Метод, который позволяет добавить блюдо в заказ.
    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    // Метод, который позволяет добавить напиток в заказ.
    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    // Метод, который позволяет получить список блюд в заказе.
    public List<Dish> getDishes() {
        return dishes;
    }

    // Метод, который позволяет получить список напитков в заказе.
    public List<Drink> getDrinks() {
        return drinks;
    }
}
