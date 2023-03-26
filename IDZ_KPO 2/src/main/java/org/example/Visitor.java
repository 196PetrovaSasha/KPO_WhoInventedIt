package org.example;

public class Visitor {
    private String name;
    private Order order;

    public Visitor(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public Order getOrder() {
        return order;
    }

    public void makeOrder(Order order1) {

    }
}
