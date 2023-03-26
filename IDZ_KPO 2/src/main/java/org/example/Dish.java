package org.example;

import java.util.List;

public class Dish {
    private String name;
    private List<Ingredient> ingredients;
    private int process;

    public Dish(String name, List<Ingredient> ingredients, int process) {
        this.name = name;
        this.ingredients = ingredients;
        this.process = process;
    }

    // Метод, который позволяет получить название блюда.
    public String getName() {
        return name;
    }

    // Метод, который позволяет получить список ингредиентов блюда.
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    // Метод, который позволяет получить информацию о процессе приготовления блюда.
    public int getProcess() {
        return process;
    }

    public List<TechnologicalOperation> getOperations() {
        return null;
    }
}
