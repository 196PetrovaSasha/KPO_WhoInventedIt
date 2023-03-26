package org.example;

public class Ingredient {
    private String name;
    private int amount;

    public Ingredient(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    // Метод, который позволяет получить название ингредиента.
    public String getName() {
        return name;
    }

    // Метод, который позволяет получить количество ингредиента.
    public int getAmount() {
        return amount;
    }

    // Метод, который позволяет установить количество ингредиента.
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
