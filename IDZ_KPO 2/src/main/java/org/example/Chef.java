package org.example;

import java.util.List;

public class Chef {
    private String name;
    private Inventory inventory;

    public Chef(String name, Inventory inventory) {
        this.name = name;
        this.inventory = inventory;
    }

    public Chef(String name) {
        this.name = name;
    }

    public void prepareDish(Dish dish) {
        Process process = new Process((List<TechnologicalOperation>) dish);
        for (TechnologicalOperation operation : process.getOperations()) {
        }
        process.start();
    }

    public String getName() {
        return name;
    }

    public void startCooking() {

    }

    public void doOperation(TechnologicalOperation operation) {

    }

    public boolean canDoOperation(TechnologicalOperation operation) {
        return false;
    }

    public boolean hasFreeResources() {
        return false;
    }

    public void receiveOrder(Order order) {

    }
}
