package org.example;

import java.util.List;

public class Supervisor {
    private List<Chef> cooks;

    public Supervisor(List<Chef> cooks) {
        this.cooks = cooks;
    }

    public Supervisor(){};

    // Метод, который начинает процесс приготовления блюд.
    public void startCooking(Order order) {
        // Проходимся по всем блюдам в заказе.
        for (Dish dish : order.getDishes()) {
            // Получаем список технологических операций, необходимых для приготовления блюда.
            List<TechnologicalOperation> operations = dish.getOperations();

            // Проходимся по всем технологическим операциям для блюда.
            for (TechnologicalOperation operation : operations) {
                // Находим повара, который может выполнить эту операцию.
                Chef cook = findAvailableCook(operation);

                // Если повар найден, то запускаем операцию для блюда.
                if (cook != null) {
                    cook.doOperation(operation);
                } else {
                    // Если повар не найден, то выводим сообщение об ошибке.
                    System.out.println("Нет свободных поваров для выполнения операции " + operation.getName());
                }
            }
        }
    }

    // Метод, который ищет свободного повара, который может выполнить заданную технологическую операцию.
    private Chef findAvailableCook(TechnologicalOperation operation) {
        // Проходимся по всем поваром в списке.
        for (Chef cook : cooks) {
            // Если повар может выполнить операцию и у него есть свободные ресурсы, то возвращаем его.
            if (cook.canDoOperation(operation) && cook.hasFreeResources()) {
                return cook;
            }
        }

        // Если свободного повара не найдено, то возвращаем null.
        return null;
    }

    public void receiveOrder(Order order) {
    }
}
