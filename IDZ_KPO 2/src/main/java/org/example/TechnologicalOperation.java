package org.example;

import com.sun.media.sound.SF2Soundbank;

import java.util.List;

public class TechnologicalOperation {
    private String name;
    private List<Inventory> inventories;

    public TechnologicalOperation(String name, List<Inventory> inventories) {
        this.name = name;
        this.inventories = inventories;
    }

    // Метод, который позволяет получить название технологической операции.
    public String getName() {
        return name;
    }

    // Метод, который позволяет получить список ресурсов, необходимых для выполнения технологической операции.
    public List<Inventory> getInventories() {
        return inventories;
    }

    public SF2Soundbank getIngredient() {
        return null;
    }

    public Equipment getEquipment() {
        return null;
    }

    public int getQuantity() {
        return 0;
    }
}
