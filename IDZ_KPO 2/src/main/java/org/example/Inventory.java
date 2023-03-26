package org.example;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> products;
    private Map<Equipment, Integer> equipments;

    public Inventory() {
        products = new HashMap<String, Integer>();
        equipments = new HashMap<>();
    }

    // Метод, который добавляет продукты в инвентарь.
    public void addProducts(String product, int quantity) {
        int currentQuantity = products.getOrDefault(product, 0);
        products.put(product, currentQuantity + quantity);
    }

    // Метод, который удаляет продукты из инвентаря.
    public boolean removeProducts(String product, int quantity) {
        int currentQuantity = products.getOrDefault(product, 0);
        if (currentQuantity >= quantity) {
            products.put(product, currentQuantity - quantity);
            return true;
        } else {
            return false;

        }
    }

    // Метод, который добавляет оборудование в инвентарь.
    public void addEquipment(Equipment equipment, int quantity) {
        int currentQuantity = equipments.getOrDefault(equipment, 0);
        equipments.put(equipment, currentQuantity + quantity);
    }

    // Метод, который удаляет оборудование из инвентаря.
    public boolean removeEquipment(Equipment equipment, int quantity) {
        int currentQuantity = equipments.getOrDefault(equipment, 0);
        if (currentQuantity >= quantity) {
            equipments.put(equipment, currentQuantity - quantity);
            return true;
        } else {
            return false;
        }
    }

    // Метод, который возвращает количество продуктов на складе.
    public int getProductQuantity(String product) {
        return products.getOrDefault(product, 0);
    }

    // Метод, который возвращает количество оборудования на складе.
    public int getEquipmentQuantity(Equipment equipment) {
        return equipments.getOrDefault(equipment, 0);
    }
}
