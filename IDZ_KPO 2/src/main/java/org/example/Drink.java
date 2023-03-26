package org.example;

import java.util.ArrayList;
import java.util.List;

public class Drink {
    private String name;
    private List<Ingredient> ingredients;
    private int price;

    public Drink(String name, List<Ingredient> ingredients, int price) {
        this.name = name;
        this.ingredients = new ArrayList<>(ingredients);
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredients() {
        return new ArrayList<>(ingredients);
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}
