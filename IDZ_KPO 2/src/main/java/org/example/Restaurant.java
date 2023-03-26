package org.example;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private List<Visitor> visitors;
    private Supervisor supervisor;
    private List<Chef> chefs;
    private Inventory inventory;
    private SelfServiceStation selfServiceStation;
    private Object List;

    public Restaurant() {
        visitors = new ArrayList<>();
        chefs = new ArrayList<>();
        inventory = new Inventory();
        selfServiceStation = new SelfServiceStation();
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void removeVisitor(Visitor visitor) {
        visitors.remove(visitor);
    }

    public void addChef(Chef chef) {
        chefs.add(chef);
    }

    public void removeChef(Chef chef) {
        chefs.remove(chef);
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public void receiveOrder(Order order) {
        supervisor.receiveOrder(order);
    }

    public void startCooking(Order order) {
        for (Dish dish : order.getDishes()) {
            List<TechnologicalOperation> operations = null;
            for (TechnologicalOperation operation : operations) {
                // Проверяем наличие ингредиентов на складе
                if (inventory.getProductQuantity(operation.getIngredient().getProduct()) < operation.getQuantity()) {
                    System.out.println("Недостаточно ингредиентов: " + operation.getIngredient().getName());
                    return;
                }
                // Проверяем наличие оборудования на кухне
                if (inventory.getEquipmentQuantity(operation.getEquipment()) < 1) {
                    System.out.println("Недостаточно оборудования: " + operation.getEquipment().getName());
                    return;
                }
            }
        }
        // Удаляем ингредиенты и оборудование со склада
        for (Dish dish : order.getDishes()) {
            Object TechnologicalOperation = null;
            List<TechnologicalOperation> operations = null;
            for (TechnologicalOperation operation : operations) {
                inventory.removeProducts(operation.getIngredient().getProduct(), operation.getQuantity());
                inventory.removeEquipment(operation.getEquipment(), 1);
            }
        }
        // Выдаем заказ на кухню
        for (Chef chef : chefs) {
            chef.receiveOrder(order);
        }
    }

    public void finishCooking(Order order) {
        selfServiceStation.deliverOrder(order);
    }

    public Object getInventory() {
        return null;
    }

    public Order getSupervisor() {
        return null;
    }

    public Object getSelfServiceStation() {
        return null;
    }

    static public Object addIngredient() {
        return null;
    }
}
