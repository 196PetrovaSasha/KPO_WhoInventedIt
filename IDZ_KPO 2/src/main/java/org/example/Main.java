package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Создание ресторана и добавление сотрудников
        Restaurant restaurant = new Restaurant();
        Supervisor supervisor = new Supervisor();
        restaurant.setSupervisor(supervisor);
        Chef chef1 = new Chef("Chef 1");
        Chef chef2 = new Chef("Chef 2");
        restaurant.addChef(chef1);
        restaurant.addChef(chef2);

        // Создание посетителей и добавление их в ресторан
        Visitor visitor1 = new Visitor("Visitor 1");
        Visitor visitor2 = new Visitor("Visitor 2");
        restaurant.addVisitor(visitor1);
        restaurant.addVisitor(visitor2);

        // Создание ингредиентов и добавление их на склад
        Ingredient ingredient1 = new Ingredient("Tomato", 10);
        Ingredient ingredient2 = new Ingredient("Cheese", 5);
        Ingredient ingredient3 = new Ingredient("Flour", 20);
        Ingredient ingredient4 = new Ingredient("Sugar", 15);
        restaurant.getInventory().toString();

        // Создание блюд и добавление их в меню ресторана
        List<Ingredient> pizzaIngredients = new ArrayList<>();
        pizzaIngredients.add(ingredient1);
        pizzaIngredients.add(ingredient2);
        pizzaIngredients.add(ingredient3);
        Dish pizza = new Dish("Pizza", pizzaIngredients, 10);
        restaurant.getSupervisor().addDish(pizza);

        List<Ingredient> cakeIngredients = new ArrayList<>();
        cakeIngredients.add(ingredient3);
        cakeIngredients.add(ingredient4);
        Dish cake = new Dish("Cake", cakeIngredients, 5);
        restaurant.getSupervisor().addDish(cake);

        // Посетители делают заказы через приложение
        Order order1 = new Order();
        order1.addDish(pizza);
        order1.addDish(cake);
        visitor1.makeOrder(order1);

        Order order2 = new Order();
        order2.addDish(pizza);
        visitor2.makeOrder(order2);

        // Повара начинают приготовление блюд
        chef1.startCooking();
        chef2.startCooking();


        // Блюда готовы и доставляются посетителям через самообслуживание
        restaurant.getSelfServiceStation().wait();
        restaurant.getSelfServiceStation().wait();
    }
}


